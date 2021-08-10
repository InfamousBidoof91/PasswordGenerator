package password;

import java.util.Random;
import java.util.Scanner;

public class RandomPasswordGenerator {
	public static void main(String[] args) {
		System.out.println("Enter the length of your password below:");
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		
		for (int i = 0; i < length; i++) {
			Random r = new Random();
			int set = r.nextInt(3) + 0;
			
			if (set ==  0) {
				System.out.print(getLETTERS());
			}
			if (set ==  1) {
				System.out.print(getLetters());
			}
			if (set ==  2) {
				System.out.print(getSymbols());
			}
			if (set ==  3) {
				System.out.print(getNumbers());
			}
		}
		// 33, 35-38, 40-42, 47, 63-64, 95,  
		// !#$%&()*/?@_
	}
	
	public static char getNumbers() {
		Random random = new Random();
		int length = random.nextInt(10) + 48;
		return (char)length;
	}
	public static char getLETTERS() {
		Random random = new Random();
		int length = random.nextInt(25) + 65;
		return (char)length;
	}
	public static char getLetters() {
		Random random = new Random();
		int length = random.nextInt(25) + 97;
		return (char)length;
	}
	public static char getSymbols() {
		String symbols = "!#$%&()*/?@_";
		Random random = new Random();
		int length = random.nextInt(12) + 0;
		return (char)symbols.charAt(length);
	}
}
