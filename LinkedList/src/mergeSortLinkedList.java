
public class mergeSortLinkedList {
	Node head;
	
	class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}				
	}
	
	public Node merge(Node head) {
		
		 if (head == null || head.next == null) { 
	            return head; 
	        } 
				
		
		 Node mid = getMiddle(head);
		 Node nextMid = mid.next;
		 mid.next = null;


		Node left = merge(head);
		Node right = merge(nextMid);
		
		
		Node sortedList = sortlist(left, right);
		return sortedList;
		
	}
	
	Node getMiddle(Node head) {
		if(head == null) {
			return head;
		}
		Node slow = head;
		Node fast = head;
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			
		}
		return slow;
	}
	
	Node sortlist(Node left, Node right){
		Node result = null;
		
		if (left == null) {
			return right;
		}
		if(right == null) {
			return left;
		}
		
		if (left.data <= right.data)
		{
			result = left;
			result.next = sortlist(left.next,right);
			
		}
		else {
			result = right;
			result.next = sortlist(left,right.next);
		}
		return result;
		
	}
	void push(int new_data) 
    { 
        /* allocate node */
		Node new_node = new Node(new_data); 
  
        /* link the old list off the new node */
        new_node.next = head; 
  
        /* move the head to point to the new node */
        head = new_node; 
    } 
	void printList(Node headref) 
    { 
        while (headref != null) { 
            System.out.print(headref.data + " "); 
            headref = headref.next; 
        } 
    }

	public static void main(String[] args) {
		mergeSortLinkedList li = new mergeSortLinkedList();
		
		
		    li.push(15); 
	        li.push(10); 
	        li.push(5); 
	        li.push(20); 
	        li.push(3); 
	        li.push(2); 
	        li.printList(li.head);
	        // Apply merge Sort 
	        li.head = li.merge(li.head); 
	        System.out.print("\n Sorted Linked List is: \n"); 
	        li.printList(li.head);

	}

}
