package tictactoe;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		try(Scanner scanner = new Scanner(System.in)) {
			
			final String inputStr = scanner.nextLine().replace("\"", "");
			horizontalLine();
			
			for (int i = 0; i < inputStr.length(); i++) {
				if (i % 3 == 0) {
					System.out.print("| " + inputStr.charAt(i) + " ");
				} else if (i == 2 || i == 5 || i == 8) {
					System.out.print(inputStr.charAt(i) + " |\n");
				} else {
					System.out.print(inputStr.charAt(i) + " ");
				}
			}
			
			horizontalLine();

		} catch (Exception e) {
			System.out.println("Что-то пошло не так...");
		};
		
	}
	
	private static void horizontalLine() {
		System.out.println("---------");
	}

}
