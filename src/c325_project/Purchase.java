package c325_project;

import java.io.Serializable;
import java.util.Date;

public class Purchase implements Serializable {

    //VARIABLES=================================================================
    private double amount;
    private String description;
    private Date dateTime;
    private String name;
    private String category;
    private String bank;

    //GETS AND SETS=============================================================
    // <editor-fold defaultstate="collapsed" desc=" Gets and Set Methods ">
    public double getAmount() {
        return amount;
    }

    public void setAmount(double xAmount) {
        amount = xAmount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String xDescription) {
        description = xDescription;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date xdateTime) {
        dateTime = xdateTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String xName) {
        name = xName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String xCategory) {
        category = xCategory;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String xBank) {
        bank = xBank;
    }
    // </editor-fold>
}
