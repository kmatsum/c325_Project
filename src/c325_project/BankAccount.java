package c325_project;

import java.io.Serializable;

public class BankAccount implements Serializable {

    //VARIABLES ================================================================
    String accountName;
    Double balance;

    //GET AND SETS =============================================================
    // <editor-fold defaultstate="collapsed" desc=" Gets and Set Methods ">
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String xacctName) {
        accountName = xacctName;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double xbalance) {
        balance = xbalance;
    }
    // </editor-fold>
}
