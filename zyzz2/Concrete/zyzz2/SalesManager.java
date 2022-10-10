package zyzz2;

public class SalesManager implements ISalesService{
	
	private Campaign[] campaigns;

	public SalesManager(Campaign[] campaigns) {
		super();
		this.campaigns = campaigns;
	}

	@Override
	public void sell(Game game, Gamer gamer) {

		System.out.println(game.getName() + " oyunu " + gamer.getFirstName() + " tarafýndan satýn alýndý..");
	}

	@Override
	public void sell(Game game, Gamer gamer, String codeOfCampaign) {

		for (Campaign campaign : campaigns) {
			if(campaign.getCodeOfCampaign()==codeOfCampaign) {
				System.out.println(game.getName() + " oyunu " + gamer.getFirstName() + " tarafýndan " 
			+ codeOfCampaign + " koduyla yüzde " + campaign.getDiscountPersentage() + " indirimli satýn alýndý..");
			}
		}
	}

}
