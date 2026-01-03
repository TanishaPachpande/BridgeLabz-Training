package cabbyGo;

public class Driver {
	private String name;
	private int licenseNumber;
	public int rating;
	
	public String getName() {
		return name;
	}

	public int getLicenseNumber() {
		return licenseNumber;
	}
	
	public Driver(String name, int licenseNumber, int rating) {
		super();
		this.name = name;
		this.licenseNumber = licenseNumber;
		this.rating = rating;
	}
	
	public void displayDriverDetails() {
		System.out.println("Driver Name: "+ name);
		System.out.println("License Number: "+ licenseNumber);
		System.out.println("Rating: "+ rating);
	}
}
