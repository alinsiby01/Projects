package dataBaseConnection;

import java.sql.*;
import java.util.Scanner;

public class CRUDEg {
    public static void main(String[] ar) throws SQLException {
        char symbol = 'N';
        char c;
        //connection
        String url = "jdbc:mysql://localhost:3306/alin";
        String userName = "root";
        String password = "root";
        do {
            System.out.println("1:CREATE");
            System.out.println("2:READ");
            System.out.println("3:DELETE");
            System.out.println("Which operation to be perform from above?");
            Scanner s = new Scanner(System.in);
            int op = s.nextInt();
           /* switch (op) {
                case 1 -> insertion(url, userName, password);
                case 2 -> read(url, userName, password);
                case 3 -> deletion(url, userName, password, s);
            }*/
            System.out.println("Do yo wish to continue(Y/N)");
            c = s.next().charAt(0);
        } while (c == 'Y' || c == 'y');
    }

    private static void deletion(String url, String userName, String password, Scanner s) {
        // System.out.println("3.DELETE");
        try (Connection connection = DriverManager.getConnection(url, userName, password);
             Statement statement = connection.createStatement()) {
            System.out.println("Enter the employee ID to be deleted:");
            int employeeId = s.nextInt();
            String result = "Delete from employeeTable where employeeId=" + employeeId;
            statement.execute(result);
            System.out.println("---RECORDS SUCCESSFULLY DELETED---");
        } catch (Exception e) {
            System.out.println("!DELETION UNSUCCESSFULLY!");
        }
    }

    private static void read(String url, String userName, String password) throws SQLException {
        // System.out.println("2.READ");
        try (Connection connection = DriverManager.getConnection(url, userName, password);
             Statement statement = connection.createStatement()) {
            String result = "select * from employeeTable";
            ResultSet rs = statement.executeQuery(result);
            while (rs.next()) {
                String employeeName = rs.getString("employeeName");
                System.out.println("Employee name: " + employeeName);
                int employeeId = rs.getInt("employeeId");
                System.out.println("Employee id: " + employeeId);
                int age = rs.getInt("age");
                System.out.println("age: " +age);
                String gender = rs.getString("gender");
                System.out.println("gender: " + gender);
                String phoneNo = rs.getString("phoneNo");
                System.out.println("phone: " + phoneNo);
                System.out.println("------------------------------");
            }

        System.out.println("---RECORDS SUCCESSFULLY DISPLAYED---");
    }
    catch(Exception e) {
            System.out.println("!UNSUCCESSFULLY DISPLAY!");
        }
    }
    private static void insertion(String url, String userName, String password) {
        // System.out.println("1.CREATE");
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the employee id:");
        int employeeId = s1.nextInt();
        System.out.println("Enter the employee name:");
        String employeeName = s1.next();
        System.out.println("Enter the age:");
        int age = s1.nextInt();
        System.out.println("Enter the gender:");
        String gender = s1.next();
        System.out.println("Enter the phone no:");
        String phoneNo = s1.next();
        try (Connection connection = DriverManager.getConnection(url, userName, password);
             Statement statement = connection.createStatement()) {
            String result = "insert into employeeTable(employeeId,employeeName,age, gender, phoneNo) values ('" + employeeId + "','" + employeeName + "','" + age + "','" + gender + "','" + phoneNo + "')";
            statement.execute(result);
            System.out.println("---RECORDS SUCCESSFULLY INSERTED---");
        } catch (Exception e) {
            System.out.println("!INSERTION UNSUCCESSFULLY!");
        }
    }
}
