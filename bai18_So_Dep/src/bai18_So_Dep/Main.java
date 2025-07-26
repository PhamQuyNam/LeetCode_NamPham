package bai18_So_Dep;

import java.io.FileInputStream;
import java.util.Scanner;

public class Main {
	static int m;
	static boolean[] laChuSoDep;

	static boolean laSoDep(int x){
		int dem = 0;
		if (x == 0 && m == 1) return true;
		while (x > 0){
			int chuSo = x % 10;
			if (laChuSoDep[chuSo]){
				dem++;
				if (dem == m) return true;
			}
			x /= 10;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		for (int i = 1; i <= T; i++) {
			int n = sc.nextInt();
			m = sc.nextInt();
			laChuSoDep = new boolean[10];
			for (int j = 0; j < n; j++) {
				int index = sc.nextInt();
				laChuSoDep[index] = true;
			}
			int x = sc.nextInt();
			int y = sc.nextInt(); 
			int kq = 0;
			for (int j = x; j <= y; j++) {
			//200
				if (laSoDep(j)){
					kq++;
					}
			}
			System.out.println("#" + i + " " + kq);
		}
	}

}
