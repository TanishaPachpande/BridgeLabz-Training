package fittrack;

class CardioWorkout extends Workout {

    public CardioWorkout(int duration) {
        this.type = "Cardio";
        this.duration = duration;
        this.caloriesBurned = calculateCalories();
    }

    public int calculateCalories() {
        return duration * 8; // higher burn rate
    }
}
