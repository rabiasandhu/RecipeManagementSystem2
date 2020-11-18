/*
Author: Rabia kaur
ID: 12093838
Unit: Software Engineering 
Unit Code: COIT20258
*/

package recipes.model;

import java.sql.SQLException;
import java.util.List;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

//Class RecipeModel extends Observable classs, so tha tnay changes made during its method implementation can be notified to corresponding observers
public class RecipeModel extends Observable implements IModel {
    
    //private attributes declaration
    private int i = 0;
    private String action = null; //variable set to relate methods next() and previous to corresponding actions ('Category', 'Main ingredient' and so on)
    private String category = null;//varialble set to relate methods next() and previuos() to currently selected category
    private int processingTime1 ;
    private int processingTime2 ;
    private int cookingTime1 ;
    private int cookingTime2 ;
    private int resultSize;
    RecipeQueries queries;
    
    //Class declaration for Update class
    public Update update = null;
    
    //RecipeModel constructor to set RecipeQueries object
    public RecipeModel(RecipeQueries rq){
        queries = rq;
    }

    //Overriden method of model interface to set recipes
    @Override
    public void setRecipesForCategory(String c) {
        
        //local recipe variable to pass recipe with null value
        Recipe recipe = null;
        
        action = "category";
        this.category = c;
        
        try {
            List<Recipe> results = queries.getRecipesForCategory(c);
            resultSize = results.size();
            
            if(resultSize==0){ //updating message if not recipe found for given category
                update = new Update("No record found for given category", recipe);
                setChanged();
                notifyObservers(update);
            }
            else{
                update = new Update("Record "+ (i+1) +" of "+ results.size(), results.get(i));//calling constructor of Update class to set message and recipe
                setChanged();
                notifyObservers(update);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RecipeModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Overriden method of model interface to set recipes
    @Override
    public void setRecipesForCategoryAndPreparationTime(String c, int t1, int t2) {
        //local recipe variable to pass recipe with null value
        Recipe recipe = null;
        
        action = "categoryAndPreparation";
        this.category = c;
        this.processingTime1 = t1;
        this.processingTime2 = t2;
        
        List<Recipe> results = queries.getRecipesForCategoryAndProcessingTime(c, t1, t2);
        resultSize = results.size();
        
        if(resultSize==0){
                update = new Update("No record found for given category and preparation time.", recipe);//updating message if not recipe found for given category and preparation time
                setChanged();
                notifyObservers(update);
            }
            else{
        update = new Update("Record "+ (i+1) +" of "+ results.size(), results.get(i));
        setChanged();
        notifyObservers(update);
        }
    }

    //Overriden method of model interface to set recipes
    @Override
    public void setRecipesForCategoryAndCombinedTime(String c, int t1, int t2) {
        //local recipe variable to pass recipe with null value
        Recipe recipe = null;
        try {
            action = "categoryAndCombined";
            this.category = c;
            this.cookingTime1 = t1;
            this.cookingTime2 = t2;
            
            List<Recipe> results = queries.getRecipesForCategoryAndCombinedTime(c, t1, t2);
            resultSize = results.size();
            
            if(resultSize==0){
                update = new Update("No record found for given category and combined time.", recipe);//updating message if not recipe found for given category and combined time
                setChanged();
                notifyObservers(update);
            }
            else{
            update = new Update("Record "+ (i+1) +" of "+ results.size(), results.get(i));
            setChanged();
            notifyObservers(update);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RecipeModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Overriden method of model interface to set recipes
    @Override
    public void setNumberOfRecipesUsingMainIngredient(String mi) {
        //local recipe variable to pass recipe with null value
        Recipe recipe = null;
        action = "mainIngredient";
        this.category = mi;
        
        try {
            List<Recipe> results = queries.getNumberOfRecipesUsingMainIngredient(mi);
            resultSize = results.size();
            if(resultSize==0){
                update = new Update("No record found for given main ingredient", recipe);//updating message if not recipe found for given main ingredient
                setChanged();
                notifyObservers(update);
            }
            else{
            update = new Update("Number of recipes : "+ resultSize, recipe);
            setChanged();
            notifyObservers(update);
            
        }}   catch (SQLException ex) {
            Logger.getLogger(RecipeModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Overriden method of model interface to set recipes
    @Override
    public void addRecipe(String n, String c, String mi, int pt, int ct) {
        try {
            queries.addRecipe(n, c, mi, pt, ct);
            
        } catch (SQLException ex) {
            Logger.getLogger(RecipeModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    //Overriden method of model interface to set next recipe
    @Override
    public void next() {
        i++;
        if(i==resultSize){
                i=0;
            }
        if("category".equalsIgnoreCase(action)){
        setRecipesForCategory(category); 
        }
        else if("mainIngredient".equalsIgnoreCase(action)){
         setNumberOfRecipesUsingMainIngredient(category);
        }
        else if("categoryAndPreparation".equalsIgnoreCase(action)){
         setRecipesForCategoryAndPreparationTime(category,processingTime1 , processingTime2);
        }
        else if("categoryAndCombined".equalsIgnoreCase(action)){
         setRecipesForCategoryAndPreparationTime(category,cookingTime1 , cookingTime2);
        }
    }

    //Overriden method of model interface to set previous recipes
    @Override
    public void previous() {
        
        if(i==0){
                i=resultSize;
            }
        i--;
        if("category".equalsIgnoreCase(action)){
        setRecipesForCategory(category); 
        }
        else if("mainIngredient".equalsIgnoreCase(action)){
         setNumberOfRecipesUsingMainIngredient(category);
        }
        else if("categoryAndPreparation".equalsIgnoreCase(action)){
         setRecipesForCategoryAndPreparationTime(category,processingTime1 , processingTime2);
        }
        else if("categoryAndCombined".equalsIgnoreCase(action)){
         setRecipesForCategoryAndPreparationTime(category,cookingTime1 , cookingTime2);
        }
    }

    //Overriden method of model interface to close recipes
    @Override
    public void close() {
        System.exit(0); 
    }
}
