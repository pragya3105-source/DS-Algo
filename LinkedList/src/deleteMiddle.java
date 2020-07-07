public class deleteMiddle {
	
	static Node head;
	
	static class Node {
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next = null;
		}
		
	}
	
	public void push(int new_data) 
    { 

        Node new_node = new Node(new_data);  
        new_node.next = head;   
        head = new_node; 
    } 
	
	 public void printList() 
	    { 
	        Node tnode = head; 
	        while (tnode != null) 
	        { 
	            System.out.print(tnode.data); 
	            tnode = tnode.next; 
	        } 
	    }
	 
	 Node getMiddle(Node head) {
		 Node slow = head;
		  Node fast = head;
		  if (head != null)
		  {
			  while (fast != null && fast.next != null)
			  {
				  slow = slow.next;
				  fast = fast.next.next;
			  }
			  System.out.println("\n");

			 System.out.println("Middle element is " + slow.data);
			 
		  }
		  return slow;
		}
	 
	 
	 public void deleteMiddle(Node head) {
		Node mid = getMiddle(head);
		 Node prev = null, n= head;
		 while (n!= mid) {
			 prev = n;
			 n = n.next;
		 }
		 
		 prev.next = n.next;
		 
	 }

	public static void main(String[] args) {
		
		deleteMiddle li = new deleteMiddle();
		    li.push(4); 
	        li.push(31); 
	        li.push(60); 
	        li.push(29); 
	        li.push(1); 
	        li.push(72);
	        li.push(3);
	        li.push(42);
	        li.push(61);
	         li.printList(); 
		System.out.println("/n");
		System.out.println("after deleting middle");
        li.deleteMiddle(head);
        li.printList();
		// TODO Auto-generated method stub

	}

}
