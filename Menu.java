/*
Author:			John-Philipp Vogt
Date:			2024-02-17
Synopsis:		Helper class containing static methods for menus.
Filename:		Menu.java
*/

 class Menu {

	 static int main() {

		 System.out.println("Please choose:");
		 System.out.println("");
		 System.out.println("0 -- View current budget.");
		 System.out.println("1 -- Edit meal.");
		 System.out.println("2 -- Record a new meal.");
		 System.out.println("3 -- Exit program.");
		 System.out.println("");

		 int choice = UserInteraction.getUserInput();

		 return choice;

		}
}


