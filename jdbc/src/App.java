import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class App {
    
    static final String connection_string = "jdbc:mysql://localhost:3306/jdbcConnection?user=root&password=root";


    public static void main(String[] args) throws Exception {
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(connection_string);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM products");

    while(resultSet.next()) {
        System.out.println("id: " + resultSet.getLong("id"));
        System.out.println("nome: " + resultSet.getString("name"));
        System.out.println("descrizione: " + resultSet.getString("description"));
        System.out.println("prezzo: " + resultSet.getFloat("price"));
        }
    }
}
