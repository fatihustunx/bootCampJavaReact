package zyzz2;

public class CampaignManager implements ICampaignServise {

	@Override
	public void add(Campaign campaign) {

		System.out.println("Kampanya eklendi : " + campaign.getCodeOfCampaign());
	}

	@Override
	public void update(Campaign campaign) {
		
		System.out.println("Kampanya güncellendi : " + campaign.getCodeOfCampaign());
	}

	@Override
	public void delete(Campaign campaign) {

		System.out.println("Kampanya silindi : " + campaign.getCodeOfCampaign());
	}

}
