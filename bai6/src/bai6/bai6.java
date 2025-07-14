package bai6;

import java.util.*;
public class bai6 {
	

	    static final int MAXN = 100005;
	    static int n; // Số đỉnh
	    static List<Integer>[] g = new ArrayList[MAXN]; // Danh sách kề
	    static int[] d = new int[MAXN];     // Khoảng cách từ s đến các đỉnh
	    static int[] par = new int[MAXN];   // Lưu cha để truy vết đường đi
	    static boolean[] visit = new boolean[MAXN]; // Đánh dấu đã thăm

	    public static void bfs(int s) {
	        Arrays.fill(d, 0, n + 1, 0);
	        Arrays.fill(par, 0, n + 1, -1);
	        Arrays.fill(visit, 0, n + 1, false);

	        Queue<Integer> q = new LinkedList<>();
	        q.offer(s);
	        visit[s] = true;

	        while (!q.isEmpty()) {
	            int u = q.poll();
	            for (int v : g[u]) {
	                if (!visit[v]) {
	                    d[v] = d[u] + 1;
	                    par[v] = u;
	                    visit[v] = true;
	                    q.offer(v);
	                }
	            }
	        }
	    }

	    public static void printPath(int u) {
	        List<Integer> path = new ArrayList<>();
	        while (u != -1) {
	            path.add(u);
	            u = par[u];
	        }
	        Collections.reverse(path);
	        for (int v : path) {
	            System.out.print(v + " ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        
	        // Khởi tạo danh sách kề
	        for (int i = 0; i < MAXN; i++) {
	            g[i] = new ArrayList<>();
	        }

	        System.out.print("Nhập số đỉnh: ");
	        n = sc.nextInt();
	        System.out.print("Nhập số cạnh: ");
	        int m = sc.nextInt();

	        System.out.println("Nhập các cạnh (u v): ");
	        for (int i = 0; i < m; i++) {
	            int u = sc.nextInt();
	            int v = sc.nextInt();
	            g[u].add(v);
	            g[v].add(u); // Nếu đồ thị vô hướng
	        }

	        System.out.print("Nhập đỉnh bắt đầu: ");
	        int s = sc.nextInt();
	        bfs(s);

	        // In kết quả
	        for (int i = 1; i <= n; i++) {
	            System.out.println("Khoảng cách từ " + s + " đến " + i + ": " + d[i]);
	            System.out.print("Đường đi: ");
	            printPath(i);
	        }
	    }
	

}
