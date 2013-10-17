package Model;

public class Ads {
	
	private String name;
	private String producer;
	private String image;
	private String startDate;
	private String endDate;
	private String description;
	private String cat;
	private String savedAd;


	public Ads(String A,String B ,String C ,String D ,String E ,String F, String H, String I){
		name = A;
		producer = B;
		image = C;
		startDate = D;
		endDate = E;
		description = F;
		cat = H;
		savedAd = I;
		
	}
	
	
	public String getName(){
		return name;
	}

	public String getProducer(){
		return producer;
	}
	
	public String getImage(){
		return image;
	}
	
	public String getStartDate(){
		return startDate;
	}
	
	public String getEndDate(){
		return endDate;
	}
	public String getDescription(){
		return description;
	}
	public String getCat(){
		return cat;
	}
	public String getSavedAd(){
		return savedAd;
	}


}