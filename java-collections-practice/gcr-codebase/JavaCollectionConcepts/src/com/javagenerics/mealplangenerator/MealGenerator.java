package com.javagenerics.mealplangenerator;

class MealGenerator {

    public static <T extends MealPlan> Meal<T> generateMeal(
            String userName, T mealPlan) {

        if (mealPlan.getCalories() < 1500 || mealPlan.getCalories() > 2500) {
            throw new IllegalArgumentException("Invalid calorie range!");
        }

        return new Meal<>(userName, mealPlan);
    }
}

