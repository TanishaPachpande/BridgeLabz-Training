package campusconnect;

public class Faculty extends Person {
	
		
	public Faculty(String name, String email, int id) {
		super(name, email, id);
	}

	public void printDetails(){
		System.out.println("Faculty Name: "+ name);
	}
}
