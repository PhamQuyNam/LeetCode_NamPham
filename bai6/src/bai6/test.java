package bai6;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class test {
    public static void main(String[] args) {
//        // Tạo mảng a gồm 5 phần tử, mặc định ban đầu đều là 0
//        int[] a = {0,1,2,3,4};
//
//        // In ra mảng ban đầu
//        System.out.println("Trước khi fill: " + Arrays.toString(a));
//
//        // Gán tất cả các phần tử từ chỉ số 0 đến 4 (tức 0 đến 5-1) bằng giá trị 7
//        Arrays.fill(a, 0, 3, 6);
//
//        // In ra mảng sau khi fill
//        System.out.println("Sau khi fill: " + Arrays.toString(a));
        
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        System.out.println(q.poll());
        
    }
}
