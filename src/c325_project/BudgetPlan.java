/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c325_project;

/**
 *
 * @author Paul Mueller
 */
public class BudgetPlan extends User {
    
    BudgetPlan(User user){};

    //GET AND SETS =============================================================
    private double homeExpenses;

    public void setbudgetPlan(double he) {
        homeExpenses = he;
    }

    public double getbudgetPlan() {
        return homeExpenses;
    }

    private double transportation;

    public void settransportation(double tp) {
        transportation = tp;
    }

    public double gettransportation() {
        return transportation;
    }

    private double health;

    public void sethealth(double ha) {
        health = ha;
    }

    public double gethealth() {
        return health;
    }

    private double charity;

    public void setcharity(double ch) {
        charity = ch;
    }

    public double getcharity() {
        return charity;
    }

    private double dailyLiving;

    public void setdailyLiving(double dl) {
        dailyLiving = dl;
    }

    public double getdailyLiving() {
        return dailyLiving;
    }

    private double entertainment;

    public void setentertainment(double et) {
        entertainment = et;
    }

    public double getentertainment() {
        return entertainment;
    }

    private double financial;

    public void setfinancial(double fn) {
        financial = fn;
    }

    public double getfinancial() {
        return financial;
    }
}
