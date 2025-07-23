package bai14;

import java.io.FileInputStream;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("intput.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 1; i<= T; i++){
			int n = sc.nextInt();
			System.out.println("#"+i+" "+ (int)Math.sqrt(n));
		}
	}
}
