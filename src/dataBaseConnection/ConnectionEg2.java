package dataBaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectionEg2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/alin";
        String userName = "root";
        String password = "root";
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the id:");
        int id = s.nextInt();
        System.out.println("enter the employee name:");
        String nam = s.next();
        System.out.println("enter the age:");
        int age = s.nextInt();
        System.out.println("enter the gender:");
        String gen = s.next();
        System.out.println("enter the phone no:");
        String ph = s.next();
        try (Connection connection = DriverManager.getConnection(url, userName, password);
             Statement statement = connection.createStatement()) {
            String result = "insert into EmployeeTable(employeeId, employeeName, age, gender, phoneNo) values ('" + id + "','" + nam + "','" + age + "','" + gen + "','" + ph + "')";
            statement.execute(result);
            System.out.println("---Inserted records into the table---");
        } catch (Exception e) {
            System.out.println("INSERTION UNSUCCESSFULLY");
        }
    }
}
