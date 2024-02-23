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
			}
			// Edit meal.
			else if (choice == 1) {
			}
			// Record a new meal.
			else if (choice == 2) {
				System.out.printf("\nArgument list is: Butter, 8f, 82f, 1.0f, 0.8f");
				Ingredient myIngredient = new Ingredient("Butter", 8f, 82f, 1.0f, 0.8f);
				System.out.print("\n\nTotal amount is:\t");
				System.out.println(myIngredient.getAmount());
				System.out.println("\nPer 100g values are: ");
				System.out.print("Fat :\t\t\t");
				System.out.println(myIngredient.getFatPer100g());
				System.out.print("Carbs :\t\t\t");
				System.out.println(myIngredient.getCarbsPer100g());
				System.out.print("Proteins :\t\t");
				System.out.println(myIngredient.getProteinsPer100g());
				myIngredient.getTotalMacroNutrients();
				myIngredient.setCarbsPer100g(50f);
				System.out.print("\n\n******************************\n\n");
				System.out.print("\n\nTotal amount is:\t");
				System.out.println(myIngredient.getAmount());
				System.out.println("\nPer 100g values are: ");
				System.out.print("Fat :\t\t\t");
				System.out.println(myIngredient.getFatPer100g());
				System.out.print("Carbs :\t\t\t");
				System.out.println(myIngredient.getCarbsPer100g());
				System.out.print("Proteins :\t\t");
				System.out.println(myIngredient.getProteinsPer100g());
				myIngredient.getTotalMacroNutrients();
			}

			// Exit program.
			else if (choice == 3) {
				isActive = false;
			}
		
		} while (isActive);

		System.out.println("End of program.");

		}
}


