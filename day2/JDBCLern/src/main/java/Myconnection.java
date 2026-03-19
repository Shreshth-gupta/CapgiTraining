import java.sql.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Myconnection {
    static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/EMPLOYEE","root","Jack@1234");
            Statement stat=con.createStatement();
            System.out.println("Connected....");
//            ResultSet rs =stat.executeQuery("Select * from emp");
//            while(rs.next()){
//            System.out.println(rs.getString("ENAME") +"\t"+rs.getString("JOB")+"\t"+rs.getString("SAL"));
//            }
            Scanner sc=new Scanner(System.in);
//            System.out.println("enter coustmer ID");
//            int cid=sc.nextInt();
//            PreparedStatement ps=con.prepareStatement("select * from emp where EMPNO=? and JOB=?");
//            ps.setInt(1,7369);
//            ps.setString(2,"CLERK");
////            ResultSet rs=stat.executeQuery("select * from emp where EMPNO="+cid);
//            ResultSet rs=ps.executeQuery();
//            if(rs.next())
//                System.out.println(rs.getString("ENAME") +"\t"+rs.getString("JOB")+"\t"+rs.getString("SAL"));
//            else
//                System.out.println("no one");
//            ResultSet rs= stat.executeQuery("select * from customers");
//            while(rs.next()) {
//                Date last_v_on = rs.getDate(4);
//                LocalDate id = last_v_on.toLocalDate();
//                Period p = Period.between(id,LocalDate.now());
//                System.out.println(rs.getString("name") + "\t" + rs.getLong("phone") + "\t" + p.getDays());
//            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}