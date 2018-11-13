package c325_project;

import java.sql.*;

public class Database {

    //DEFINE DATABASE FILE PATH ================================================
    public static String DatabaseFilePath = "jdbc:sqlite:database/cnit325.db";

    //DEFINE DATABASE ==========================================================
    // <editor-fold defaultstate="collapsed" desc=" Datebase Definition Code ">
    String tableUSERS = "create table IF NOT EXISTS USERS (\n"
            + "USER_ID VARCHAR2(20) PRIMARY KEY not null,\n"
            + "FIRST_NAME VARCHAR2(20), \n"
            + "LAST_NAME VARCHAR2(20));";

    String tableBANK_ACCOUNTS = "create table IF NOT EXISTS BANK_ACCOUNTS (\n"
            + "USER_ID VARCHAR2(20) PRIMARY KEY,\n"
            + "ACCOUNT_NAME VARCHAR2(20),\n"
            + "BALANCE DECIMAL(2),\n"
            + "CONSTRAINT FK_BANK_ACCOUNTS FOREIGN KEY (USER_ID) REFERENCES \n"
            + "USERS (USER_ID));";

    String tableBUDGET_PLANS = "create table IF NOT EXISTS BUDGET_PLANS (\n"
            + "USER_ID VARCHAR2(20) PRIMARY KEY,\n"
            + "HOME_EXPENSES DECIMAL(2,2),\n"
            + "TRANSPORTATION DECIMAL(2,2),\n"
            + "HEALTH DECIMAL(2,2),\n"
            + "CHARITY DECIMAL(2,2),\n"
            + "DAILY_LIVING DECIMAL(2,2),\n"
            + "ENTERTAINMENT DECIMAL(2,2),\n"
            + "FINANCIAL DECIMAL(2,2),\n"
            + "CONSTRAINT FK_BUDGET_PLANS FOREIGN KEY (USER_ID) REFERENCES \n"
            + "USERS (USER_ID)); ";

    String tableHOME_EXP_PURCHASES = "create table IF NOT EXISTS HOME_EXP_PURCHASES (\n"
            + "USER_ID VARCHAR2(20) PRIMARY KEY,\n"
            + "AMOUNT DECIMAL(2),\n"
            + "DESCRIPTION VARCHAR2(100),\n"
            + "DATETIME DATE,\n"
            + "NAME VARCHAR2(20),\n"
            + "TYPE VARCHAR2(20),\n"
            + "INDOOR NUMBER(1),\n"
            + "TANGIBLE NUMBER(1),\n"
            + "CONSTRAINT FK_HOME_EXP_PURCHASES FOREIGN KEY (USER_ID) REFERENCES \n"
            + "USERS (USER_ID));";

    String tableCHARITY_PURCHASES = "create table IF NOT EXISTS CHARITY_PURCHASES (\n"
            + "USER_ID VARCHAR2(20) PRIMARY KEY,\n"
            + "AMOUNT DECIMAL(2),\n"
            + "DESCRIPTION VARCHAR2(100),\n"
            + "DATETIME DATE,\n"
            + "NAME VARCHAR2(20),\n"
            + "TYPE VARCHAR2(20),\n"
            + "GIFT NUMBER(1),\n"
            + "CONSTRAINT FK_CHARITY_PURCHASES FOREIGN KEY (USER_ID) REFERENCES \n"
            + "USERS (USER_ID));";

    String tableFINANCIAL_PURCHASES = "create table IF NOT EXISTS FINANCIAL_PURCHASES (\n"
            + "USER_ID VARCHAR2(20) PRIMARY KEY,\n"
            + "AMOUNT DECIMAL(2),\n"
            + "DESCRIPTION VARCHAR2(100),\n"
            + "DATETIME DATE,\n"
            + "NAME VARCHAR2(20),\n"
            + "TYPE VARCHAR2(20),\n"
            + "RECURRING NUMBER(1),\n"
            + "CONSTRAINT FK_FINANCIAL_PURCHASES FOREIGN KEY (USER_ID) REFERENCES \n"
            + "USERS (USER_ID));";

    String tableHEALTH_PURCHASES = "create table IF NOT EXISTS HEALTH_PURCHASES (\n"
            + "USER_ID VARCHAR2(20) PRIMARY KEY,\n"
            + "AMOUNT DECIMAL(2),\n"
            + "DESCRIPTION VARCHAR2(100),\n"
            + "DATETIME DATE,\n"
            + "NAME VARCHAR2(20),\n"
            + "TYPE VARCHAR2(20),\n"
            + "PLANNED NUMBER(1),\n"
            + "APPOINTMENT NUMBER(1),\n"
            + "TANGIBLE NUMBER(1),\n"
            + "CONSTRAINT FK_HEALTH_PURCHASES FOREIGN KEY (USER_ID) REFERENCES \n"
            + "USERS (USER_ID));";

    String tableENTERTAINMENT_PURCHASES = "create table IF NOT EXISTS ENTERTAINMENT_PURCHASES (\n"
            + "USER_ID VARCHAR2(20) PRIMARY KEY,\n"
            + "AMOUNT DECIMAL(2),\n"
            + "DESCRIPTION VARCHAR2(100),\n"
            + "DATETIME DATE,\n"
            + "NAME VARCHAR2(20),\n"
            + "TYPE VARCHAR2(20),\n"
            + "TANGIBLE NUMBER(1),\n"
            + "CONSTRAINT FK_ENTERTAINMENT_PURCHASES FOREIGN KEY (USER_ID) REFERENCES \n"
            + "USERS (USER_ID));";

    String tableTRANSPORTATION_PURCHASES = "create table IF NOT EXISTS TRANSPORTATION_PURCHASES (\n"
            + "USER_ID VARCHAR2(20) PRIMARY KEY,\n"
            + "AMOUNT DECIMAL(2),\n"
            + "DESCRIPTION VARCHAR2(100),\n"
            + "DATETIME DATE,\n"
            + "NAME VARCHAR2(20),\n"
            + "TYPE VARCHAR2(20),\n"
            + "INVESTMENT NUMBER(1),\n"
            + "CONSTRAINT FK_TRANSPORTATION_PURCHASES FOREIGN KEY (USER_ID) REFERENCES \n"
            + "USERS (USER_ID));";

    String tableDAILY_LIVING_PURCHASES = "create table IF NOT EXISTS DAILY_LIVING_PURCHASES (\n"
            + "USER_ID VARCHAR2(20) PRIMARY KEY,\n"
            + "AMOUNT DECIMAL(2),\n"
            + "DESCRIPTION VARCHAR2(100),\n"
            + "DATETIME DATE,\n"
            + "NAME VARCHAR2(20),\n"
            + "TYPE VARCHAR2(20),\n"
            + "PERISHABLE NUMBER(1),\n"
            + "CONSTRAINT FK_DAILY_LIVING_PURCHASES FOREIGN KEY (USER_ID) REFERENCES \n"
            + "USERS (USER_ID));";
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
            stmt.execute(tableUSERS);
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
