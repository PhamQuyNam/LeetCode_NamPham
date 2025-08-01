package bai24_HeThongVienThong;

import java.io.FileInputStream;
import java.util.Scanner;

public class Main {
	static int N,M;
	static char[][] a;
	static void phuSong(int k, int j , int doPhu) {
		int[] dx = {-1,1,0,0};
		int[] dy = {0,0,-1,1};
		
		for(int dir =0; dir < 4; dir++ ) {
			for(int step = 1; step<=doPhu; step++) {
				int x = j + dx[dir]*step;
				int y = k + dy[dir]*step;
				if(x<0||y<0||x>=N||y>=M) break;
				
				if(a[y][x]=='H') {
					a[y][x] ='P';
				}
			}
		}
		 
	}
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 1; i <= T ; i++) {
			M = sc.nextInt();
			N = sc.nextInt();
			sc.nextLine();
			a = new char[M][N];
			for(int k = 0; k < M ; k++) {
				String line = sc.nextLine();
				for(int j = 0 ; j < N ; j++) {
					a[k][j] = line.charAt(j);
					
				}
				
			}
			for(int k = 0; k < M ; k++) {
				for(int j = 0 ; j < N ; j++) {
					if(a[k][j] == 'A') phuSong(k,j,1);
					else if (a[k][j] == 'B') phuSong(k,j,2);
					else if (a[k][j] == 'C') phuSong(k,j,3);
					
				}
			}
			int dem= 0;
			for(int k = 0; k < M ; k++) {
				for(int j = 0 ; j < N ; j++) {
					if(a[k][j]=='H') dem++;
				}
			}
			System.out.println("#"+ i+ " " + dem);
		}
	}
}
