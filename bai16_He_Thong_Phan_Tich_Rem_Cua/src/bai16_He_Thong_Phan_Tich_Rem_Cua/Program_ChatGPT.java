package bai16_He_Thong_Phan_Tich_Rem_Cua;

import java.io.FileInputStream;
import java.util.Scanner;

public class Program_ChatGPT {
	static int[] soTrangThaiRemCua(char[][] grid, int M, int N) {
        int[] result = new int[5];

        for (int i = 0; i < M; i++) {        // M dòng rèm
            for (int j = 0; j < N; j++) {    // N cột rèm
                int col = j * 5 + 2;
                int count = 0;
                for (int k = 0; k < 4; k++) {
                    if (grid[i * 5 + 1 + k][col] == '*') {
                        count++;
                    }
                }
                result[count]++;
            }
        }

        return result;
    }

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("input.txt"));
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int test = 1; test <= T; test++) {
            int M = sc.nextInt();
            int N = sc.nextInt();
            sc.nextLine(); // bỏ dòng trống sau nextInt()

            char[][] grid = new char[5 * M + 1][5 * N + 1];

            for (int i = 0; i < 5 * M + 1; i++) {
                String line = "";
                while (line.isEmpty()) line = sc.nextLine();  // tránh lỗi dòng rỗng
                for (int j = 0; j < 5 * N + 1; j++) {
                    grid[i][j] = line.charAt(j);
                }
            }

            int[] result = soTrangThaiRemCua(grid, M, N);

            System.out.print("#" + test);
            for (int count : result) {
                System.out.print(" " + count);
            }
            System.out.println();
        }

        sc.close();
    }
}
