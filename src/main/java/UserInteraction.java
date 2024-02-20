/*
Author:			John-Philipp Vogt
Date:			2024-02-17
Synopsis:		Helper class that implement user interaction.
Filename:		UserInteraction.java
*/

import java.util.Scanner;
// import java.util.ArrayList;

 class  UserInteraction {

	 static int getUserInput() {

		 Scanner s = new Scanner(System.in);
		 System.out.print("Your choice: ");
		 int choice = s.nextInt();

		 return choice;
	 }

}
