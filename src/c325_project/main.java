package c325_project;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class main {

    public static User currentUser = new User();

    
    //GLOBAL METHODS ===========================================================
    
    //CHECK USER INPUT - DOUBLE
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

    //CHECK USER INPUT - INT
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

    public static void WriteObjectToFile(Object user, File xFile) {
    try {
        try {
            FileOutputStream fileIn = new FileOutputStream(xFile);
            ObjectOutputStream out = new ObjectOutputStream(fileIn);
            
//                if (!UserObjects.exists()) {
//                    //delete file if it exists...remove this later on
//                    UserObjects.delete();
//                    UserObjects.createNewFile();
//                }

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
    
    //MAIN PROJECT METHOD ======================================================
    public static void main(String[] args) {

        //OPENING FIRST FORM ===================================================
        MainScreen MainScreenWindow = new MainScreen();
        MainScreenWindow.setVisible(true);

    }

}
