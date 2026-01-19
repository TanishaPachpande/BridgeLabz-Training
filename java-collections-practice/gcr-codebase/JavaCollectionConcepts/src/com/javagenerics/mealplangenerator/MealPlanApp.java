package com.javagenerics.mealplangenerator;

public class MealPlanApp {

    public static void main(String[] args) {

        Meal<VegetarianMeal> meal1 =
                MealGenerator.generateMeal("Tanisha", new VegetarianMeal());

        Meal<VeganMeal> meal2 =
                MealGenerator.generateMeal("Amit", new VeganMeal());

        Meal<KetoMeal> meal3 =
                MealGenerator.generateMeal("Riya", new KetoMeal());

        Meal<HighProteinMeal> meal4 =
                MealGenerator.generateMeal("Rahul", new HighProteinMeal());

        meal1.displayMeal();
        meal2.displayMeal();
        meal3.displayMeal();
        meal4.displayMeal();
    }
}

