package part12;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String t = sc.nextLine();
		System.out.println("Enter integer:");
		int x = sc.nextInt();
		System.out.println("Enter double:");
		double d = sc.nextDouble();
		System.out.println(s(x, d, t));
	}

	static String s(int a, double b, String c) {
		double d = a + b;
		return c + " " + d;

	}
}
