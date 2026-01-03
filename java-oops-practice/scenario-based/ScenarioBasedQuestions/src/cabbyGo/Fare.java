package cabbyGo;

public class Fare {
	private int baseFare=100;
	public int rate;
	public int distance;
	
	public Fare(int rate, int distance) {
		this.rate = rate;
		this.distance = distance;
	}
	
	public int calculateFare() {
		return (baseFare+ (distance*rate));
	}
	
}
