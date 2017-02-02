package part11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] x = { 3, 4, 5, 4, 3, 11, 2 };
		System.out.println(a(x));
	}

	static int a(int[] t) {
		int max;
		max = t[0];
		for (int i = 0; i < t.length; i++) {
			if (t[i] > max) {
				max = t[i];
			}
		}
		return max;
	}

}
