package bai26_FirstDuplicate;

import java.io.FileInputStream;
import java.util.Scanner;

public class SolutionChatGpt {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int t = 1; t <= T; t++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            int result = -1;
            for (int i = 0; i < n; i++) {
                int index = Math.abs(a[i]) - 1; // Adjust for 1-based indexing
                if (a[index] > 0) {
                    a[index] = -a[index]; // Mark as seen
                } else {
                    result = Math.abs(a[i]); // Duplicate found
                    break;
                }
            }
            
            System.out.println("#" + t + " " + result);
            
        }
        sc.close();
	}
}
