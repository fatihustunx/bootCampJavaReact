package zyzz2;

public class Campaign {

	private int Id;
	private String CodeOfCampaign;
	private int DiscountPersentage;
	
	public Campaign(int id, String codeOfCampaign, int discountPersentage) {
		super();
		Id = id;
		CodeOfCampaign = codeOfCampaign;
		DiscountPersentage = discountPersentage;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getCodeOfCampaign() {
		return CodeOfCampaign;
	}

	public void setCodeOfCampaign(String codeOfCampaign) {
		CodeOfCampaign = codeOfCampaign;
	}

	public int getDiscountPersentage() {
		return DiscountPersentage;
	}

	public void setDiscountPersentage(int discountPersentage) {
		DiscountPersentage = discountPersentage;
	}
	
}
