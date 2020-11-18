/*
Author: Rabia kaur
ID: 12093838
Unit: Software Engineering 
Unit Code: COIT20258
*/

package recipes.view;

import java.sql.SQLException;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;
import recipes.controller.RecipeController;
import recipes.model.Recipe;
import recipes.model.Update;

//RecipeView class to show GUI . RecipeView implements Observer  class and is notified when changes are made in Observable class RecipeModel
public class RecipeView extends javax.swing.JFrame implements Observer{
    
    private RecipeController controller;
    
    //constructor to initialize form components and setting presenter object
    public RecipeView(RecipeController rc) {
        initComponents();
        btnNext.setEnabled(false);
        btnPrevious.setEnabled(false);
        setVisible(true);
        controller = rc;
    }
    Update update = null;
    
    //Overriden method of interface Observer
    @Override
    public void update(Observable o, Object arg) {
        update = (Update) arg;
        
        Recipe recipe = update.getrecipe();
        if(recipe!=null){ //Checking if recipe is returned or not 
            txtCategory.setText(recipe.getCategory());
            txtCookingOne.setText(Integer.toString(recipe.getCookingTime()));
            txtMainIngredient.setText(recipe.getMainIngredient());
            txtName.setText(recipe.getName());
            txtPreparationOne.setText(Integer.toString(recipe.getPreparationTime()));
        }
        txtOutput.setText(update.getMessage());
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtCategory = new javax.swing.JTextField();
        txtPreparationOne = new javax.swing.JTextField();
        txtPreparationTwo = new javax.swing.JTextField();
        txtCookingOne = new javax.swing.JTextField();
        txtCookingTwo = new javax.swing.JTextField();
        txtCombinedOne = new javax.swing.JTextField();
        txtCombinedTwo = new javax.swing.JTextField();
        txtMainIngredient = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnCategory = new javax.swing.JButton();
        btnCategoryPreparation = new javax.swing.JButton();
        btnCategoryCombined = new javax.swing.JButton();
        btnMainIngredient = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("Name");

        jLabel5.setText("Category");

        jLabel6.setText("Preparation Time");

        jLabel7.setText("Cooking Time");

        jLabel8.setText("Combined Time");

        jLabel9.setText("Main Ingredient");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCombinedOne, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCombinedTwo))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCookingOne, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCookingTwo))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPreparationOne, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPreparationTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtCategory, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMainIngredient))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPreparationOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPreparationTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCookingOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCookingTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCombinedOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCombinedTwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtMainIngredient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        txtOutput.setColumns(20);
        txtOutput.setRows(5);
        jScrollPane1.setViewportView(txtOutput);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setText("Input : ");

        btnAdd.setText("ADD ");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnCategory.setText("Category");
        btnCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoryActionPerformed(evt);
            }
        });

        btnCategoryPreparation.setText("Category & Preparation Time");
        btnCategoryPreparation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoryPreparationActionPerformed(evt);
            }
        });

        btnCategoryCombined.setText("Category & Combined Time");
        btnCategoryCombined.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoryCombinedActionPerformed(evt);
            }
        });

        btnMainIngredient.setText("Main Ingredient");
        btnMainIngredient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainIngredientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCategory)
                    .addComponent(btnCategoryPreparation)
                    .addComponent(btnCategoryCombined)
                    .addComponent(btnMainIngredient))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(btnCategory)
                .addGap(18, 18, 18)
                .addComponent(btnCategoryPreparation)
                .addGap(18, 18, 18)
                .addComponent(btnCategoryCombined)
                .addGap(18, 18, 18)
                .addComponent(btnMainIngredient)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel2.setText("Select Recipes for the following attributes ");

        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnAdd)
                    .addComponent(btnPrevious, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExit)
                    .addComponent(btnClear))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAdd)
                .addGap(31, 31, 31)
                .addComponent(btnClear)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnExit)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNext)
                        .addGap(18, 18, 18)
                        .addComponent(btnPrevious)
                        .addGap(41, 41, 41))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel3.setText("Output : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58))
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel1)
                .addGap(254, 254, 254)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Method for implementing add button
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        String name = txtName.getText();
        String category = txtCategory.getText();
        String mainIngredient = txtMainIngredient.getText();
        String preparationTime = txtPreparationOne.getText();
        String cookingTime = txtCookingOne.getText();
        
        //Data validations
        try {
            if("".equals(name))
                txtOutput.setText("Please enter the name");
            else if("".equals(category))
                txtOutput.setText("Please enter the category");
            else if("".equals(mainIngredient))
                txtOutput.setText("Please enter the mainIngredient");
            else if("".equals(preparationTime))
                txtOutput.setText("Please enter the preparationTime");
            else if("".equals(cookingTime))
                txtOutput.setText("Please enter the cookingTime");
            else{
                controller.addRecipe(name, category, mainIngredient, Integer.parseInt(preparationTime), Integer.parseInt(cookingTime));
                txtOutput.setText("Recipe added");
            }
        } catch (SQLException ex) {
            Logger.getLogger(RecipeView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    //method for implementing exit button
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        controller.close();
    }//GEN-LAST:event_btnExitActionPerformed

    //method for implementing category button
    private void btnCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoryActionPerformed
        String category = txtCategory.getText();
        try {
            if("".equals(category))
                txtOutput.setText("Please enter the category");
            else{
                controller.recipesForCategory(txtCategory.getText());
                btnNext.setEnabled(true);
                btnPrevious.setEnabled(true);
                
            }   
        } 
        catch (SQLException ex) {
            Logger.getLogger(RecipeView.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }//GEN-LAST:event_btnCategoryActionPerformed

    
    //method for implementing category and preparation time button
    private void btnCategoryPreparationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoryPreparationActionPerformed
                                                               
        String category ;
        String preparationOne = txtPreparationOne.getText();
        String preparationTwo = txtPreparationTwo.getText();
        int pt1, pt2;    
        category = txtCategory.getText();
        if("".equals(category)){
            txtOutput.setText("Please enter the category");
         }
        else if("".equals(preparationOne) && "".equals(preparationTwo)){
            txtOutput.setText("Both preparation time cannot be empty");
        }
        else if(preparationOne.isEmpty()){
            try {
                pt1 = 0;
                pt2 = Integer.parseInt(txtPreparationTwo.getText());
                controller.recipesForCategoryAndPreparationTime(category, pt1, pt2);
            } catch (SQLException ex) {
                Logger.getLogger(RecipeView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(preparationTwo.isEmpty()){
            try {
                pt1 = pt2 = Integer.parseInt(txtPreparationOne.getText());
                controller.recipesForCategoryAndPreparationTime(category, pt1, pt2);
            } catch (SQLException ex) {
                Logger.getLogger(RecipeView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(Integer.parseInt(preparationOne) > Integer.parseInt(preparationTwo)){ //checing upper and lower bounda
            txtOutput.setText("Error: Upper bound of preparation time should be greater than the lower bound. ");
        }
        else 
            try {
                controller.recipesForCategoryAndPreparationTime(category, Integer.parseInt(preparationOne), Integer.parseInt(preparationTwo));
                btnNext.setEnabled(true);
                btnPrevious.setEnabled(true);
        } catch (SQLException ex) {
            Logger.getLogger(RecipeView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCategoryPreparationActionPerformed

    //method for implementing clear button
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtCategory.setText("");
        txtCombinedOne.setText("");
        txtCombinedTwo.setText("");
        txtCookingOne.setText("");
        txtCookingTwo.setText("");
        txtMainIngredient.setText("");
        txtName.setText("");
        txtOutput.setText("");
        txtPreparationOne.setText("");
        txtPreparationTwo.setText("");
        txtOutput.setText("");
        btnNext.setEnabled(false);
        btnPrevious.setEnabled(false);
    }//GEN-LAST:event_btnClearActionPerformed

    //method for implementing Main Ingredient button
    private void btnMainIngredientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainIngredientActionPerformed
        String mainIngredient = txtMainIngredient.getText();
        try {
            if("".equals(mainIngredient))
                txtOutput.setText("Please enter the main ingredient");
            else
                controller.numberOfRecipesUsingMainIngredient(txtMainIngredient.getText());
                btnNext.setEnabled(true);
                btnPrevious.setEnabled(true);
        } catch (SQLException ex) {
            Logger.getLogger(RecipeView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnMainIngredientActionPerformed

    //method for implementing category and combined time button
    private void btnCategoryCombinedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoryCombinedActionPerformed
        
        String category ;
        String combinedOne = txtCombinedOne.getText();
        String combinedTwo = txtCombinedTwo.getText();
        int ct1, ct2;    
        category = txtCategory.getText();
        if("".equals(category)){
            txtOutput.setText("Please enter the category");
         }
        else if("".equals(combinedOne) && "".equals(combinedTwo)){
            txtOutput.setText("Both combined time cannot be empty");
        }
        else if(combinedOne.isEmpty()){
            ct1 = 0;
            ct2 = Integer.parseInt(txtCombinedTwo.getText());
            try {
                controller.recipesForCategoryAndCombinedTime(category, ct1, ct2);
            } catch (SQLException ex) {
                Logger.getLogger(RecipeView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(combinedTwo.isEmpty()){
            ct1 = ct2 = Integer.parseInt(txtCombinedOne.getText());
            try {
                controller.recipesForCategoryAndCombinedTime(category, ct1, ct2);
            } catch (SQLException ex) {
                Logger.getLogger(RecipeView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(Integer.parseInt(combinedOne) > Integer.parseInt(combinedTwo)){
            txtOutput.setText("Error: Upper bound of combined time should be greater than the lower bound. ");
        }
        else 
            try {
                controller.recipesForCategoryAndCombinedTime(category, Integer.parseInt(combinedOne), Integer.parseInt(combinedTwo));
                btnNext.setEnabled(true);
                btnPrevious.setEnabled(true);
        } catch (SQLException ex) {
            Logger.getLogger(RecipeView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCategoryCombinedActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        controller.next();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        controller.previous();
    }//GEN-LAST:event_btnPreviousActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCategory;
    private javax.swing.JButton btnCategoryCombined;
    private javax.swing.JButton btnCategoryPreparation;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMainIngredient;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JTextField txtCombinedOne;
    private javax.swing.JTextField txtCombinedTwo;
    private javax.swing.JTextField txtCookingOne;
    private javax.swing.JTextField txtCookingTwo;
    private javax.swing.JTextField txtMainIngredient;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextArea txtOutput;
    private javax.swing.JTextField txtPreparationOne;
    private javax.swing.JTextField txtPreparationTwo;
    // End of variables declaration//GEN-END:variables

    

   
}
