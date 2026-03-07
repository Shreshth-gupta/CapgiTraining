import java.util.Scanner;

public class AuthorMain {
    static void main(String[] args) {
        LibrearyService L=new LibrearyService();
        Scanner sc =new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.println("Add New Author    - - -  1");
            System.out.println("Display ALL     - - - -  2");
            System.out.println("Change Book Price - - -  3");
            System.out.println("Delete Book - - - - - -  4");
            System.out.println("Delete Author - - - - -  5");
            System.out.println("Exit -  -  -  -  -  -  - 10");
            System.out.println("Enter Choice");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    L.CreateAuther();
                    break;
                case 2:
                    L.AllBookOfAuthor();
                    break;
                case 3:
                    L.UpdatePrice();
                    break;
                case 4:
                    System.out.println("Enter Auther Id");
                    int Aid=sc.nextInt();
                    sc.nextLine();
                    L.DeleteAuther(Aid);
                    System.out.println("Deleted Success..");
                    break;
                case 5:
                    System.out.println("Enter Book id to delete");
                    int Bid=sc.nextInt();
                    sc.nextLine();
                    L.DeleteBook(Bid);
                    System.out.println("Book deleted...");
                    break;
                case 10:
                    check = false;
                    break;
            }
        }
    }
}
