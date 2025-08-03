package bai25_QueensKnightsAndPawns;

import java.util.Scanner;

public class ProgramChatGPT {
	
    static final int MAX = 1001;
    static int[][] board = new int[MAX][MAX]; // 0: trống, 1: quân, 2: bị tấn công
    static int[][] queens = new int[101][2];
    static int[][] knights = new int[101][2];
    static int[][] pawns = new int[101][2];

    static int[] dxQueen = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] dyQueen = {-1, 0, 1, -1, 1, -1, 0, 1};

    static int[] dxKnight = {-2, -2, -1, -1, 1, 1, 2, 2};
    static int[] dyKnight = {-1, 1, -2, 2, -2, 2, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int boardCount = 1;

        while (true) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if (n == 0 && m == 0) break;

            // Reset board
            for (int i = 1; i <= n; i++)
                for (int j = 1; j <= m; j++)
                    board[i][j] = 0;

            int q = sc.nextInt();
            for (int i = 0; i < q; i++) {
                queens[i][0] = sc.nextInt();
                queens[i][1] = sc.nextInt();
                board[queens[i][0]][queens[i][1]] = 1;
            }

            int k = sc.nextInt();
            for (int i = 0; i < k; i++) {
                knights[i][0] = sc.nextInt();
                knights[i][1] = sc.nextInt();
                board[knights[i][0]][knights[i][1]] = 1;
            }

            int p = sc.nextInt();
            for (int i = 0; i < p; i++) {
                pawns[i][0] = sc.nextInt();
                pawns[i][1] = sc.nextInt();
                board[pawns[i][0]][pawns[i][1]] = 1;
            }

            // Đánh dấu tấn công của quân hậu
            for (int i = 0; i < q; i++) {
                int x = queens[i][0];
                int y = queens[i][1];
                for (int d = 0; d < 8; d++) {
                    int nx = x + dxQueen[d];
                    int ny = y + dyQueen[d];
                    while (nx >= 1 && nx <= n && ny >= 1 && ny <= m) {
                        if (board[nx][ny] == 1) break; // gặp quân cờ => bị cản
                        if (board[nx][ny] == 0)
                            board[nx][ny] = 2;
                        nx += dxQueen[d];
                        ny += dyQueen[d];
                    }
                }
            }

            // Đánh dấu tấn công của quân mã
            for (int i = 0; i < k; i++) {
                int x = knights[i][0];
                int y = knights[i][1];
                for (int d = 0; d < 8; d++) {
                    int nx = x + dxKnight[d];
                    int ny = y + dyKnight[d];
                    if (nx >= 1 && nx <= n && ny >= 1 && ny <= m) {
                        if (board[nx][ny] == 0)
                            board[nx][ny] = 2;
                    }
                }
            }

            // Đếm ô an toàn
            int safe = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    if (board[i][j] == 0)
                        safe++;
                }
            }

            System.out.printf("Board %d has %d safe squares.\n", boardCount++, safe);
        }
    }
}
