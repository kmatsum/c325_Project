/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c325_project;

/**
 *
 * @author Jon
 */
public class Item {

    //VARIABLES==================================================================
    private String Name;
    private double Price;
    private String Category;

    //GETS AND SETS=============================================================
    public String getName() {
        return Name;
    }

    public void setName(String xName) {
       Name = xName;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double xPrice) {
        Price = xPrice;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String xCategory) {
        Category = xCategory;
    }
}
