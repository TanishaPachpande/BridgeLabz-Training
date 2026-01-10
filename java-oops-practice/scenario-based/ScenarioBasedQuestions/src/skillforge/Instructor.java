package skillforge;



public class Instructor extends User {

	public Instructor(String name, String email) {
	        super(name, email);
	}
	
	public void uploadCourse(String courseName) {
        System.out.println("Instructor " + name + " uploaded course: " + courseName);
    }
}
