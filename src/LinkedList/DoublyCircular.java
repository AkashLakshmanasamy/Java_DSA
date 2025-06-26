package LinkedList;
import java.util.Scanner;

class CNode
{
	CNode previous;
	int data;
	CNode next;
}

class CMethod
{
	static CNode head,tail = null;
	public static void DInsertFirst(int data)
	{
		CNode newNode = new CNode();
		newNode.data = data;
		newNode.previous = null;
		newNode.next = null;
		if(head==null)
		{
			head = newNode;
			tail = newNode;
			head.next = newNode;
			head.previous = newNode;
		}
		else
		{
			head.previous = newNode;
			newNode.next = head;
			tail.next = newNode;
			newNode.previous = head;
			head = newNode;
		}
	}
	
	public static void DInsertLast(int data)
	{
		CNode newNode = new CNode();
		newNode.data = data;
		newNode.next = null;
		newNode.previous = null;
		
		if(head==null)
		{
			head = newNode;
			tail = newNode;
			head.next = newNode;
			head.previous= newNode;
		}
		else
		{
			tail.next = newNode;
			newNode.previous = tail;
			newNode.next= head;
			tail = newNode;
		}
		
	}
	
	public  static void DInsertIndex(int index, int data)
	{
		CNode newNode = new CNode();
		newNode.previous = null;
		newNode.next = null;
		newNode.data = data;
		
		if(head == null)
		{
			DInsertFirst(data);
		}
		else
		{
			CNode temp = head;
			int i=0;
			while(i<index)
			{
				i++;
				temp = temp.next;
			}
			newNode.next = temp;
			newNode.previous = temp.previous;
			temp.previous.next = newNode;
			temp.previous = newNode;
			
		}
	}
	
	public static void CDeleteFirst()
	{
		if(head==null) System.out.println("No nOdes to delete !!");
		
		else
		{
			head =head.next;
			head.previous=tail;
			tail.next=head;
		}
	}
	public static void CDeleteEnd()
	{
		if(head == null) System.out.println("no nodes present to delete !!");
		else {
		tail = tail.previous;
		tail.next=head;
		}
	}
	public static void CDeleteIndex(int index)
	{
		if(head == null) System.out.println("No nodes preset to delete");
		
		else
		{
			CNode temp = head;
			
			int i=0;
			while(i<index) {
				i++;
				temp = temp.next;
			}
			temp.previous.next=temp.next;
			temp.next.previous = temp.previous;
		}
	}
	public static void CSearch(int data)
	{
		if(head==null) System.out.println("No elements to search");
		
		else
		{
			CNode temp = head;
			int i=0;
			while  (temp.data !=data)
			{
				i++;
				temp = temp.next;
			}
			System.out.println("Element found at "+i+"'th index");
		}
	}
	public static void print()
	{
		
		CNode temp = head;
		
		do
		{
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}while(temp!=head);
		System.out.print("null");
	}
}
public class DoublyCircular extends CMethod{
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter no of elements: ");
		int count = scan.nextInt();
		
		System.out.println("Enter elements of list:");
		System.out.println();
		
		for(int i=0;i<count;i++)
		{
			DInsertLast(scan.nextInt());
		}
		
		
		
		//DInsertIndex(5,100);
		//CDeleteFirst();
		//CDeleteEnd();
		//CDeleteIndex(5);
		print();
		System.out.println();
		CSearch(5);
		
		
	}
	

}
