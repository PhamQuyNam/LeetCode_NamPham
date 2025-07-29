package bai21_Logo_Doi_Xung;

import java.io.FileInputStream;
import java.util.Scanner;

public class Main {
	static boolean doiXungTheoTrucTung(int[][] n, int N) {
		if(N%2==0) {
			for(int i = 0; i < N; i++) {
				for(int j = 0; j<=N/2; j++) {
					if(n[i][j] == n[i][N-j-1]){
						continue;
					}else {
						return false;
					}
				}
			}
		}else {
			for(int i = 0; i < N; i++) {
				for(int j = 0; j<N/2; j++) {
					if(n[i][j] == n[i][N-j-1]){
						continue;
					}else {
						return false;
					}
				}
			}
		}
		return true;
	}
	static boolean doiXungTheoTrucHoanh(int[][] n, int N) {
		if(N%2==0) {
			for(int i = 0; i <=N/2; i++) {
				for(int j = 0; j<N; j++) {
					if(n[i][j] == n[N-i-1][j]){
						continue;
					}else {
						return false;
					}
				}
			}
		}else {
			for(int i = 0; i <N/2; i++) {
				for(int j = 0; j<N; j++) {
					if(n[i][j] == n[N-i-1][j]){
						continue;
					}else {
						return false;
					}
				}
			}
		}
		return true;
	}
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 1; i <= T; i++) {
			int N = sc.nextInt();
			int[][] n = new int[N][N];
			for(int j = 0; j< N; j++) {
				for(int j1 = 0; j1< N; j1++) {
					n[j][j1] = sc.nextInt();
				}
			}
			if(doiXungTheoTrucTung(n, N) && doiXungTheoTrucHoanh(n, N)) {
				System.out.println("#"+i+" "+ "YES");
			}else {
				System.out.println("#"+i+" "+ "NO");
			}
		}
	}
}
