package dataBaseConnection;
import java.sql.*;

public class ConnectionEg {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/alin";
        String userName = "root";
        String password = "root";
        String query = "select * from EmployeeTable";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, userName, password);
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        rs.next();
        String name = rs.getString("employeeName");
        System.out.println(name);
        statement.close();
        connection.close();
    }
}
