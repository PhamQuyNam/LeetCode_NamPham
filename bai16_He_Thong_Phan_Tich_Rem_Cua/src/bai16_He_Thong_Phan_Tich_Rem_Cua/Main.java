package bai16_He_Thong_Phan_Tich_Rem_Cua;

import java.io.FileInputStream;
import java.util.Scanner;

public class Main {
	static int[] soTrangThaiRemCua(char[][] a, int M, int N) {
		int[] a1 = {0,0,0,0,0};
		for(int i = 1; i < 5*N+1; i = i+5) {
			char[] nho = new char[5]; 
			int dem =0;
			for(int j = 0; j < 5*M +1; j++) {
				if(a[j][i] == '#' && dem >0) {
					int TT = phanBietTrangThai(nho);
					if(TT == 0) {
						a1[0]++;
					}
					if(TT == 1) {
						a1[1]++;
					}
					if(TT == 2) {
						a1[2]++;
					}
					if(TT == 3) {
						a1[3]++;
					}
					if(TT == 4) {
						a1[4]++;
					}
					if(TT == 5) {
						a1[5]++;
					}
					nho = new char[5];
					dem = 0;
				}
				if(dem<5 ) {
					nho[dem] = a[j][i];
					dem++;
				}
			}
		}
		return a1;
	}
	static int phanBietTrangThai(char[]a) {
		int dem = 0;
		for(int i = 0; i <= 4 ; i++) {
			if(a[i] == '*') {
				dem++;
			}
		}
		return dem;
	}
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 1; i <= T; i++) {
			int M = sc.nextInt();
			int N = sc.nextInt();
			sc.nextLine();
			
			char[][] a = new char[5*M+1][5*N+1];
			for(int j = 0; j < 5*M+1; j++) {
				String line = sc.nextLine();
				for(int j1 = 0; j1<5*N+1; j1++) {
					a[j][j1] = line.charAt(j1);
				}
			}
			
			System.out.print("#"+i);
			
			int[] a1 = soTrangThaiRemCua(a,M,N);
			for(int j = 0; j< a1.length; j++) {
				System.out.print(" "+ a1[j]);
			}
			System.out.println();
			
		}
	}
}
