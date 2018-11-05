/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c325_project;

import java.io.Serializable;

/**
 *
 * @author gitte
 */
public class User implements Serializable {

    //gets and sets
    private String userID;

    public void setuserID(String id) {
        userID = id;
    }

    public String getuserID() {
        return userID;
    }

    private String firstName;

    public void setfirstName(String fn) {
        firstName = fn;
    }

    public String getfirstName() {
        return firstName;
    }

    private String lastName;

    public void setlastName(String ln) {
        lastName = ln;
    }

    public String getlastName() {
        return lastName;
    }

}
