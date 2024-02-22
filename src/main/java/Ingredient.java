/*
Author:			John-Philipp Vogt
Date:			2024-02-20
Synopsis:		Class implementing the Ingredient object.
Filename:		Ingredient.java
*/
import java.util.HashMap;

class Ingredient {
	
	private String name;
	private float amount;
	private HashMap<String, Float> macroNutrientsPer100g = new HashMap<String, Float>();
	private HashMap<String, Float> macroNutrientsTotal = new HashMap<String, Float>();
	private final String fat = "fat";
	private final String carbs = "net carbohydrates";
	private final String proteins = "proteins";
	
	
	Ingredient() {
		name = "unnamed ingredient";
		System.out.printf("This is an %s.\n", name);
	}

	Ingredient(String ingredientName) {
		name = ingredientName;
		System.out.printf("This is %s.\n", name);
		}

	Ingredient(String ingredientName, float ingredientAmount, float fatPer100g, float carbsPer100g,
			float proteinPer100g) {

		name = ingredientName;
		amount = ingredientAmount;

		macroNutrientsPer100g.put(fat, fatPer100g);
		macroNutrientsPer100g.put(carbs, carbsPer100g);
		macroNutrientsPer100g.put(proteins, proteinPer100g);

		macroNutrientsTotal.put(fat, (ingredientAmount/100)*fatPer100g);
		macroNutrientsTotal.put(carbs, (ingredientAmount/100)*carbsPer100g);
		macroNutrientsTotal.put(proteins, (ingredientAmount/100)*proteinPer100g);

		System.out.printf("This is %s at %.2f.\n", name, ingredientAmount);
		}

	// Name and total amount 
	public void setName(String newName) {
		this.name = newName;
	}

	public String getName() {
		return name;
	}

	public void setAmount(float newAmount) {
		this.amount = newAmount;
		recalculateTotalMacroNutrients(newAmount);
	}

	public float getAmount() {
		return amount;
	}

	// Per 100g values
	public void setFatPer100g(float newAmount) {
		this.macroNutrientsPer100g.put(fat, newAmount);
		recalculateTotalMacroNutrients(this.amount);
	}

	public float getFatPer100g() {
		return this.macroNutrientsPer100g.get(this.fat);
	}

	public void setCarbsPer100g(float newAmount) {
		this.macroNutrientsPer100g.put(carbs, newAmount);
		recalculateTotalMacroNutrients(this.amount);
	}

	public float getCarbsPer100g() {
		return this.macroNutrientsPer100g.get(this.carbs);
	}
			
	public void setProteinsPer100g(float newAmount) {
		this.macroNutrientsPer100g.put(proteins, newAmount);
		recalculateTotalMacroNutrients(this.amount);

	}

	public float getProteinsPer100g() {
		return this.macroNutrientsPer100g.get(this.proteins);
	}

	// Get macros for Ingredient of amount this.amount
	public void getTotalMacroNutrients() {
		System.out.printf("%.2f grams of %s contains: \n", this.amount, this.name);
		System.out.println(this.getFatPer100g() * this.amount);
		System.out.println(this.getCarbsPer100g() * this.amount);
		System.out.println(this.getFatPer100g() * this.amount);
	}
	

	private void recalculateTotalMacroNutrients(float amount) {
		macroNutrientsTotal.put(this.fat, (amount/100)*this.getFatPer100g());
		macroNutrientsTotal.put(this.carbs, (amount/100)*this.getCarbsPer100g());
		macroNutrientsTotal.put(this.fat, (amount/100)*this.getProteinsPer100g());
	}
	









	


}
