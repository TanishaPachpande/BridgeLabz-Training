package UniversityCourseEnrollmentSystem;

class Postgraduate extends Student implements Graded {

    public Postgraduate(int id, String name, double gpa) {
        super(id, name, gpa);
    }

    public void assignGrade(double marks) {
        double calculatedGpa;

        if (marks >= 85)
            calculatedGpa = 4.0;
        else if (marks >= 70)
            calculatedGpa = 3.5;
        else if (marks >= 60)
            calculatedGpa = 3.0;
        else
            calculatedGpa = 2.0;

        setGpa(calculatedGpa);
    }

    @Override
    public void displayInfo() {
        System.out.println("Postgraduate | " + getTranscript());
    }
}
