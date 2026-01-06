package fittrack;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User Profile Input
        System.out.println("---- Enter User Details ----");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Age: ");
        int age = sc.nextInt();

        System.out.print("Weight (kg): ");
        double weight = sc.nextDouble();
        sc.nextLine(); // consume newline

        System.out.print("Fitness Goal: ");
        String goal = sc.nextLine();

        System.out.print("Daily Calorie Target: ");
        int dailyTarget = sc.nextInt();

        UserProfile user = new UserProfile(name, age, weight, goal, dailyTarget);

        // Workout Input
        System.out.println("\n---- Select Workout Type ----");
        System.out.println("1. Cardio Workout");
        System.out.println("2. Strength Workout");
        System.out.print("Choice: ");
        int choice = sc.nextInt();

        System.out.print("Workout Duration (minutes): ");
        int duration = sc.nextInt();

        Workout workout;

        if (choice == 1) {
            workout = new CardioWorkout(duration);
        } else {
            workout = new StrengthWorkout(duration);
        }

        // Tracking workout
        workout.startWorkout();
        workout.stopWorkout();

        int caloriesBurned = workout.getCaloriesBurned();
        int remainingCalories = user.getDailyCalorieTarget() - caloriesBurned;

        // Output
        System.out.println("\n---- Daily Progress ----");
        user.showProfile();
        System.out.println("Calories Burned: " + caloriesBurned);
        System.out.println("Remaining Calories for Today: " + remainingCalories);

        sc.close();
    }
}
