package campusconnect;
import java.util.ArrayList;
import java.util.List;

public class Course {
	String courseName;
	Faculty faculty;
	List<Student> students;
	
	public Course(String courseName, Faculty faculty) {
        this.courseName = courseName;
        this.faculty = faculty;
        this.students = new ArrayList<>();
    }
	
	public void addStudent(Student s) {
		students.add(s);
	}
	
	public void displayStudentsList() {
		for(Student student: students) {
			System.out.println("Student name: "+ student.name);
			System.out.println("Faculty name: "+ faculty.name);
		}
	}
}
