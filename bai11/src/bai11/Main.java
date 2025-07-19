package bai11;

import java.io.FileInputStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 1; i<= T;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			for(int j = a; j<= b; j++) {
				if(snt(j)) {
					System.out.println(j);
				}
			}
			System.out.println();
		}
	}
	public static boolean snt(int n) {
		if(n ==1) return false;
		for(int i = 2 ; i <= Math.sqrt(n); i++) {
			if(n % i == 0) return false;
		}
		return true;
	}
}
