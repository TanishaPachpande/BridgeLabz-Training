package skillforge;

public class Student extends User implements ICertifiable {

    private int completedModules;
    private int totalModules;

    public Student(String name, String email, int totalModules) {
        super(name, email);
        this.totalModules = totalModules;
        this.completedModules = 0;
    }

    // operator usage for progress
    public void completeModule() {
        if (completedModules < totalModules) {
            completedModules++;
        }
    }

    public int getProgressPercentage() {
        return (completedModules * 100) / totalModules;
    }

    @Override
    public void generateCertificate() {
        if (getProgressPercentage() == 100) {
            System.out.println("Certificate Generated for Student: " + name);
        } else {
            System.out.println("Course not completed yet!");
        }
    }
}
