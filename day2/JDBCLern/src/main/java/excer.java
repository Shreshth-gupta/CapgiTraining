import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class excer{

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Jack@1234");

            System.out.println("Connected...");

            Scanner sc = new Scanner(System.in);

            System.out.println("1. View Employee");
            System.out.println("2. Update Salary");
            System.out.println("3. Delete Employee");
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter EMPNO: ");
                    int empNo = sc.nextInt();

                    PreparedStatement ps1 = con.prepareStatement(
                            "SELECT * FROM EMP WHERE EMPNO = ?");
                    ps1.setInt(1, empNo);

                    ResultSet rs = ps1.executeQuery();

                    if (rs.next()) {
                        System.out.println(rs.getString("ENAME") + "\t"
                                + rs.getString("JOB") + "\t"
                                + rs.getDouble("SAL"));
                    } else {
                        System.out.println("Employee Not Found");
                    }
                    break;
                case 2:

                    System.out.print("Enter EMPNO to Update: ");
                    int empNo2 = sc.nextInt();

                    System.out.print("Enter New Salary: ");
                    double salary = sc.nextDouble();

                    PreparedStatement ps2 = con.prepareStatement(
                            "UPDATE EMP SET SAL = ? WHERE EMPNO = ?");
                    ps2.setDouble(1, salary);
                    ps2.setInt(2, empNo2);

                    int rows = ps2.executeUpdate();

                    if (rows > 0)
                        System.out.println("Salary Updated Successfully!");
                    else
                        System.out.println("Employee Not Found");
                    break;
                case 3:

                    System.out.print("Enter EMPNO to Delete: ");
                    int empNo3 = sc.nextInt();

                    PreparedStatement ps3 = con.prepareStatement(
                            "DELETE FROM EMP WHERE EMPNO = ?");
                    ps3.setInt(1, empNo3);

                    int rows1 = ps3.executeUpdate();

                    if (rows1 > 0)
                        System.out.println("Employee Deleted Successfully!");
                    else
                        System.out.println("Employee Not Found");
                    break;
            }
            con.close();
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}