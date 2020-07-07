import java.io.*;
//Find the middle of a given linked list 
public class middleElement {
	Node head;
	
	class Node {
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next = null;
		}
		
	}
	
	public void findMiddle()
	{
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
	}
	//push at start
	public void push(int new_data) 
    { 

        Node new_node = new Node(new_data);  
        new_node.next = head;   
        head = new_node; 
    } 
	//push at last
	public void insertAtlast(int new_data)
	{
		 Node new_node = new Node(new_data);
		 Node n = head;
		 if(head == null) {
			 head = new_node;
		 }
		 else {
			 while(n.next != null) {
				 n = n.next;
			 }
			 n.next = new_node;
		 }
	}
	//push at a given index
	public void insertAtIndex(int new_data , int index) {
		 Node new_node = new Node(new_data);
		 Node n = head;
		 Node prev = head;
		 if(index == 0) {
			 head = new_node;
		 }
		 else {
			 for(int i =0 ; i<index && n.next!=null ; i++) {
				 n = n.next;
			 }
			 new_node.next = n.next;
			 n.next = new_node;			 
		 }
		
	}
	//print linked list
   public void printList() 
    { 
        Node tnode = head; 
        while (tnode != null) 
        { 
            System.out.print(tnode.data); 
            tnode = tnode.next; 
        } 
    }
	public static void main(String[] args) {
		
		middleElement llist = new middleElement();
		for (int i=5; i>0; --i) 
        { 
            llist.push(i); 
            
        } 
		llist.printList(); 
		System.out.println("/n");
		llist.insertAtlast(8);
		llist.printList();
		System.out.println("/n");
		llist.insertAtIndex(10, 2);
		llist.printList();
		System.out.println("/n");
        llist.findMiddle(); 
	}

}
