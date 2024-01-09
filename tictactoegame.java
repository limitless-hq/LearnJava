package TicTacToeGame;

import java.util.Scanner;
import java.util.HashMap;

public class Main {
	
	public static String userInput1;
	public static String userInput2;
	
	public static void initialBoard() {
		System.out.println(" 1 | 2 | 3\r\n"
				+ "-----------\r\n"
				+ " 4 | 5 | 6\r\n"
				+ "-----------\r\n"
				+ " 7 | 8 | 9");
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
	public static void gameFunction() {
		HashMap<String, String> boardFunction = new HashMap<String, String>();
		
		//Keys and values associated to the board
		boardFunction.put("1", userInput2);
		boardFunction.put("2", userInput2);
		boardFunction.put("3", userInput2);
		boardFunction.put("4", userInput2);
		boardFunction.put("5", userInput2);
		boardFunction.put("6", userInput2);
		boardFunction.put("7", userInput2);
		boardFunction.put("8", userInput2);
		boardFunction.put("9", userInput2);
		
	}
	
	public static void main(String[] args) {
		try(Scanner myScan = new Scanner(System.in)){
			System.out.println("Would you like to be X or O?");
			userInput1 = myScan.nextLine();
			myScan.close();
			System.out.println("You chose: " + userInput1);
			initialBoard();
			/*if (userInput1.equalsIgnoreCase("X") || userInput1.equalsIgnoreCase("O")) {
				char[][] board = {
                        {' ', ' ', ' '},
                        {' ', ' ', ' '},
                        {' ', ' ', ' '}
                };
                
			}
			else {
				System.out.println("Error: Something went wrong!");
			}*/
		}
		try(Scanner startGame =  new Scanner(System.in)){
			System.out.println("Where would you like to move? (Respond with number).");
			while(startGame.hasNextLine() == false) {
				continue;
			}
			userInput2 = startGame.nextLine();
			startGame.close();
			System.out.println("You chose: " + userInput2);
			
		}
		
	}
	
}
