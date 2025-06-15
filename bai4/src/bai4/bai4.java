package bai4;

public class bai4 {
	
//	You are given the heads of two sorted linked lists list1 and list2.
//
//	Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
//
//	Return the head of the merged linked list.
	public static class ListNode {
	     int val;
	     ListNode next;
	     ListNode() {}
	     ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	
	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		if (list1 == null) return list2;
        if (list2 == null) return list1;
        
        ListNode nodeGia ;

        if (list1.val < list2.val) {
            nodeGia = list1;
            list1 = list1.next;
        } else {
            nodeGia = list2;
            list2 = list2.next;
        }

        ListNode test = nodeGia;
        
        while (list1 != null && list2 != null) {
	        if(list1.val < list2.val) {
	        	test.next = list1;
	        	list1 = list1.next;
	        }else {
	        	test.next = list2;
	        	list2 = list2.next;
	        }
	        
	        test = test.next;
        }
        if( list1 != null) {
        	test.next = list1;
        	
        }
        if( list2 != null) {
        	test.next = list2;
        	
        }
        return nodeGia;
    }
    
	// Hàm tiện ích để in danh sách liên kết
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }
	public static void main(String[] args) {
		// Tạo danh sách 1: 1 -> 2 -> 4
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));

        // Tạo danh sách 2: 1 -> 3 -> 4
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        // Gộp hai danh sách
        ListNode mergedList = mergeTwoLists(list1, list2);

        // In kết quả
        System.out.print("Merged List: ");
        printList(mergedList);
    
	}
}
