package trees;
import java.util.LinkedList;
import java.util.Queue;

class Node
{
	int data;
	Node left,right;
	
	
	public Node(int data)
	{
		this.data=data;
		left = right = null;	
	}
	
}



public class bi_tree {
	Node root;
	
	public bi_tree()
	{
		root=null;		
		
	}
	
	public void insert(int data)
	{
		Node newNode = new Node(data);
		if(root==null)
		{
			root = newNode;
			return;
		}
		
		Queue <Node> queue =  new  LinkedList<>();
		
		queue.offer(root);
		while(!queue.isEmpty())
		{
			Node current = queue.poll();
			
			if(current.left ==null)
			{
				current.left=newNode;
				break;
			}
			else
			{
				queue.offer(current.left);
			}
			
			if(current.right == null)
			{
				current.right = newNode;
				break;
			}
			else
			{
				queue.offer(current.right);
			}
			
		}
		
	}
	
	public void pre_order(Node node)
	{
		if(node!=null)
		{
			System.out.print(node.data +" -> ");
			pre_order(node.left);
			pre_order(node.right);

		}
	}
	public void post_order(Node node)
	{
		if(node!=null)
		{
			post_order(node.left);
			post_order(node.right);
			System.out.print(node.data +" -> ");
		}
	}
	public void in_order(Node node)
	{
		if(node!=null)
		{
			in_order(node.left);
			System.out.print(node.data +" -> ");
			in_order(node.right);
		}
	}
	
	public static void main(String [] args)
	{
		bi_tree b = new bi_tree();
		b.insert(1);
		b.insert(2);
		b.insert(3);
		b.insert(4);
		b.insert(5);
		b.insert(6);
		b.insert(7);
		//b.insert(8);
		//b.insert(9);
		
		
		System.out.println("In-Order Traversal: ");
		b.in_order(b.root);
		System.out.println();
		
		System.out.println("Pre-Order Traversal: ");
		b.pre_order(b.root);
		System.out.println();
		
		System.out.println("Post-Order Traversal: ");
		b.post_order(b.root);
		System.out.println();
		
		
		
	}

}