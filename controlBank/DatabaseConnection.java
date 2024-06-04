import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
    private static final String URL = "jdbc:mariadb://localhost:3306/realstate";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {
        try {
            //  JDBC driver
            Class.forName("org.mariadb.jdbc.Driver");

            
            try ( // Conexion a la base
                    Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
    
                Statement stmt = conn.createStatement();
                // De que tabla lee datos
                ResultSet resultSet = stmt.executeQuery("SELECT * FROM clients");
                // esultados
                while (resultSet.next()) {
                    String column1 = resultSet.getString("username");
                    String column2 = resultSet.getString("password");
                    System.out.println("Username: " + column1 + ", Password: " + column2);
                }
                
            }
        } catch (SQLException e) {
            System.out.println("Error connecting to the database: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Error loading JDBC driver: " + e.getMessage());
        }
    }
}