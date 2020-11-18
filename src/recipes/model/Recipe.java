/*
Author: Rabia kaur
ID: 12093838
Unit: Software Engineering 
Unit Code: COIT20258
*/

package recipes.model;

//Class Recipe
public class Recipe {
    
    private String category;
    private int cookingTime;
    private int id;
    private String mainIngredient;
    private String name;
    private int preparationTime;
    
    //Parameterisesd constructor for class Recipe
    public Recipe(int id, String n, String c, String mi, int pt, int ct){
        this.name = n;
        this.id = id;
        this.category= c;
        this.mainIngredient = mi;
        this.cookingTime = ct;
        this.preparationTime = pt;
    }
    
    //Setter methods
    //Method to set category of recipe
    public void setCategory(String c){
        this.category = c;
    }
    
    //Method to set cooking time of recipe
    public void setCookingTime(int ct){
        this.cookingTime = ct;
    }
    
    //Method to set id of recipe
    public void setId(int id){
        this.id = id;
    }
    
    //Method to set id of recipe
    public void setMainIngredient(String mi){
        this.mainIngredient = mi;
    }
    
    //Method to set name of recipe
    public void setName(String n){
        this.name = n;
    }
    
    //Method to set preparation time of recipe
    public void setPreparationTime(int pt){
        this.preparationTime = pt;
    }
    
    
    
    //Getter methods
    //Method to get category of recipe
    public String getCategory(){
        return category;
    }
    
    //Method to get cooking time of recipe
    public int getCookingTime(){
        return cookingTime;
    }
    
    //Method to get id of recipe
    public int getId(){
        return id;
    }
    
    //Method to get main ingredient of recipe
    public String getMainIngredient(){
        return mainIngredient;
    }
    
    //Method to get name of recipe
    public String getName(){
        return name;
    }
    
    //Method to get preparation time of recipe
    public int getPreparationTime(){
        return preparationTime;
    }
    
    
    
    //toString
    @Override
    public String toString(){
        
        String recipe = id+ " , " + name+ " , " + category+ " , " + mainIngredient+ " , " + preparationTime+ " , " + cookingTime;
        return recipe;
    }
}
