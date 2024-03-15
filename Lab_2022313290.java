package lab1;

import java.util.Scanner;
import java.util.ArrayList;

public class Lab_2022313290 {

	public static void main(String[] args) {
		char[] digits = "0123456789abcdef".toCharArray();
		Scanner s = new Scanner(System.in);
		long input = s.nextLong();
		ArrayList<Character> charStack = new ArrayList<Character>();
		charStack.clear();
		boolean firstNonzero;

		// Binary
		for (int i = 0; i < 64; i++) {
			char c = digits[(int) (input >>> i) % 2];
			charStack.add(c);
		}
		System.out.print("b ");
		firstNonzero = false;
		for (int i = charStack.size() - 1; i >= 0; i--) {
			if (charStack.get(i) > '0') {
				firstNonzero = true;
			}
			
			if (firstNonzero) {
				System.out.print(charStack.get(i));
			}
		}
		System.out.println();

		// Octal
		charStack.clear();
		for (int i = 0; i < 64 / 3; i++) {
			char c = digits[(int) (input >>> (i * 3)) % 8];
			charStack.add(c);
		}
		System.out.print("o ");
		firstNonzero = false;
		for (int i = charStack.size() - 1; i >= 0; i--) {
			if (charStack.get(i) > '0') {
				firstNonzero = true;
			}
			
			if (firstNonzero) {
				System.out.print(charStack.get(i));
			}
		}
		System.out.println();
		
		// Hex
		charStack.clear();
		for (int i = 0; i < 64 / 4; i++) {
			char c = digits[(int) (input >>> (i * 4)) % 16];
			charStack.add(c);
		}
		System.out.print("h ");
		firstNonzero = false;
		for (int i = charStack.size() - 1; i >= 0; i--) {
			if (charStack.get(i) != '0') {
				firstNonzero = true;
			}
			
			if (firstNonzero) {
				System.out.print(charStack.get(i));
			}
		}
		System.out.println();

	}

}
