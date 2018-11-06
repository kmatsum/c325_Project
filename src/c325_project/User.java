package c325_project;

import java.io.Serializable;

public class User implements Serializable {

    //VARIABLES ================================================================
    private String userID;
    private String lastName;
    private String firstName;
    private BudgetPlan budget = new BudgetPlan();

    //GETS AND SETS ============================================================
    public void setUserID(String id) {
        userID = id;
    }

    public String getUserID() {
        return userID;
    }

    public void setFirstName(String fn) {
        firstName = fn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String ln) {
        lastName = ln;
    }

    public String getLastName() {
        return lastName;
    }

    public void setBudgetPlan(BudgetPlan b) {
        budget = b;
    }

    public BudgetPlan getBudgetPlan() {
        return budget;
    }

}
