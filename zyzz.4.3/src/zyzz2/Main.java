package zyzz2;

import java.text.SimpleDateFormat;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		Game game=new Game(1,"Darksiders");
		Campaign campaign=new Campaign(1,"kod10", 10);
		Campaign campaign2=new Campaign(2,"kod20", 20);
		
		Campaign[] campaigns= {campaign,campaign2};
		
		Gamer gamer=new Gamer(1, "12345678910", "Fatih", "Üstün",
					new SimpleDateFormat("2001/02/12"));
		
		
		GameManager gameManager=new GameManager();
		CampaignManager campaignManager=new CampaignManager();
		GamerManager gamerManager=new GamerManager(new GamerCheckManager());
		
		gameManager.add(game);
		campaignManager.add(campaign);
		campaignManager.add(campaign2);
		gamerManager.saveToGamer(gamer);
		
		
		SalesManager salesManager=new SalesManager(campaigns);
		salesManager.sell(game, gamer,"kod10");
		salesManager.sell(game, gamer,"kod20");
		salesManager.sell(game, gamer);
		
	}

}
