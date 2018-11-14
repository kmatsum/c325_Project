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
public class DailyLiving extends Purchase{

    //VARIABLES ================================================================
    boolean perishable;

    //GETS AND SETS ============================================================
    // <editor-fold defaultstate="collapsed" desc=" Gets and Set Methods ">
    public void settangible(boolean p) {
        perishable = p;
    }

    public boolean gettangible() {
        return perishable;
    }
    // </editor-fold>
}
