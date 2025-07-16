package bai8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {
	static int N;
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.setIn(new FileInputStream("src/bai8/input.txt"));
		N = sc.nextInt();
		for(int i = 1; i <= N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int sum = reverse(a) + reverse(b);
			System.out.println(reverse(sum));
		}
	}
	public static int reverse(int n) {
		int reverse = 0;
		while( n > 0) {
			reverse = reverse*10 + n %10;
			n = n/10;
		}
		return reverse;
	}
}
