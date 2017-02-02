package part13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height:");
		int x = sc.nextInt();
		System.out.println("Enter width:");
		int y = sc.nextInt();
		rec(x, y);
	}

	static void rec(int a, int b) {
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				if (i == 0 || i == a - 1) {
					System.out.print("*");
				} else {
					if (j == 0 || j == b - 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}

			}
			System.out.println();
		}
	}
}
