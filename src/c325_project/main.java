package c325_project;

public class main {

    public static User currentUser = new User();

    //method to use to check user input for doubles
    public static boolean doubleIsParsable(String input) {
        boolean parsable = true;
        try {
            Double.parseDouble(input);
        } catch (Exception e) {
            parsable = false;
        }
        return parsable;
    }

    //method to use to check user input for ints
    public static boolean intIsParsable(String input) {
        boolean parsable = true;
        try {
            Integer.parseInt(input);
        } catch (Exception e) {
            parsable = false;
        }
        return parsable;
    }

    public static void main(String[] args) {

        //OPENING FIRST FORM ===================================================
        MainScreen MainScreenWindow = new MainScreen();
        MainScreenWindow.setVisible(true);

    }

}
