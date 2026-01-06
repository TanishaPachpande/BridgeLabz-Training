package fittrack;

class UserProfile {
    private String name;
    private int age;
    private double weight; // protected health data
    private String goal;
    private int dailyCalorieTarget;

    // Default goal constructor
    public UserProfile(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.goal = "Stay Fit";
        this.dailyCalorieTarget = 2000;
    }

    // Custom goal constructor
    public UserProfile(String name, int age, double weight, String goal, int dailyTarget) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.goal = goal;
        this.dailyCalorieTarget = dailyTarget;
    }

    // Encapsulation: controlled access
    public double getWeight() {
        return weight;
    }

    public int getDailyCalorieTarget() {
        return dailyCalorieTarget;
    }

    public void showProfile() {
        System.out.println("User: " + name);
        System.out.println("Goal: " + goal);
        System.out.println("Daily Target: " + dailyCalorieTarget + " calories");
    }
}
