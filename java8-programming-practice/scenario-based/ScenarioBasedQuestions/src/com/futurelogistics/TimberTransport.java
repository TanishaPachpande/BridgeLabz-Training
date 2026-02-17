package com.futurelogistics;

public class TimberTransport extends GoodsTransport {
	private float timberLength;
	private float timberRadius;
	private String timberType;
	private float timberPrice;
	
	public TimberTransport(String transportId, String transportDate, int transportRating, float timberLength,
			float timberRadius, String timberType, float timberPrice) {
		super(transportId, transportDate, transportRating);
		this.timberLength = timberLength;
		this.timberRadius = timberRadius;
		this.timberType = timberType;
		this.timberPrice = timberPrice;
	}
	
	@Override
	public String vehicleSelection() {
		float area = 2*3.147f*timberRadius*timberLength;
		if(area<250) {
			return "Truck";
		}else if(area>=250 && area<=400) {
			return "Lorry";
		}else {
			return "MonsterLorry";
		}
	}

	@Override
	public float calculateTotalCharge() {
		float volume = 3.147f*timberRadius*timberRadius*timberLength;
		float price=0.0f;
		float rate = 0.0f;
		float discountPercent=0.0f;
		int vehiclePrice=0;
		if(timberType.equals("Premium")) {
			rate=0.25f;
		}else {
			rate=0.15f;
		}
		price = volume*timberPrice*rate;
		float tax = price*0.3f;
		if(transportRating==5) {
			discountPercent=0.2f;
		}else if(transportRating==3 || transportRating==4) {
			discountPercent=0.1f;
		}
		
		String vehicleType = vehicleSelection();
		if(vehicleType.equals("Truck")) {
			vehiclePrice=1000;
		}else if(vehicleType.equals("Lorry")) {
			vehiclePrice=1700;
		}else {
			vehiclePrice=3000;
		}
		
		float discount = price*discountPercent/100;
		float totalCharge = (price+vehiclePrice+tax)-discount;
		return totalCharge;
	}
	
	public float getTimberLength() {
		return timberLength;
	}
	public void setTimberLength(float timberLength) {
		this.timberLength = timberLength;
	}
	public float getTimberRadius() {
		return timberRadius;
	}
	public void setTimberRadius(float timberRadius) {
		this.timberRadius = timberRadius;
	}
	public String getTimberType() {
		return timberType;
	}
	public void setTimberType(String timberType) {
		this.timberType = timberType;
	}
	public float getTimberPrice() {
		return timberPrice;
	}
	public void setTimberPrice(float timberPrice) {
		this.timberPrice = timberPrice;
	}	
}
