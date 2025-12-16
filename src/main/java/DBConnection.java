import io.github.cdimascio.dotenv.Dotenv;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private Dotenv dotenv = Dotenv.load();
    private String jdbcUrl = dotenv.get("JDBC_URL");
    private String jdbcUser = dotenv.get("USERNAME");
    private String jdbcPassword = dotenv.get("PASSWORD");

    public Connection getConnection() {
        try {
            return DriverManager.getConnection(jdbcUrl, jdbcUser, jdbcPassword);
        } catch (SQLException e) {
            System.out.println("Erreur de connexion : " + e.getMessage());
            return null;
        }
    }


}
