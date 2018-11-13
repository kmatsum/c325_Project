package c325_project;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {

    //VARIABLES ================================================================
    private String userID;
    private String lastName;
    private String firstName;
    private BudgetPlan budget = new BudgetPlan();
    private BankAccount checking = new BankAccount();
    private BankAccount savings = new BankAccount();
    private ArrayList<Purchase> PurchasesArray = new ArrayList<>();

    //GETS AND SETS ============================================================
    // <editor-fold defaultstate="collapsed" desc=" Gets and Set Methods ">
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

    public void setCheckingAccount(BankAccount a) {
        checking = a;
    }

    public BankAccount getCheckingAccount() {
        return checking;
    }

    public void setSavingsAccount(BankAccount a) {
        savings = a;
    }

    public BankAccount getSavingsAccount() {
        return savings;
    }
    
    public ArrayList<Purchase> getPurchaseArrayList() {
        return PurchasesArray;
    }
    // </editor-fold>
}
