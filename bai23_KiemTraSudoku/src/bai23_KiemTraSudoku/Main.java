package bai23_KiemTraSudoku;

import java.io.FileInputStream;
import java.util.Scanner;

public class Main {
	static boolean hopLe(char[][] a) {
		
		//kiểm tra hang
		for(int i = 0; i < 9; i++) {
			int[] count = new int[10];
			 for(int j = 0; j < 9; j++) {
				 char c = a[i][j];
				 if( c == '.') continue;
				 int num = c -'0';
				 count[num]++;
				 if(count[num]>1) return false;
			 }
		}
		
		// kiểm tra cột
		for(int i = 0; i < 9; i++) {
			int[] count = new int[10];
			 for(int j = 0; j < 9; j++) {
				 char c = a[j][i];
				 if( c == '.') continue;
				 int num = c -'0';
				 count[num]++;
				 if(count[num]>1) return false;
			 }
		}
		
		// kiểm tra ma trận 3x3
		for(int xetX = 0; xetX<3 ; xetX++) {
			for(int xetY = 0 ; xetY< 3 ; xetY++) {
				int[] count = new int[10];
				for(int i = 0; i < 3; i++) {
					 for(int j = 0; j < 3; j++) {
						 char c = a[xetX*3 +i][xetY*3 +j];
						 if( c == '.') continue;
						 int num = c -'0';
						 count[num]++;
						 if(count[num]>1) return false;
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
		sc.nextLine();
		for(int i= 1; i <= T; i++ ){
			char[][] a = new char[9][9];
			for(int k = 0; k< 9; k++) {
				String line = sc.nextLine();
				for(int j = 0; j < 9; j++) {
					a[k][j] = line.charAt(j);
				}
			}
			if(hopLe(a)) {
				System.out.println("#"+ i+" 1");
			}else {
				System.out.println("#"+ i+" 0");
			}
		}
	}
}
