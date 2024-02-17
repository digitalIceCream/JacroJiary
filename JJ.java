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
			
			if (choice == 0) {
				System.out.printf("Choice is %d%n", choice);
			}
			else if (choice == 1) {
				System.out.printf("Choice is %d%n", choice);
			}
			else if (choice == 2) {
				System.out.printf("Choice is %d%n", choice);
			}
			else if (choice == 3) {
				System.out.printf("Choice is %d%n", choice);
				isActive = false;
			}
		
		} while (isActive);

		System.out.println("End of program.");

		}
}


