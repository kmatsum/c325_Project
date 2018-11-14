package c325_project;

import java.sql.*;

public class Database {

    //DEFINE DATABASE FILE PATH ================================================
    public static String DatabaseFilePath = "jdbc:sqlite:users/" + main.currentUser.getUserID() + "/" + main.currentUser.getUserID()+ ".db";

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

    String tableHOME_EXP_PURCHASES = "create table IF NOT EXISTS HOME_EXP_PURCHASES (\n"
            + "AMOUNT DECIMAL(2),\n"
            + "DESCRIPTION VARCHAR2(100),\n"
            + "DATETIME DATE,\n"
            + "NAME VARCHAR2(20),\n"
            + "TYPE VARCHAR2(20),\n"
            + "INDOOR NUMBER(1),\n"
            + "TANGIBLE NUMBER(1));";

    String tableCHARITY_PURCHASES = "create table IF NOT EXISTS CHARITY_PURCHASES (\n"
            + "AMOUNT DECIMAL(2),\n"
            + "DESCRIPTION VARCHAR2(100),\n"
            + "DATETIME DATE,\n"
            + "NAME VARCHAR2(20),\n"
            + "TYPE VARCHAR2(20),\n"
            + "GIFT NUMBER(1));";

    String tableFINANCIAL_PURCHASES = "create table IF NOT EXISTS FINANCIAL_PURCHASES (\n"
            + "AMOUNT DECIMAL(2),\n"
            + "DESCRIPTION VARCHAR2(100),\n"
            + "DATETIME DATE,\n"
            + "NAME VARCHAR2(20),\n"
            + "TYPE VARCHAR2(20),\n"
            + "RECURRING NUMBER(1));";

    String tableHEALTH_PURCHASES = "create table IF NOT EXISTS HEALTH_PURCHASES (\n"
            + "AMOUNT DECIMAL(2),\n"
            + "DESCRIPTION VARCHAR2(100),\n"
            + "DATETIME DATE,\n"
            + "NAME VARCHAR2(20),\n"
            + "TYPE VARCHAR2(20),\n"
            + "PLANNED NUMBER(1),\n"
            + "APPOINTMENT NUMBER(1),\n"
            + "TANGIBLE NUMBER(1));";

    String tableENTERTAINMENT_PURCHASES = "create table IF NOT EXISTS ENTERTAINMENT_PURCHASES (\n"
            + "AMOUNT DECIMAL(2),\n"
            + "DESCRIPTION VARCHAR2(100),\n"
            + "DATETIME DATE,\n"
            + "NAME VARCHAR2(20),\n"
            + "TYPE VARCHAR2(20),\n"
            + "TANGIBLE NUMBER(1));";

    String tableTRANSPORTATION_PURCHASES = "create table IF NOT EXISTS TRANSPORTATION_PURCHASES (\n"
            + "AMOUNT DECIMAL(2),\n"
            + "DESCRIPTION VARCHAR2(100),\n"
            + "DATETIME DATE,\n"
            + "NAME VARCHAR2(20),\n"
            + "TYPE VARCHAR2(20),\n"
            + "INVESTMENT NUMBER(1));";

    String tableDAILY_LIVING_PURCHASES = "create table IF NOT EXISTS DAILY_LIVING_PURCHASES (\n"
            + "AMOUNT DECIMAL(2),\n"
            + "DESCRIPTION VARCHAR2(100),\n"
            + "DATETIME DATE,\n"
            + "NAME VARCHAR2(20),\n"
            + "TYPE VARCHAR2(20),\n"
            + "PERISHABLE NUMBER(1));";
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
            stmt.execute(tableHOME_EXP_PURCHASES);
            stmt.execute(tableCHARITY_PURCHASES);
            stmt.execute(tableFINANCIAL_PURCHASES);
            stmt.execute(tableHEALTH_PURCHASES);
            stmt.execute(tableENTERTAINMENT_PURCHASES);
            stmt.execute(tableTRANSPORTATION_PURCHASES);
            stmt.execute(tableDAILY_LIVING_PURCHASES);

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
}
