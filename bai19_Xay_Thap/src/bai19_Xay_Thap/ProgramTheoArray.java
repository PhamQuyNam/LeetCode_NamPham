package bai19_Xay_Thap;

import java.io.FileInputStream;
import java.util.Scanner;
public class ProgramTheoArray {
    static int n;
    static int[] sapXepGiamDan(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] > a[maxIdx]) {
                    maxIdx = j;
                }
            }
            // hoán đổi
            int temp = a[i];
            a[i] = a[maxIdx];
            a[maxIdx] = temp;
        }
        return a;
    }

    static int chiPhiThap(int[] m) {
        int n = m.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (i + 1) * m[i]; // tầng 1 ứng với i = 0
        }
        return sum;
    }

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("input.txt"));
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test = 1; test <= T; test++) {
            n = sc.nextInt();
            int M1 = sc.nextInt();
            int M2 = sc.nextInt();

            int[] bricks = new int[n];
            for (int i = 0; i < n; i++) {
                bricks[i] = sc.nextInt();
            }

            // Bước 1: Sắp xếp giảm dần
            sapXepGiamDan(bricks);

            // Bước 2: Phân chia gạch vào 2 mảng
            int[] m1 = new int[M1];
            int[] m2 = new int[M2];

            int index = 0;
            for (int i = 0; i < Math.max(M1, M2); i++) {
                if (i < M1) {
                    m1[i] = bricks[index++];
                    
                }
                if (i < M2) {
                    m2[i] = bricks[index++];
                }
            }

            // Bước 3: Tính chi phí
            int sum = chiPhiThap(m1) + chiPhiThap(m2);
            System.out.println("#" + test + " " + sum);
        }

        sc.close();
    }
	

}
