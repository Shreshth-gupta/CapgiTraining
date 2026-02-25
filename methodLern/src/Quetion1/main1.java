package Quetion1;

public class main1 {
    public static void main(String[] args) {
        User user=new User();
        user.addUser("Amit","1234");
        System.out.println(user.IsAuthenticated("Amit","1234"));
        GameService gameService=new GameService();
        gameService.ViewAll();

    }
}
