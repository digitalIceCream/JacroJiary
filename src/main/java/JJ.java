/*
Author:			John-Philipp Vogt
Date:			2024-02-17
Synopsis:		Main JJ source file.
Filename:		JJ.java
*/

public class JJ {

	public static void main(String[] args) {

		boolean isActive = true;

			System.out.println("Hello user.");
			System.out.println("Your current budget is:\n");
			System.out.println("<daily macro budget placeholder>\n");

		do {
			int choice = Menu.main();

			// View current budget.
			if (choice == 0) {
				System.out.printf("Choice is %d%n", choice);
			}
			// Edit meal.
			else if (choice == 1) {
				System.out.printf("Choice is %d%n", choice);
			}
			// Record a new meal.
			else if (choice == 2) {
				System.out.printf("Choice is %d%n", choice);
				System.out.printf("\nArgument list is: Butter, 8f, 82f, 1.0f, 0.8f");
				
				Ingredient myIngredient = new Ingredient("Butter", 8f, 82f, 1.0f, 0.8f);
				System.out.println("Init values are: ");
				System.out.println(myIngredient.getFatPer100g());
				System.out.println(myIngredient.getCarbsPer100g());
				System.out.println(myIngredient.getProteinsPer100g());
				System.out.println("Total amount is: ");
				System.out.println(myIngredient.getAmount());
				myIngredient.setFatPer100g(50f);
				myIngredient.setCarbsPer100g(50f);
				myIngredient.setProteinsPer100g(50f);
				System.out.println(myIngredient.getFatPer100g());
				System.out.println(myIngredient.getCarbsPer100g());
				System.out.println(myIngredient.getProteinsPer100g());
				myIngredient.getTotalMacroNutrients();

			}
			// Exit program.
			else if (choice == 3) {
				System.out.printf("Choice is %d%n", choice);
				isActive = false;
			}
		
		} while (isActive);

		System.out.println("End of program.");

		}
}


