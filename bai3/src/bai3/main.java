package bai3;

import java.util.Scanner;

public class main {
	// bai toan thap ha noi
	public static void chuyenDoi(int n, char A, char B) {
		System.out.println("chuyen dia thu "+n+" tu cot "+ A+ " sang cot "+ B);
	}
	public static void dequy(int n, char A, char B, char C) {
		if(n== 1) {
			chuyenDoi(n, A, C);
		}else {
			dequy(n-1, A, C, B);
			chuyenDoi(n, A, C);
			dequy(n-1, B, A, C);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so dia can chuyen n = ");
		int n = sc.nextInt();
		char A = 'A',B = 'B',C = 'C';
		dequy(n, A, B, C);
	}
}
