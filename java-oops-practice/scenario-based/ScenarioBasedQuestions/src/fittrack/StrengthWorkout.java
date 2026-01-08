package fittrack;

class StrengthWorkout extends Workout {

    public StrengthWorkout(int duration) {
        this.type = "Strength";
        this.duration = duration;
        this.caloriesBurned = calculateCalories();
    }

    public int calculateCalories() {
        return duration * 5;
    }
}
