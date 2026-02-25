package Quetion1;

import java.util.*;

public class DigitalcomProcess {
    public static void main(String[] args) {
        User user = new User();
        GameService gs = new GameService();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("RegisterUser Press 1");
            System.out.println("ViewGames Press 2");
            System.out.println("searchByName Press 3");
            System.out.println("Exit Press 4");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter ID");
                    String nID=sc.next();
                    System.out.println("enter Password");
                    String Pass=sc.next();
                    user.addUser(nID,Pass);
                    break;
                case 2:
                    System.out.println("enter ID");
                    String oID=sc.next();
                    System.out.println("enter Password");
                    String oPass=sc.next();
                    if(user.IsAuthenticated(oID,oPass)) {
                        gs.ViewAll();
                    }else
                        System.out.println("passward wrong");
                    break;
                case 3:
                    System.out.println("enter ID");
                    String aID=sc.next();
                    System.out.println("enter Password");
                    String aPass=sc.next();
                    if(user.IsAuthenticated(aID,aPass)){
                        System.out.println("Auther name");
                        String auther=sc.next();
                        gs.authorSearch(auther);
                    }else
                        System.out.println("passward wrong");
                    break;
                case 4:
                    System.out.println("You have been Exited");
                    sc.close();
                    System.exit(0);
                    break;
            }
        }
    }
}
