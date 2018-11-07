package c325_project;

import java.io.Serializable;

public class BudgetPlan implements Serializable {

    //VARIABLES ================================================================
    private double homeExpenses;
    private double transportation;
    private double health;
    private double charity;
    private double dailyLiving;
    private double entertainment;
    private double financial;

    //GETS AND SETS ============================================================
    // <editor-fold defaultstate="collapsed" desc=" Gets and Set Methods ">
    public void setHomeExpenses(double he) {
        homeExpenses = he;
    }

    public double getHomeExpenses() {
        return homeExpenses;
    }

    public void setTransportation(double tp) {
        transportation = tp;
    }

    public double getTransportation() {
        return transportation;
    }

    public void setHealth(double ha) {
        health = ha;
    }

    public double getHealth() {
        return health;
    }

    public void setCharity(double ch) {
        charity = ch;
    }

    public double getCharity() {
        return charity;
    }

    public void setDailyLiving(double dl) {
        dailyLiving = dl;
    }

    public double getDailyLiving() {
        return dailyLiving;
    }

    public void setEntertainment(double et) {
        entertainment = et;
    }

    public double getEntertainment() {
        return entertainment;
    }

    public void setFinancial(double fn) {
        financial = fn;
    }

    public double getFinancial() {
        return financial;
    }
    // </editor-fold>
}
