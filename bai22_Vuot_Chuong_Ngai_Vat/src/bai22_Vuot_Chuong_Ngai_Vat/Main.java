package bai22_Vuot_Chuong_Ngai_Vat;

import java.io.FileInputStream;
import java.util.Scanner;

public class Main {
	static int[] xacDinhViTriNext(int[][] CNV, int N, int x, int y) {
		int[] a = new int[2];
		int[] dx = {-1,-1,-1,0,0,0, 1,1,1};
		int[] dy = {-1,0,1,-1,0,1,-1,0,1};
		int min = 0;
		int dem = 0;
		for(int i = 0; i < 9; i++) {
			if (dx[i] == 0 && dy[i] == 0) continue;
			int nx = x + dx[i];
			int ny = y + dy[i];
			if(nx >= 0 && nx < N && ny >= 0 && ny<N ) {
				if(CNV[nx][ny] > CNV[x][y] && dem == 0) {
					min = CNV[nx][ny];
					dem++;
					a[0] = nx;
					a[1] = ny;
					
				}
				if(CNV[nx][ny] > CNV[x][y] && CNV[nx][ny] < min) {
					min = CNV[nx][ny];
					a[0] = nx;
					a[1] = ny;
				}
			}
		}
		
		return a;
	}
	
	static boolean DiChuyenDuoc(int[][] CNV, int N, int x, int y) {
		int[] dx = {-1,-1,-1,0,0,0, 1,1,1};
		int[] dy = {-1,0,1,-1,0,1,-1,0,1};
		for(int i = 0; i < 9; i++) {
			if (dx[i] == 0 && dy[i] == 0) continue;
			int nx = x + dx[i];
			int ny = y + dy[i];
			if(nx >=0 && nx < N && ny>=0 && ny<N ) {
				if(CNV[nx][ny] > CNV[x][y])return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 1; i <= T; i++) {
			int N = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			int[][] CNV = new int[N][N];
			for(int j = 0; j < N ; j++) {
				for(int j1 = 0; j1 < N ; j1++) {
					CNV[j][j1] = sc.nextInt();
				}
			}
			int dem = 0;
			while(DiChuyenDuoc(CNV,N, x, y)) {
				dem++;
				int[] a = xacDinhViTriNext(CNV, N, x, y);
				x=a[0];
				y=a[1];
			}
			System.out.println("#"+i+" "+ dem);
		}
	}
}
