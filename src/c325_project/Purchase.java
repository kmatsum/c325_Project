/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c325_project;

import java.util.Date;

/**
 *
 * @author Jon
 */
public class Purchase {

    //VARIABLES=================================================================
    private double Amount;
    private double Tax;
    private String Description;
    private String location;
    private Date dateTime;
    private String type;

    //GETS AND SETS=============================================================
    public double getAmount() {
        return Amount;
    }

    public void setAmount(double xAmount) {
        Amount = xAmount;
    }

    public double getTax() {
        return Tax;
    }

    public void setTax(double xTax) {
        Tax = xTax;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String xDescription) {
        Description = xDescription;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String xLocation) {
        location = xLocation;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setacctName(Date xdateTime) {
        dateTime = xdateTime;
    }

    public String getType() {
        return type;
    }

    public void setacctName(String xType) {
        type = xType;
    }

}
