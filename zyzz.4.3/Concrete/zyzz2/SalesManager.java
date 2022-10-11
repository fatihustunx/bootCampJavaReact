package zyzz2;

public class SalesManager implements ISalesService{
	
	private Campaign[] campaigns;

	public SalesManager(Campaign[] campaigns) {
		super();
		this.campaigns = campaigns;
	}

	@Override
	public void sell(Game game, Gamer gamer) {

		System.out.println(game.getName() + " oyunu " + gamer.getFirstName() + " taraf�ndan sat�n al�nd�..");
	}

	@Override
	public void sell(Game game, Gamer gamer, String codeOfCampaign) {

		for (Campaign campaign : campaigns) {
			if(campaign.getCodeOfCampaign()==codeOfCampaign) {
				System.out.println(game.getName() + " oyunu " + gamer.getFirstName() + " taraf�ndan " 
			+ codeOfCampaign + " koduyla y�zde " + campaign.getDiscountPersentage() + " indirimli sat�n al�nd�..");
			}
		}
	}

}
