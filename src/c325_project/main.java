package c325_project;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class main {

    //VARIABLES ================================================================
    public static User currentUser = new User();
    public static File currentUserFile;
    public static Purchase[] purchaseArray = new Purchase[100];
    public static int purchaseCount = 0;
    
    //TO DO
    //public static NumberFormat formatter = NumberFormat.getCurrencyInstance();

//GLOBAL METHODS ===============================================================
    //CHECK USER INPUT - DOUBLE ================================================
    public static boolean doubleIsParsable(String input) {
        boolean parsable = true;
        try {
            Double.parseDouble(input);
        } catch (Exception e) {
            e.printStackTrace();
            parsable = false;
        }
        return parsable;
    }

    //CHECK USER INPUT - INT ===================================================
    public static boolean intIsParsable(String input) {
        boolean parsable = true;
        try {
            Integer.parseInt(input);
        } catch (Exception e) {
            e.printStackTrace();
            parsable = false;
        }
        return parsable;
    }

    //WRITE OBJECT TO FILE METHOD ==============================================
    public static void WriteObjectToFile(Object user, File xFile) {
        try {
            try {
                FileOutputStream fileIn = new FileOutputStream(xFile);
                ObjectOutputStream out = new ObjectOutputStream(fileIn);

                out.writeObject(user);
                out.close();
                System.out.println("The user was succesfully written to a file");

            } catch (Exception exc1) {
                exc1.printStackTrace();
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

//MAIN PROJECT METHOD ==========================================================
    public static void main(String[] args) {

        //OPENING FIRST FORM ===================================================
        MainScreen MainScreenWindow = new MainScreen();
        MainScreenWindow.setVisible(true);

    }

}
