package zyzz2;

public class GameManager implements IGameService {

	@Override
	public void add(Game game) {

		System.out.println("Oyun eklendi : " + game.getName());
	}

	@Override
	public void delete(Game game) {

		System.out.println("Oyun silindi : " + game.getName());
	}

}
