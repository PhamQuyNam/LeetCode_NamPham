package bai20_Count_The_Pairs;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	
	static int[] selectionSort(int[] a) {
		int n = a.length;
		for(int i = 0; i < n-1; i++) {
			int maxid = i;
			for(int j = i+1; j < n; j++) {
				if(a[j]>a[maxid]) {
					maxid = j;
				}
			}
			int t = a[i];
			a[i] = a[maxid];
			a[maxid] = t;
		}
		return a;
	}
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 1; i<= T; i++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int[] ds = new int[N];
			for(int j =0; j < N; j++) {
				ds[j] = sc.nextInt();
			}
			selectionSort(ds);
			int dem = 0;
			for(int j = 0; j<N-1; j++) {
				for(int z = j +1; z< N; z++) {
					if(ds[j] - ds[z] == K) {
						dem ++;
					}
				}
			}
			System.out.println(dem);
		}
	}
}
