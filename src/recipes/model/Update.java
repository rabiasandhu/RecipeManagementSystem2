/*
Author: Rabia kaur
ID: 12093838
Unit: Software Engineering 
Unit Code: COIT20258
*/

package recipes.model;

//Class Update to set string and recipe
public class Update {
    String message;
    Recipe recipe;
    
    public Update(){}
    
    //Update constructor to set updated message and recipe
    Update(String m, Recipe r){
        this.message = m;
        this.recipe = r;
    }
    
    //Method to get updated message
    public String getMessage(){
        return message;
    }
    
    //Method to get updated recipe
    public Recipe getrecipe(){
        return recipe;
    }
    
    
}
