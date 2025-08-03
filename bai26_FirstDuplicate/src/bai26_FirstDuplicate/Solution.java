package bai26_FirstDuplicate;

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {
	static int n;
	static int[] a;
	static void check(int t){
		for(int i = 1; i<n ; i++) {
				for(int j = 0; j < i; j++) {
					if(a[i] == a[j]) {
						System.out.println("#"+t+" "+a[i]);
						return;
					}
				}
		}
		System.out.println("#"+t+" -1");	
		
	}
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t = 1; t<=T; t++) {
			n = sc.nextInt();
			a = new int[n];
			for(int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			check(t);
			
		}
	}
}
