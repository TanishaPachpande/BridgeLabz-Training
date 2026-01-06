package fittrack;

abstract class Workout implements ITrackable {
    protected String type;
    protected int duration; // minutes
    protected int caloriesBurned;

    protected void logWorkout() {  // restricted access
        System.out.println("Workout logged internally");
    }

    public abstract int calculateCalories();

    public int getCaloriesBurned() {
        return caloriesBurned;
    }

    @Override
    public void startWorkout() {
        System.out.println(type + " workout started");
    }

    @Override
    public void stopWorkout() {
        System.out.println(type + " workout stopped");
        logWorkout();
    }
}
