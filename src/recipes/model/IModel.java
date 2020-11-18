/*
Author: Rabia kaur
ID: 12093838
Unit: Software Engineering 
Unit Code: COIT20258
*/

package recipes.model;

public interface IModel {
    //Method declaration to set recipes for category
    public void setRecipesForCategory(String c);
    
    //Method declaration to set recipes for category and preparation time
    public void setRecipesForCategoryAndPreparationTime(String c, int t1, int t2) ;
    
    //Method declaration to set recipes for category and combined (preparation + cooking) time
    public void setRecipesForCategoryAndCombinedTime(String c, int t1, int t2) ;
    
    //Method declaration to set number of recipes for main ongredient
    public void setNumberOfRecipesUsingMainIngredient(String mi) ;
    
    //Method declaration to add recipe
    public void addRecipe(String n, String c, String mi, int pt, int ct) ;
    
    //Method declaration to access next recipe in selected list of recipes
    public void next(); 
    
    //Method declaration to access previous recipe in selected list of recipes
    public void previous(); 
    
    //Method declaration to close the applicaion
    public void close(); 
}
