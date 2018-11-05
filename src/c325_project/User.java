package c325_project;

import java.io.Serializable;

public class User implements Serializable {

    //VARIABLES ================================================================
    private String userID;
    private String lastName;
    private String firstName;

    //GETS AND SETS ============================================================
    public void setuserID(String id) {
        userID = id;
    }

    public String getuserID() {
        return userID;
    }

    public void setfirstName(String fn) {
        firstName = fn;
    }

    public String getfirstName() {
        return firstName;
    }

    public void setlastName(String ln) {
        lastName = ln;
    }

    public String getlastName() {
        return lastName;
    }

}
