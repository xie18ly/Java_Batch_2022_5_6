package Week4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

    private static Database db;
    private static Connection con;
    private static Statement stmt;

    private Database() {
        // private constructor //
    }

    public static Database getInstance(){
        if(db == null){
            db= new Database();
        }
        return db;
    }

    public Connection getConnection(){
        if(con==null){
            try {
                String host = "jdbc:mysql://localhost:3306/prac";
                String username = "root";
                String password = "root";
                con = DriverManager.getConnection(host, username, password);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return con;
    }
}
