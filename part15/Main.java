package part15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some words:");
		String text = sc.nextLine();
		word(text);
	}

	static void word(String s) {
		String[] t = s.split("[ ]");
		int x = t.length;
		System.out.println(x);

	}
}
