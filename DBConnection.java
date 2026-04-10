import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3307/voting_system1";
    private static final String USER = "root";
    private static final String PASSWORD = "pass";

    public static Connection getConnection() {
        Connection con = null;
        try {
            // Driver load (optional in new versions but safe)
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(URL, USER, PASSWORD);
            //System.out.println("Connected to Database!");

        } catch (Exception e) {
            System.out.println("Database Connection Failed!");
            e.printStackTrace();   // IMPORTANT
        }
        return con;
    }
}