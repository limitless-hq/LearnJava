package TicTacToeGame;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner myScan = new Scanner(System.in)){
			System.out.println("Would you like to be X or O?");
			String userInput = myScan.nextLine();
			System.out.println("You chose: " + userInput);
			
			if (userInput.equalsIgnoreCase("X")) {
				char[][] board = {
                        {' ', ' ', ' '},
                        {' ', ' ', ' '},
                        {' ', ' ', ' '}
                };
                printBoard(board);
			}
			else if (userInput.equalsIgnoreCase("O")) {
				char[][] board = {
						{' ', ' ', ' '},
						{' ', ' ', ' '},
						{' ', ' ', ' '}
				};
				printBoard(board);
			}
			else {
				System.out.println("Error: Something went wrong!");
			}
		}
	}
	public static void printBoard(char[][] board) {
		System.out.println("Printing board...");
		//some for loops for the rows and cols would work good
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				if (col < 2) {
					System.out.print(" | ");
				}
			}
			System.out.println();
			if (row < 2) {
				System.out.println("------");
			}
		}
	}
}
