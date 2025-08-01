package bai24_HeThongVienThong;

import java.io.FileInputStream;
import java.util.Scanner;

public class Program_ChatGPT {
    static int M, N;
    static char[][] map;

    static void phuSong(int x, int y, int range) {
        int[] dx = {-1, 1, 0, 0}; // trên, dưới, trái, phải
        int[] dy = {0, 0, -1, 1};

        for (int dir = 0; dir < 4; dir++) {
            for (int step = 1; step <= range; step++) {
                int nx = y + dx[dir] * step;
                int ny = x + dy[dir] * step;

                if (nx < 0 || ny < 0 || nx >=N || ny >= M) break;

                char ch = map[ny][nx];

                if (ch == 'H') {
                    map[ny][nx] = 'P'; // Đánh dấu là đã phủ sóng
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("input.txt"));
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());

        for (int test = 1; test <= T; test++) {
            M = sc.nextInt();
            N = sc.nextInt();
            sc.nextLine();

            map = new char[M][N];
            for (int i = 0; i < M; i++) {
                map[i] = sc.nextLine().toCharArray();
                
            }
            for(int i = 0; i< M; i++) {
            	for(int j = 0; j < N ; j++) {
            		System.out.print(map[i][j]+" ");
            	}
            	System.out.println();
            }

            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    // Nếu trạm đè lên hộ dân thì đánh dấu luôn là đã được phủ sóng
//                    if ((map[i][j] == 'A' || map[i][j] == 'B' || map[i][j] == 'C') && map[i][j] == 'H') {
//                        map[i][j] = 'P';
//                    }

                    if (map[i][j] == 'A') phuSong(i, j, 1);
                    else if (map[i][j] == 'B') phuSong(i, j, 2);
                    else if (map[i][j] == 'C') phuSong(i, j, 3);
                }
            }

            int dem = 0;
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if (map[i][j] == 'H') dem++;
                }
            }

            System.out.println("#" + test + " " + dem);
        }
    }
}
