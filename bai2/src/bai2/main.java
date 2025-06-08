package bai2;

import java.util.Scanner;

//chuyển đổi cơ số 2 sang cơ số N


public class main {

	public static void TenToTow (int n) {
		if( n < 2) {
			System.out.print(n);
		}else {
			TenToTow(n/2);
			System.out.print(" "+ n%2);
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhập số cần chuyển sang cơ số 2: ");
		int n = sc.nextInt();
		TenToTow(n);
	}
}
