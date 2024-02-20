/*
Author:			John-Philipp Vogt
Date:			2024-02-20
Synopsis:		Class implementing the Ingredient object.
Filename:		Ingredient.java
*/

class Ingredient {
	String name;
	HashMap<String, MacroNutrient> macroNutrientsPer100g;
	float amount;
	HashMap<String, float> macroNutrientsTotal;
	
	Ingredient {
		System.out.println("This is an ingredient.");

		}
}


