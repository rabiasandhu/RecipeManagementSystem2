/*
Author: Rabia kaur
ID: 12093838
Unit: Software Engineering 
Unit Code: COIT20258
*/

package recipes.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;
import java.util.ArrayList;

//Class to connect application with database, setting and retrieving data
public class RecipeQueries {
    private final String PASSWORD = "password";
    private final String URL = "jdbc:derby://localhost:1527/recipesystem";
    private final String USERNAME = "username";
    private Connection connection;
    
    private PreparedStatement countRecipesWithMainIngredient = null;
    private PreparedStatement insertNewRecipe = null;
    private PreparedStatement selectRecipesForCategory = null;
    private PreparedStatement selectRecipesForCategoryAndCookingTime = null;
    private PreparedStatement selectRecipesForCategoryAndPreparationTime = null;
    
    
    public RecipeQueries(){
        try {
            //Connecting with databse
            connection = DriverManager.getConnection(this.URL, this.USERNAME, this.PASSWORD );
            
            //Implementing queries
            selectRecipesForCategory = connection.prepareStatement("SELECT * FROM RECIPES WHERE CATEGORY = ?");
            selectRecipesForCategoryAndPreparationTime = connection.prepareStatement("SELECT * FROM RECIPES WHERE CATEGORY = ? AND PREPARATIONTIME = ?");
            selectRecipesForCategoryAndCookingTime = connection.prepareStatement("SELECT * FROM RECIPES WHERE CATEGORY = ? AND (PREPARATIONTIME+COOKINGTIME) = ?");
            insertNewRecipe = connection.prepareStatement("INSERT INTO RECIPES (RECIPENAME,CATEGORY,MAININGREDIENT,PREPARATIONTIME,COOKINGTIME) VALUES (?, ?, ?, ?, ?)");
            countRecipesWithMainIngredient = connection.prepareStatement("SELECT * FROM RECIPES WHERE MAININGREDIENT = ?");
        
        } catch (SQLException ex) {
            Logger.getLogger(RecipeQueries.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Method to get create recipes from result set
    private Recipe createRecipe(ResultSet rs) throws SQLException{
        return new Recipe(rs.getInt("id"), 
                          rs.getString("recipename"), 
                          rs.getString("category"), 
                          rs.getString("mainingredient"), 
                          rs.getInt("preparationtime"), 
                          rs.getInt("cookingtime"));
    } 
    
    
    //Method to add recipe in database
    public int addRecipe(String n, String c, String mi, int pt, int ct) throws SQLException{
        insertNewRecipe.setString(1, n);
        insertNewRecipe.setString(2, c);
        insertNewRecipe.setString(3, mi);
        insertNewRecipe.setInt(4, pt);
        insertNewRecipe.setInt(5, ct);
        
        return  insertNewRecipe.executeUpdate();
    }

    //Method to get recipe for particular category
    public List<Recipe> getRecipesForCategory(String c)  throws java.sql.SQLException { 
        List<Recipe> results;
        selectRecipesForCategory.setString(1, c);
        try( ResultSet resultSet = selectRecipesForCategory.executeQuery();){
            results = new ArrayList<>();
            while ( resultSet.next() )
                results.add( createRecipe( resultSet ) );
           }
        return results;
    }

    //Method to get recipe for particular category and processing time
    public List< Recipe > getRecipesForCategoryAndProcessingTime(String c, int t1, int t2) {
        List<Recipe> results = new ArrayList<>();
        for(int i = t1; i <= t2 ; i++){
            try{
                selectRecipesForCategoryAndPreparationTime.setString(1, c);
                selectRecipesForCategoryAndPreparationTime.setInt(2, i);
                try( ResultSet resultSet = selectRecipesForCategoryAndPreparationTime.executeQuery();){
                    while ( resultSet.next() )
                        results.add( createRecipe( resultSet ) );
                } catch (SQLException ex) {
                    Logger.getLogger(RecipeQueries.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(RecipeQueries.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        return results;
    }

    
    //Method to get recipe for particular main ingredient
    public List< Recipe > getNumberOfRecipesUsingMainIngredient(String mi) throws SQLException {
        List<Recipe> results;
        countRecipesWithMainIngredient.setString(1, mi);
        try( ResultSet resultSet = countRecipesWithMainIngredient.executeQuery();){
            results = new ArrayList<>();
            while ( resultSet.next() )
                results.add( createRecipe( resultSet ) );
           }
        return results;
    } 

    //Method to get recipe for particular category and combined time
    public List< Recipe > getRecipesForCategoryAndCombinedTime(String c, int t1, int t2)  throws SQLException {
        List<Recipe> results = new ArrayList<>();
        for(int i = t1; i <= t2 ; i++){
            try{
                selectRecipesForCategoryAndCookingTime.setString(1, c);
                selectRecipesForCategoryAndCookingTime.setInt(2, i);
                try( ResultSet resultSet = selectRecipesForCategoryAndCookingTime.executeQuery();){
                    while ( resultSet.next() )
                        results.add( createRecipe( resultSet ) );
                } catch (SQLException ex) {
                    Logger.getLogger(RecipeQueries.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(RecipeQueries.class.getName()).log(Level.SEVERE, null, ex);
                }
        }

        return results;
    }
    
    
    //Closing connection
    public void close() {
        try {
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(RecipeQueries.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
