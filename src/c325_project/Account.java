package c325_project;

import java.io.Serializable;

public class Account implements Serializable {

    //VARIABLES ================================================================
    String accountName;
    Double balance;

    //GET AND SETS =============================================================
    public String getacctName() {
        return accountName;
    }

    public void setacctName(String xacctName) {
        accountName = xacctName;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double xbalance) {
        balance = xbalance;
    }
}
