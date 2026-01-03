package UniversityCourseEnrollmentSystem;

class Undergraduate extends Student implements Graded {

    public Undergraduate(int id, String name) {
        super(id, name);
    }

    public void assignGrade(double marks) {
        if (marks >= 40) {
            setGpa(2.5); // pass
        } else {
            setGpa(0.0); // fail
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Undergraduate | " + getTranscript());
    }
}

