package bai17_Vung_Bao_Lon_Nhat;

import java.io.FileInputStream;
import java.util.Scanner;

public class Main {
	

	static int h;
	static int w;
	static int m;
	static int n;
	static int[][] a;
	
	static int timMax(int r, int c) {
		int sum = 0;
		for (int j = c; j < c + w; j++) {
			if (a[r][j] % 2 == 0) sum += a[r][j];
			if (h > 1 && a[r + h - 1][j] % 2 == 0) sum += a[r + h - 1][j];
		}

		// Cột trái và phải (trừ hàng đầu và cuối nếu đã tính)
		for (int i = r + 1; i < r + h - 1; i++) {
			if (a[i][c] % 2 == 0) sum += a[i][c];
			if (w > 1 && a[i][c + w - 1] % 2 == 0) sum += a[i][c + w - 1];
		}
		return sum;
	}
		
	public static void main(String[] args)throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t = 1; t <= T; t++) {
			h = sc.nextInt();
			w = sc.nextInt();
			m = sc.nextInt();
			n = sc.nextInt();
			
			a = new int[m][n];
			for(int i = 0; i < m; i++) {
				for(int j = 0 ; j< n; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			int max = 0;
			for(int i = 0; i <= m-h; i++) {
				for(int j = 0 ; j<= n-w; j++) {
					int sum = timMax(i, j);
					if (sum > max) {
					 	max = sum;
					}
				}
			}
			System.out.println("#"+t+" "+max);
		}
		
	}
}
