package JDBC;
import java.sql.Connection;//connects to the database
import java.sql.DriverManager;//connects to the database
import java.sql.ResultSet;//holds the data returned by a query
import java.sql.Statement;//used to send sql queries to the database
public class SimpleJDBCExample {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/testdb";  //address of mysql
        String username = "root"; 
        String password = "Admin@123#";  
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//JDBC driver that is necessary to connect to the MYSQL database
            connection = DriverManager.getConnection(jdbcUrl, username, password);
            statement = connection.createStatement();
            String sql = "SELECT id, name, age FROM users"; 
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
