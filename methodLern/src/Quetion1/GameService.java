package Quetion1;

import java.util.ArrayList;

public class GameService {
	static ArrayList<Game> games = new ArrayList<>();

	public GameService() {
		games.add(new Game("SnowBird", "Danny", 300));
		games.add(new Game("FreshFood", "Ram", 450));
		games.add(new Game("Batsman", "Kate", 400));
		games.add(new Game("Pokiman", "Steeve", 600));
		games.add(new Game("YammyTommy", "Narayan", 350));
	}

	public void ViewAll() {
		games.forEach(System.out::println);
	}

	public String authorSearch(String author) {
		for (Game g : games) {
			if (g.getAuthorName().equals(author)) {
				return g.getGameName();
			}
		}
		return "No game found for the given author.";
	}

	IValidate Authenticated = new User()::IsAuthenticated;

}
