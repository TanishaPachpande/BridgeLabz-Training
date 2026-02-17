package com.futurelogistics;

public class BrickTransport extends GoodsTransport {
	private float brickSize;
	private int brickQuantity;
	private float brickPrice;
	
	public BrickTransport(String transportId, String transportDate, int transportRating, float brickSize,
			int brickQuantity, float brickPrice) {
		super(transportId, transportDate, transportRating);
		this.brickSize = brickSize;
		this.brickQuantity = brickQuantity;
		this.brickPrice = brickPrice;
	}

	@Override
	public String vehicleSelection() {
		if(this.brickQuantity<300) {
			return "Truck";
		}else if(this.brickQuantity>=300 && this.brickQuantity<=500) {
			return "Lorry";
		}else {
			return "MonsterLorry";
		}
	}

	@Override
	public float calculateTotalCharge() {
		float totalBrickCost = brickQuantity*brickPrice;
		float tax = totalBrickCost*0.3f;
		float discount = 0.0f;
		int vehiclePrice=0;
		if(transportRating==5) {
			discount = totalBrickCost*0.2f;
		}else if(transportRating==3 || transportRating==4) {
			discount = totalBrickCost*0.1f;
		}
		
		String vehicleType = vehicleSelection();
		if(vehicleType.equals("Truck")) {
			vehiclePrice=1000;
		}else if(vehicleType.equals("Lorry")) {
			vehiclePrice=1700;
		}else {
			vehiclePrice=3000;
		}
		
		float totalCharge = (totalBrickCost+vehiclePrice+tax)-discount;
		return totalCharge;
	}

	public float getBrickSize() {
		return brickSize;
	}

	public void setBrickSize(float brickSize) {
		this.brickSize = brickSize;
	}

	public int getBrickQuantity() {
		return brickQuantity;
	}

	public void setBrickQuantity(int brickQuantity) {
		this.brickQuantity = brickQuantity;
	}

	public float getBrickPrice() {
		return brickPrice;
	}

	public void setBrickPrice(float brickPrice) {
		this.brickPrice = brickPrice;
	}
	
	
	
}
