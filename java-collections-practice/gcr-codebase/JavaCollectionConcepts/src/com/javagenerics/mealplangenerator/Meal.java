package com.javagenerics.mealplangenerator;

class Meal<T extends MealPlan> {

    private String userName;
    private T mealPlan;

    public Meal(String userName, T mealPlan) {
        this.userName = userName;
        this.mealPlan = mealPlan;
    }

    public T getMealPlan() {
        return mealPlan;
    }

    public void displayMeal() {
        System.out.println("User Name : " + userName);
        System.out.println("Meal Type : " + mealPlan.getMealType());
        System.out.println("Calories  : " + mealPlan.getCalories());
        System.out.println("--------------------------");
    }
}

