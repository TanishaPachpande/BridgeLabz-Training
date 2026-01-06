package edumentor;

public class Learner extends User implements ICertifiable {

	String courseType;
	
	public Learner(String name, String email, int userId, String courseType) {
		super(name, email, userId);
		this.courseType = courseType;
	}

	public void generateCertificate() {
		if(courseType.equalsIgnoreCase("short time")) {
			System.out.println("Certificate Generated for short-time course");
		}else {
			System.out.println("Certificate Generated for full-time course");
		}
	}
}
