package c325_project;

import java.sql.*;
import java.util.ArrayList;

public class Database {

    //DEFINE DATABASE FILE PATH ================================================
    public static String DatabaseFilePath = "jdbc:sqlite:users/" + main.currentUser.getUserID() + "/" + main.currentUser.getUserID() + ".db";

    //DEFINE DATABASE ==========================================================
    // <editor-fold defaultstate="collapsed" desc=" Datebase Definition Code ">
    String tableBANK_ACCOUNTS = "create table IF NOT EXISTS BANK_ACCOUNTS (\n"
            + "ACCOUNT_NAME VARCHAR2(20),\n"
            + "BALANCE DECIMAL(2));";

    String tableBUDGET_PLANS = "create table IF NOT EXISTS BUDGET_PLANS (\n"
            + "HOME_EXPENSES DECIMAL(2,2),\n"
            + "TRANSPORTATION DECIMAL(2,2),\n"
            + "HEALTH DECIMAL(2,2),\n"
            + "CHARITY DECIMAL(2,2),\n"
            + "DAILY_LIVING DECIMAL(2,2),\n"
            + "ENTERTAINMENT DECIMAL(2,2),\n"
            + "FINANCIAL DECIMAL(2,2));";

    String tablePURCHASES = "create table IF NOT EXISTS PURCHASES (\n"
            + "AMOUNT DECIMAL(2),\n"
            + "DESCRIPTION VARCHAR2(100),\n"
            + "DATETIME DATE,\n"
            + "NAME VARCHAR2(20),\n"
            + "BANK VARCHAR2(20),\n"
            + "CATEGORY VARCHAR2(20));";
    // </editor-fold>

    //CONSTRUCTOR ==============================================================
    public Database() {

        //Test connection to database
        try (Connection conn = DriverManager.getConnection(Database.DatabaseFilePath)) {
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("Database already existed or was created.");
            }

            //Create Statement Variable
            Statement stmt = conn.createStatement();

            //Create all needed tables
            stmt.execute(tableBANK_ACCOUNTS);
            stmt.execute(tableBUDGET_PLANS);
            stmt.execute(tablePURCHASES);

            //Debug Code
            System.out.println("All tables already existed or were created.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    //TAKE STRING INPUT AND INSERT INTO TABLE ==================================
    public void InsertStatement(String table, String values) {
        try (Connection conn = DriverManager.getConnection(Database.DatabaseFilePath)) {
            Statement stmt = conn.createStatement();
            stmt.execute("INSERT INTO " + table + " VALUES (" + values + ")");
            System.out.println("Statement executed successfully: INSERT INTO " + table + " VALUES (" + values + ")");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("The following statement failed: INSERT INTO " + table + " VALUES (" + values + ")");
        }
    }

    //TAKE STRING INPUT AS A SQL QUERY STATEMENT ===============================
    public void GenericStatement(String statement) {
        try (Connection conn = DriverManager.getConnection(Database.DatabaseFilePath)) {
            Statement stmt = conn.createStatement();
            stmt.execute(statement);
            System.out.println("Statement executed successfully: " + statement);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("The following statement failed: " + statement);
        }
    }

    //SELECT STATEMENT =========================================================
    public ArrayList<String> SelectPurchase(String statement) {

        //Set the result String Arrray List Variable
        ArrayList<String> Results = new ArrayList<String>();

        //Connect to the database and inject the SQL Statement
        try (Connection conn = DriverManager.getConnection(Database.DatabaseFilePath);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(statement);) {

            //Debug
            System.out.println("Statement executed successfully: " + statement);

            //Iterate through the Result Set and add to the String Array List
            while (rs.next()) {
                Results.add(rs.getString("DATETIME") + "\t" + rs.getString("NAME") + "\t" + rs.getDouble("AMOUNT")
                        + "\t" + rs.getString("BANK") + "\t" + rs.getString("CATEGORY") + "\t" + rs.getString("DESCRIPTION"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("The following statement failed: " + statement);
        }

        return Results;
    }

    //RETRIEVES AMMOUNT OF PURCHASES FOR SPECIFIC CATEGORIES ===================
    public double SumTableCategories(String categoryName) {
        //Set variables
        double Result = 0;

        //Connect to the Database and inject the SQL Statement with the categoryName parameter
        try (Connection conn = DriverManager.getConnection(Database.DatabaseFilePath);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT SUM(AMOUNT) FROM PURCHASES WHERE CATEGORY= '" + categoryName + "';");) {

            //Loop through the Result Set
            while (rs.next()) {
                Result = rs.getDouble("SUM(AMOUNT)");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return Result;
    }

    //RETRIEVES TOTAL AMOUNT OF PURCHASES ======================================
    public double SumTotal() {

        //Set variables
        double Result = 0;

        //Connect to the Database
        try (Connection conn = DriverManager.getConnection(Database.DatabaseFilePath);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT SUM(AMOUNT) FROM PURCHASES;");) {

            //Loop through the Result Set
            while (rs.next()) {
                Result = rs.getDouble("SUM(AMOUNT)");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return Result;
    }
}
