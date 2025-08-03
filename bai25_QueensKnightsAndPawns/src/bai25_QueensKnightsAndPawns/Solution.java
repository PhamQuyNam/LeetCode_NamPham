package bai25_QueensKnightsAndPawns;

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {
	static int N, M;
	static int[][] a; 
	static int[] dx = {-1, 0, 1, -1, 1, -1, 0, 1}; // hướng ngang
	static int[] dy = {-1,-1,-1, 0, 0, 1, 1, 1}; // hướng dọc
	static int[] kx = {-2, -2, -1, -1, 1, 1, 2, 2};
	static int[] ky = {-1, 1, -2, 2, -2, 2, -1, 1};
	
	static void Qphu(int r, int c) {
	    for(int i = 0; i < 8 ; i++) {
	        int row = r + dy[i];
	        int col = c + dx[i];
	        while(row >= 0 && row < N && col >= 0 && col < M) {
	        	if(a[row][col] == 1) break;
	            if(a[row][col] == 0) a[row][col] = 2;
	            
	            row += dy[i];
	            col += dx[i];
	        }
	    }
	}
	
	static void Kphu(int r, int c) {
	    for(int i = 0; i < 8 ; i++) {
	        int row = r + ky[i];
	        int col = c + kx[i];
	        if(row >= 0 && row < N && col >= 0 && col < M  ) {
	            if(a[row][col] == 0) {
	            	a[row][col] = 2;
	            }
	        	
	        }
	    }
	}
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);
		int test = 1;
		while(true) {
			N = sc.nextInt();
			M = sc.nextInt();
			a = new int[N][M];
			if(N == 0 && M == 0) break;
			for(int i = 0; i < N; i++) {
				for(int j = 0; j< M; j++) {
					a[i][j] =0;	
				}
			}
			//NHAP TOA DO CUA Q
			int q  = sc.nextInt();
			int[] Qr = new int[q];
			int[] Qc = new int[q];
			for(int i = 0; i<q; i++) {
				Qr[i] = sc.nextInt()-1;
				Qc[i] = sc.nextInt()-1;
				a[Qr[i]][Qc[i]] =1;
			}
			//NHAP TOA DO CUA K
			int k  = sc.nextInt();
			int[] Kr = new int[k];
			int[] Kc = new int[k];
			for(int i = 0; i<k; i++) {
				Kr[i] = sc.nextInt()-1;
				Kc[i] = sc.nextInt()-1;
				a[Kr[i]][Kc[i]] =1;
			}
			//NHAP TOA DO CUA P
			int p  = sc.nextInt();
			int[] Pr = new int[p];
			int[] Pc = new int[p];
			for(int i = 0; i<p; i++) {
				Pr[i] = sc.nextInt()-1;
				Pc[i] = sc.nextInt()-1;
				a[Pr[i]][Pc[i]] =1;
			}
			for(int i =0; i <q; i++) Qphu(Qr[i], Qc[i]);
			for(int i =0; i <k; i++) Kphu(Kr[i], Kc[i]);
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j< M; j++) {
					System.out.print(a[i][j] + " ");	
				}
				System.out.println();
			}
			
			int dem= 0;
			for(int i = 0; i < N; i++) {
				for(int j = 0; j< M; j++) {
					if(a[i][j] == 0) dem++;	
				}
			}
			System.out.println("Board " +test+ " has "+dem+ " safe squares.");
			test++;
		}
	}
}
