/*
Author: Rabia kaur
ID: 12093838
Unit: Software Engineering 
Unit Code: COIT20258
*/

package recipes.controller;

import java.sql.SQLException;
import recipes.model.IModel;

public class RecipeController {
    public IModel model;
    
    /*Constructor for assigning recipes.model.IModel object
    The object of the interface helps the class accesss all the defined methods of the interface
    */
    public RecipeController(IModel m){
        this.model = m;   
    }

    
    //Method to get list of recipes for a category using the corresponding method of object model 
    public void recipesForCategory(String c) throws SQLException{
        model.setRecipesForCategory(c);
    }
    
    //Method to add a recipe using the corresponding method of object model
    public void addRecipe(String n, String c, String mi, int pt, int ct) throws SQLException{
        model.addRecipe(n, c, mi, pt, ct);
    }
    
    //method to get list of recipes for a category and given range of processing time using the corresponding method of object model
    public void recipesForCategoryAndPreparationTime(String c, int pt1, int pt2) throws SQLException{
        model.setRecipesForCategoryAndPreparationTime(c, pt1, pt2);
    }
    
    //method to get list of recipes for a particular main ingredient using the corresponding method of object model
    public void numberOfRecipesUsingMainIngredient(String i) throws SQLException{
        model.setNumberOfRecipesUsingMainIngredient(i);
    }
    
    //method to get list of recipes for a category and given range of combined time using the corresponding method of object model
    public void recipesForCategoryAndCombinedTime(String c, int ct1, int ct2)throws SQLException{
       model.setRecipesForCategoryAndCombinedTime(c, ct1, ct2);
    }
    
    //method to access the next recipe in the list of recipes using the corresponding method of object model
    public void next(){
        model.next();
    }
    
    //method to access the previous recipe in the list of recipes using the corresponding method of object model
    public void previous(){
        model.previous(); 
    }
    
    //method to close the application and connection to database
    public void close(){
        model.close();
    }
    
    
}
