
//remove duplicates (nodes with duplicate values) from the given list (if exists)
public class removeDuplicate {
    static Node head;
	
	 class Node {
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
	 public void remove(Node head) {
		 if (head == null) {
			 System.out.println("List is empty");
		 }
		 if (head.next == null) {
			 System.out.println(head.data);
		 }
		 Node temp = head;
		 while(temp.next != null) {
			 
			 if(temp.data == temp.next.data) {
				 deleteNode(temp.next);
			 }
			 temp = temp.next;
			 
		 }
		 
	 }
	 
	 void removeDuplicates() 
	    { 
	        /*Another reference to head*/
	        Node curr = head; 
	  
	        /* Traverse list till the last node */
	        while (curr != null) { 
	             Node temp = curr; 
	            /*Compare current node with the next node and  
	            keep on deleting them until it matches the current  
	            node data */
	            while(temp!=null && temp.data==curr.data) { 
	                temp = temp.next; 
	            } 
	            /*Set current node next to the next different  
	            element denoted by temp*/
	            curr.next = temp; 
	            curr = curr.next; 
	        } 
	    } 
	 
	 public void deleteNode(Node n) {
		 Node temp = head, prev = null;
		 while (temp.next != n && temp.next != null) {
			 prev = temp;
			 temp = temp.next;
			 prev.next = temp.next;
		 }
		 
	 }
	 //using recursion
	 public void method3(Node n) {
		Node tofree= null, temp = n;
		if(temp == null)
		{
			System.out.println("list empty");
		}
		if (temp!= null)
		{
			if(temp.data==temp.next.data) {
				tofree = temp;
				temp.next = temp.next.next;
				method3(temp.next);
			}
			else {
				method3(temp.next);
			}
		}
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		removeDuplicate li = new removeDuplicate();
		li.push(2);
		li.push(2);
		li.printList();
		System.out.println("list after removing duplicates");
		//li.remove(head);
		//li.removeDuplicates();
		li.method3(head);
		li.printList();
		

	}

}
