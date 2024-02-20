/*
Author:			John-Philipp Vogt
Date:			2024-02-20
Synopsis:		Class implementing the Ingredient object.
Filename:		Ingredient.java
*/
import java.util.HashMap;

class Ingredient {
	String name;
	float amount;
	HashMap<String, Float> macroNutrientsPer100g;
	HashMap<String, Float> macroNutrientsTotal;
	String fat = "fat";
	String carbs = "net carbohydrates";
	String proteins = "proteins";
	
	
	Ingredient() {
		name = "unnamed ingredient";
		System.out.printf("This is an %s.\n", name);
	}

	Ingredient(String ingredientName) {
		name = ingredientName;
		System.out.printf("This is %s.\n", name);
		}

	Ingredient(String ingredientName, float ingredientAmount,
			float fatPer100g, float carbsPer100g,
			float proteinPer100g) {

		name = ingredientName;
		amount = ingredientAmount;
		System.out.printf("This is %s.\n", name);
		macroNutrientsTotal.put(
				fat, (ingredientAmount/100)*fatPer100g);
		macroNutrientsTotal.put(
				carbs, (ingredientAmount/100)*carbsPer100g);
		macroNutrientsTotal.put(
				proteins, (ingredientAmount/100)*proteinPer100g);

		}
}
