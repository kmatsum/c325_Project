/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package c325_project;

/**
 *
 * @author gitte
 */
public class Financial extends Purchase{

    //VARIABLES ================================================================
    boolean recurring;

    //GETS AND SETS ============================================================
    // <editor-fold defaultstate="collapsed" desc=" Gets and Set Methods ">
    public void setgift(boolean r) {
        recurring = r;
    }

    public boolean getgift() {
        return recurring;
    }
    // </editor-fold>
}
