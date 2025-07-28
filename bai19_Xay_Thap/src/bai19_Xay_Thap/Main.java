package bai19_Xay_Thap;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
//	ý tưởng của tôi là 
//	1. sắp xếp A giảm dần theo trọng lượng
//	2. theo trọng lượng , xếp các vên gạnh có trọng lượng nặng từ tầng 1 lần lượt mỗi tòa, hết tầng 1 rồi tăng dần lên tầng 2 với số gạch còn lại
//	3. tính tổng rồi in ra
	static int n;
	static List<Integer> listN;
	static List<Integer> sapXepGiamDan(List<Integer> a) {
		int n = a.size();
	    for (int i = 0; i < n - 1; i++) {
	        int maxIdx = i;
	        for (int j = i + 1; j < n; j++) {
	            if (a.get(j) > a.get(maxIdx)) {
	                maxIdx = j;
	            }
	        }
	        // hoán đổi
	        int temp = a.get(i);
	        a.set(i, a.get(maxIdx));
	        a.set(maxIdx, temp);
	    }
	    return a;
	}
	static int chiPhiThap(int[] m) {
		int n = m.length;
		int sum = 0;
		for(int i = 0; i< n; i++) {
			int j = i+1;
			sum = sum + j*m[i];
		}
		return sum;
	}
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 1; i <= T ; i++) {
			n = sc.nextInt();
			int M1 = sc.nextInt();
			int M2 = sc.nextInt();
			int[] m1 = new int[M1];
			int[] m2 = new int[M2];
			int N ;
			listN = new ArrayList<Integer>();
			for(int j = 0; j < n; j++) {
				N = sc.nextInt();
				listN.add(N);
			}
			sapXepGiamDan(listN);
			
			int nho = 0;
			if(M1 > M2) {
				nho = M1;
			}else {
				nho = M2;
			}
			for(int j = 0; j < nho; j++) {
				if(j < M1) {
					m1[j] = listN.remove(0);
				}
				if(j < M2) {
					m2[j] = listN.remove(0);
				}
				
			}
			
			int sum = chiPhiThap(m1) + chiPhiThap(m2);
			System.out.println("#"+i+" "+ sum);
			
		}
		
	}
}
