package c325_project;


/**
 *
 * @author Paul Mueller
 */
public class BudgetPlan extends User {
    
    BudgetPlan(User user){};

    //VARIABLES ================================================================
    private double homeExpenses;
    private double transportation;
    private double health;
    private double charity;
    private double dailyLiving;
    private double entertainment;
    private double financial;

    //GETS AND SETS ============================================================
    public void setbudgetPlan(double he) {
        homeExpenses = he;
    }

    public double getbudgetPlan() {
        return homeExpenses;
    }

    public void settransportation(double tp) {
        transportation = tp;
    }

    public double gettransportation() {
        return transportation;
    }

    public void sethealth(double ha) {
        health = ha;
    }

    public double gethealth() {
        return health;
    }

    public void setcharity(double ch) {
        charity = ch;
    }

    public double getcharity() {
        return charity;
    }

    public void setdailyLiving(double dl) {
        dailyLiving = dl;
    }

    public double getdailyLiving() {
        return dailyLiving;
    }

    public void setentertainment(double et) {
        entertainment = et;
    }

    public double getentertainment() {
        return entertainment;
    }

    public void setfinancial(double fn) {
        financial = fn;
    }

    public double getfinancial() {
        return financial;
    }
}
