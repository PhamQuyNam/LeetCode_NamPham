package bai15;

import java.io.FileInputStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 1; i <= T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.print("#"+i);
			int dem = 0;
			for(int j = a; j <= b; j++) {
				if( scp(j)) {
					System.out.print(" "+j );
					dem++;
				}
			}
			if(dem == 0) {
				System.out.println(" NO NUMBER");
			}
			System.out.println();
			
		}
		
	}
	public static boolean scp(int n){
		int sqrt = (int)Math.sqrt(n);
		return sqrt*sqrt == n;
	}
}
