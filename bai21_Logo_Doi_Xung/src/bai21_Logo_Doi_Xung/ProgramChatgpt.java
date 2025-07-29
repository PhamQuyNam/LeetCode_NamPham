package bai21_Logo_Doi_Xung;
import java.io.FileInputStream;
import java.util.Scanner;

public class ProgramChatgpt {
    static boolean doiXungTheoTrucTung(int[][] n, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N / 2; j++) {
                if (n[i][j] != n[i][N - j - 1]) return false;
            }
        }
        return true;
    }

    static boolean doiXungTheoTrucHoanh(int[][] n, int N) {
        for (int i = 0; i < N / 2; i++) {
            for (int j = 0; j < N; j++) {
                if (n[i][j] != n[N - i - 1][j]) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("input.txt"));
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt();
            int[][] n = new int[N][N];
            for (int i = 0; i < N; i++)
                for (int j = 0; j < N; j++)
                    n[i][j] = sc.nextInt();

            boolean ok = doiXungTheoTrucTung(n, N) && doiXungTheoTrucHoanh(n, N);
            System.out.println("#" + t + " " + (ok ? "YES" : "NO"));
        }
    }
}
