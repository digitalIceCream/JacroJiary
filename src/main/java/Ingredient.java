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
		System.out.printf("\n\nThis is %s.\n", name);
	}

	Ingredient(String ingredientName, float ingredientAmount, float fatPer100g, float carbsPer100g,
			float proteinsPer100g) {

		this.name = ingredientName;
		this.amount = ingredientAmount;

		this.macroNutrientsPer100g.put(this.fat, fatPer100g);
		this.macroNutrientsPer100g.put(this.carbs, carbsPer100g);
		this.macroNutrientsPer100g.put(this.proteins, proteinsPer100g);

		this.macroNutrientsTotal.put(this.fat, (fatPer100g/100 * ingredientAmount));
		this.macroNutrientsTotal.put(this.carbs, (carbsPer100g/100 * ingredientAmount));
		this.macroNutrientsTotal.put(this.proteins, (proteinsPer100g/100 * ingredientAmount));

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
		recalculateTotalMacroNutrients();
	}

	public float getAmount() {
		return amount;
	}

	// Per 100g values
	public void setFatPer100g(float newAmount) {
		this.macroNutrientsPer100g.put(fat, newAmount);
		recalculateTotalMacroNutrients();
	}

	public float getFatPer100g() {
		return this.macroNutrientsPer100g.get(this.fat);
	}

	public void setCarbsPer100g(float newAmount) {
		this.macroNutrientsPer100g.put(carbs, newAmount);
		recalculateTotalMacroNutrients();
	}

	public float getCarbsPer100g() {
		return this.macroNutrientsPer100g.get(this.carbs);
	}
			
	public void setProteinsPer100g(float newAmount) {
		this.macroNutrientsPer100g.put(proteins, newAmount);
		recalculateTotalMacroNutrients();

	}

	public float getProteinsPer100g() {
		return this.macroNutrientsPer100g.get(this.proteins);
	}

	// Get macros for Ingredient of amount this.amount
	public void getTotalMacroNutrients() {
		System.out.printf("%.2f gram(s) of %s contains: \n", this.amount, this.name);
		System.out.print("Fat :\t\t\t");
		System.out.println(this.getFatPer100g()/100 * this.amount);
		System.out.print("Carbs :\t\t\t");
		System.out.println(this.getCarbsPer100g()/100 * this.amount);
		System.out.print("Protein :\t\t");
		System.out.println(this.getProteinsPer100g()/100 * this.amount);
	}

	private void recalculateTotalMacroNutrients() {
		macroNutrientsTotal.put(this.fat, (this.amount/100)*this.getFatPer100g());
		macroNutrientsTotal.put(this.carbs, (this.amount/100)*this.getCarbsPer100g());
		macroNutrientsTotal.put(this.fat, (this.amount/100)*this.getProteinsPer100g());
	}
}
