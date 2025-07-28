package bai19_Xay_Thap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
	public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(7, 3, 4, 1, 5));

        for(int i = 0; i < 5; i++) {
        	// Lấy phần tử đầu tiên và xóa nó
            int value = list.remove(0); // lấy và xóa phần tử ở vị trí 0
            System.out.println("Giá trị lấy ra: " + value);
            System.out.println("Mảng sau khi xóa: " + list);
        }
        
    }
}
