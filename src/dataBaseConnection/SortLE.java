package dataBaseConnection;

import java.sql.*;
//import java.util.Scanner;

public class SortLE {
    private int employeeId;
    private String employeeName;
    private int age;
    private String gender;
    private int phoneNo;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId1) {
        employeeId = employeeId1;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName1) {
        employeeName = employeeName1;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age1) {
        age = age1;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender1) {
        gender = gender1;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo1) {
        phoneNo = phoneNo1;
    }
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/alin";
        String userName = "root";
        String password = "root";
       /* Scanner s = new Scanner(System.in);
        System.out.println("Enter the id:");
        int id = s.nextInt();
        System.out.println("Enter the employee name:");
        String nam = s.next();
        System.out.println("Enter the age:");
        int age = s.nextInt();
        System.out.println("Enter the gender:");
        String gen = s.next();
        System.out.println("Enter the phone no:");
        String ph = s.next();
        try (Connection connection = DriverManager.getConnection(url, userName, password);
             Statement statement = connection.createStatement()) {
            String result = "insert into EmployeeTable(employeeId, employeeName, age, gender, phoneNo) values ('" + id + "','" + nam + "','" + age + "','" + gen + "','" + ph + "')";
            statement.execute(result);
            System.out.println("---Inserted records into the table---");
        } catch (Exception e) {
            System.out.println("INSERTION UNSUCCESSFULLY");
        }*/

       // public static void read (String url, String userName, String password) throws SQLException {
            System.out.println("All records in employee table");
            Connection connection = DriverManager.getConnection(url, userName, password);
                 Statement statement = connection.createStatement(); {
                String result = "select * from employeeTable";
                ResultSet rs = statement.executeQuery(result);
                while (rs.next()) {
                    String employeeName = rs.getString("employeeName");
                    System.out.println("Employee name: " + employeeName);
                    int employeeId = rs.getInt("employeeId");
                    System.out.println("Employee id: " + employeeId);
                    int age = rs.getInt("age");
                    System.out.println("age: " + age);
                    String gender = rs.getString("gender");
                    System.out.println("gender: " + gender);
                    String phoneNo = rs.getString("phoneNo");
                    System.out.println("phone: " + phoneNo);
                    System.out.println("------------------------------");
                }

               // System.out.println("---RECORDS SUCCESSFULLY DISPLAYED---");
            }
    }
}
