package bai10;

import java.io.FileInputStream;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		//Số nén 1
		System.setIn(new FileInputStream("input.txt"));
		Scanner sc = new Scanner (System.in);
		int T = sc.nextInt();
		for(int i = 1; i <= T; i++) {
			int n = sc.nextInt();
			while(n>9) {
				n = nen(n);
			}
			System.out.println("#"+i+" "+n);
		}
		
	}
	public static int nen(int n) {
		int nen = 0;
		while(n>0) {
			nen = nen + n%10;
			n = n/10;
		}
		return nen;
	}
}
