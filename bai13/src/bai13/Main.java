package bai13;

import java.io.FileInputStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 1; i <= T ; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("#"+ i+ " "+ (int)Math.pow(a,b));
		}
	}
}
