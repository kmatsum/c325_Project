package c325_project;

import java.util.Date;

public class Purchase {

    //VARIABLES=================================================================
    private double Amount;
    private String Description;
    private Date dateTime;
    private String Name;
    private String Category;

    //GETS AND SETS=============================================================
    // <editor-fold defaultstate="collapsed" desc=" Gets and Set Methods ">
    public double getAmount() {
        return Amount;
    }

    public void setAmount(double xAmount) {
        Amount = xAmount;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String xDescription) {
        Description = xDescription;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date xdateTime) {
        dateTime = xdateTime;
    }

    public String getName() {
        return Name;
    }

    public void setName(String xName) {
        Name = xName;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String xCategory) {
        Category = xCategory;
    }
    // </editor-fold>
}
