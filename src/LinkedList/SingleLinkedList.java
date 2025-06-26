package LinkedList;
import java.util.Scanner;
class Node{
	int data;
	Node next;
	
}
class Method{
	static Node head;
	
	public static void insertAtBegin(int data) 
	{
		Node newNode = new Node(); //node creation
		newNode.data=data;
		newNode.next = null; 
		
		if(head==null)      // if head is null , list is empty
		{
			head = newNode;
			
		}
		else 
		{
			newNode.next = head;
			head = newNode;
		}
				
	}
	
	public static void insertAtEnd(int data)
	{
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		
		if(head==null)
		{
			head = newNode;
		}
		else
		{
			Node temp = head;
			while(temp.next!=null)
			{
				temp = temp.next;
			}
			temp.next = newNode;
			
		}
	}
	
	public static void insertAtMiddle(int pos,int data)
	{
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		
		if(head==null)
		{
			insertAtBegin(data);
		}
		else
		{
			Node temp = head;
			int i=1;
			while(i<pos-1)
			{
				
				temp = temp.next;
				i++;
				
			}
			newNode.next = temp.next;
			temp.next=newNode;
		}
	}
	
	public static void print()
	{
		Node temp  =  head ;	
		
		while(temp != null)
		{
			System.out.print(temp.data + " -> ");
			temp = temp.next;
			
		}
	}
	
	public static void search(int n)
	{
		Node temp  =  head ;
		int pos=1;
		while(temp.data !=n && temp!=null)
		{
			pos++;
			temp = temp.next;
		}
		System.out.println("Element found at : "+pos +"'th position");
		
	}
	
	public static void deleteAtFirst()
	{
		if(head==null)
		{
			System.out.println("No Node Found");
		}
		else
		{
			head = head.next;
		}
	}
	
	
	public static void deleteAtPos(int pos)
	{
		if(head==null)
		{
			System.out.println("no node found !");
		}
		else
		{
			Node temp = head;
			Node previous = head;
			int i=0;
			
			while(i<pos)
			{
				previous = temp;
				temp = temp.next;
				i++;
				
			}
			previous.next =temp.next;
			
			
		}
	}
	public static void deleteAtEnd()
	{
		if(head==null) System.out.println("no node found");
		
		else
		{
			Node temp= head;
			while(temp.next.next!=null)
			{
				temp = temp.next;
			}
			temp.next = null;
		}
	}
	
}

public class SingleLinkedList extends Method {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Number of nodes: ");
		
		int count = scan.nextInt();
		System.out.println("Enter Elements: ");
		
		
		for(int i=0;i<count;i++)
		{
			
			insertAtEnd(scan.nextInt());
		}
		print();
		System.out.println();
		
		//search(4);
		//System.out.println();
		//insertAtMiddle(3,5);
		//System.out.println();
		//print();
		//deleteAtPos(3);
		//deleteAtEnd();
		deleteAtFirst();
		print();
		
		

		

	}

}
