/*
Author: Rabia kaur
ID: 12093838
Unit: Software Engineering 
Unit Code: COIT20258
*/

package recipes;

import recipes.controller.RecipeController;
import recipes.model.RecipeModel;
import recipes.model.RecipeQueries;
import recipes.view.RecipeView;

public class Recipes {

    public static void main(String[] args) {
        
        /*Creating object for class recipes.model.RecipeQueries
        The object creates connection with the database and prepared statemnts to implement queries*/
        RecipeQueries rq = new RecipeQueries();
        
        
        /*Creating object for class RecipeModel with RecipeQueries passed as the parameter.
        This class is observable and notifies any changes made in the GUI controlled by the class using this class as model
        */
        RecipeModel m = new RecipeModel(rq);
        
        
        /*Creating object for class recipes.controller.RecipeController
        The class uses the object of class RecipeModel to call its method corresponding to the action taken by RecipeView class
        */
        RecipeController rc = new RecipeController(m);
        
        
        /*Creating object for class recipes.view.RecipeView
        The class accepts the RecipeController Object and uses methods corresponding the events performed its GUI
        */
        RecipeView rv = new RecipeView(rc); 
        
        
        /*The object of class RecipeView is added as Observer to the observable class RecipeModel.
        Any changes made in the recipeModel object is observed by the RecipeView object
        */
        m.addObserver(rv);
        
        
    }
    
}
