package part14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number that you are seeking:");
		int x = sc.nextInt();
		int[] a = { 1, 2, 3, 4, 4, 4, 4, 4, 2, 2, 12, 12, 12, 1 };
		System.out.println("Its index is:");
		search(a, x);
	}

	static void search(int[] x, int a) {
		int d = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] == a) {
				System.out.println(i);
				d++;
			}
		}
		if (d == 0) {
			System.out.println("-1");
		}
	}
}
