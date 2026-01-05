package campusconnect;

public class Student extends Person implements ICourseActions{
	
	private char grade;   // encapsulated
    private int gpa;

    public Student(String name, String email, int id, char grade) {
        super(name, email, id);
        this.grade = grade;
    }
	
	public void enrollCourse() {
        System.out.println(name + " enrolled in course");
    }

    public void dropCourse() {
        System.out.println(name + " dropped the course");
    }

	public void printDetails() {
		System.out.println("Student Name: "+ name);
		System.out.println("Grade: "+ grade);
		System.out.println("GPA: "+ calculateGPA(grade));
	}
	
	public int calculateGPA(char grade) {
		if(grade=='a' || grade == 'A') {
			return 5;
		}else if(grade=='b' || grade == 'B') {
			return 4;
		}
		else if(grade=='c' || grade == 'C') {
			return 3;
		}else if(grade=='d' || grade == 'D') {
			return 2;
		}else {
			return -1;
		}
	}
}
