package c325_project;

import java.sql.*;

public class Database {

    String url = "jdbc:sqlite:database/cnit325.db";
    
    public Database() {
         
        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("A new database has been created.");
            }
 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
