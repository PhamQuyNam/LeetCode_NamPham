package bài1;

import java.util.Scanner;

public class main {

//	Tính S=1+1.2+1.2.3+…..+1.2.3…n với n>0
	
	// p(n) = p(n-1) + n!
	
	public static long Q(int n) {
		if(n == 0)return 1;
		if(n == 1)return 1;
		return  Q(n-1)*n;
	}
	
	public static long P(int n) {
		if(n == 1) return 1;
		return P(n-1) + Q(n);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập n");
		int n = sc.nextInt();
		long p = P(n);
		System.out.println("kết quả: "+ p);
		
	}
}
