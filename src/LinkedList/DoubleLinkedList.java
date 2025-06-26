package LinkedList;
import java.util.Scanner;

class DNode{
	DNode previous;
	int data;
	DNode next;
}
class DMethod
{
	static DNode head,tail;
	public static void InsertAtFirst(int data)
	{
		DNode newNode = new DNode();
		newNode.data = data;
		newNode.previous=null;
		newNode.next = null;
		
		if(head==null)
		{
			head = newNode;
			tail = newNode;
		}
		else
		{
			
			 newNode.next = head;
			 head.previous = newNode;
			 head = newNode;
			 
			
		}
	}
	
	public static void InsertAtEnd(int data)
	{
		DNode newNode = new DNode();
		newNode.data = data;
		newNode.previous = null;
		newNode.next = null;
		
		if(head==null)
		{
			head = newNode;
			tail = newNode;
		}
		else
		{
			tail.next= newNode;
			newNode.previous = tail;
			tail = newNode;
		}
		
	}
	
	public static void InsertAtPos(int data,int index)
	{
		DNode newNode=new DNode();
		newNode.data= data;
		newNode.previous = null;
		newNode.next = null;
		
		if(head==null) InsertAtFirst(data);
		
		else
		{
			DNode temp = head;
			
			int i=0;
			while(i<index-1)
			{
				temp = temp.next;
				i++;
								
			}
			newNode.previous = temp.previous;
			temp.previous.next= newNode;
			temp.previous = newNode;
			newNode.next =temp;
			
		}
		
	}
	public static void DeleteFirst()
	{
		if(head == null)
		{
			System.out.println("No nodes to first !!");
		}
		else
		{
			head = head.next;
			head.previous=null;
		}
	}
	public static void DeleteEnd()
	{
		if(head == null) System.out.println("No nodes to delete");
		
		else
		{
			tail = tail.previous;
			tail.next = null;
		}
	}
	
	public static void DeletePosition(int index)
	{
		DNode temp = head;
		if(head==null) System.out.println("No nodes to delete !!");
		
		else
		{
			int i=0;
			while(i<index)
			{
				temp= temp.next;
				i++;
			}
			temp.previous.next = temp.next;
			temp.next.previous=temp.previous;
		}
		 
	}
	
	public static void print()
	{ 
		DNode temp = head;
		if(head == null)
		{
			System.out.println("no nodes !!");
		}
		else
		{
			while(temp!=null)
			{
				System.out.print(temp.data + " -> ");
				temp = temp.next;
			}
			//System.out.println(tail.data);
		}
	}
	
	public static void search(int data)
	{
		int i=0;
		DNode temp = head;
		
		if(head==null) System.out.println("No nodes to search !!");
		
		else
		{
			while(temp.data!=data && temp !=null)
			{
				temp = temp.next;
				i++;
			}
			System.out.println("Element found at "+i+"'th position");
		}
	}
}

public class DoubleLinkedList extends DMethod {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter no of elements: ");
		
		
		int count =scan.nextInt();
		
		System.out.println("Enter elements: ");
		
		for(int i=0;i<count;i++)
		{
			InsertAtEnd(scan.nextInt());
		}
		print();
		System.out.println();
		
		//DeleteEnd();
		//DeletePosition(3);
		//InsertAtPos(96,4);
		search(10);
		//print();
		
		

	}

}
