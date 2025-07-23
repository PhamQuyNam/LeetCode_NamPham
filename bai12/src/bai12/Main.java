package bai12;

import java.io.FileInputStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 1; i <= T; i++) {
			int n = sc.nextInt();
			int sum = 0;
			for(int j = 1; j <= n ; j++) {
				int y = n/j;
				sum = (sum + j * y) % 1000007;
			}
			System.out.println(sum);
		}
	}
}
