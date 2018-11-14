package c325_project;

import java.io.*;

public class main {

    //VARIABLES ================================================================
    public static User currentUser = new User();
    public static File currentUserFile;
    public static Database database;

    //TODO Add Formatting Implementation
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
                //Output Stream Setup
                FileOutputStream fileOut = new FileOutputStream(xFile);
                ObjectOutputStream out = new ObjectOutputStream(fileOut);

                //Write the Object onto the Output Stream
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

    //READ OBJECT FROM SPECIFIED FILE ==========================================
    public static Object ReadObjectFromFile(File xFile) {
        try {
            try {
                if (!xFile.exists()) {
                    System.out.println("File does not exist");
                    return null;
                }

                //Input Stream Setup
                FileInputStream fileIn = new FileInputStream(xFile);
                ObjectInputStream in = new ObjectInputStream(fileIn);

                //Save the read object
                Object obj = in.readObject();

                //Debug code
                System.out.println("The Object has been read from the file");

                //Close the Input Stream
                in.close();

                //Return Information
                return obj;

            } catch (Exception exc1) {
                exc1.printStackTrace();
                return null;
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

//MAIN PROJECT METHOD ==========================================================
    public static void main(String[] args) {

        //OPENING FIRST FORM ===================================================
        MainScreen MainScreenWindow = new MainScreen();
        MainScreenWindow.setVisible(true);

    }

}
