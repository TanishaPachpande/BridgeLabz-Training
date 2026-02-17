package com.futurelogistics;

public class Utility {
	public GoodsTransport parseDetails(String input) throws InvalidIdException {
		String[] arr = input.split(":");
		String id = arr[0];
		if(validateTransportId(id)) {
			if(arr[3].equalsIgnoreCase("BrickTransport")) {
				return new BrickTransport(arr[0],arr[1],Integer.parseInt(arr[2]), Float.parseFloat(arr[4]), Integer.parseInt(arr[5]), Float.parseFloat(arr[6]));
			}else {
				return new TimberTransport(arr[0],arr[1],Integer.parseInt(arr[2]), Integer.parseInt(arr[4]), Integer.parseInt(arr[5]), arr[6], Integer.parseInt(arr[7]));
			}
		}else {
			throw new InvalidIdException("Transport id "+ id +" is invalid\n Please provide a valid record");
		}
		
	}
	
	public boolean validateTransportId(String transportId) {
		String regex = "RTS[0-9]{3}[A-Z]";
		if(transportId.matches(regex)) {
			return true;
		}
		return false;
	}
	
	public String findObjectType(GoodsTransport goodsTransport) {
		if(goodsTransport instanceof TimberTransport) {
			return "TimberTransport";
		}else if(goodsTransport instanceof BrickTransport) {
			return "BrickTransport";
		}
		return null;
	}
}
