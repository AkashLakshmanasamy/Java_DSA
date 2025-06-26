package trees;
class BSNode{
	int data;
	BSNode left,right;
	
	public BSNode(int data)
	{
		this.data = data;
		left = right = null;
	}
	
	
}

public class bs_tree {
	BSNode root;
	public bs_tree()
	{
		root = null;
	}
	
	public void Insert(int data)
	{
		BSNode  newNode = new BSNode(data);
		
		if(root == null)
		{
			root = newNode;
			return;
		}
		else
		{
			BSNode current = root;
			while(true) {
			if(data<=current.data)
			{
				if(current.left==null)
				{
					current.left = newNode;
					break;
					
				}
				else {
					current = current.left;
					
				}
				
			}
			else {
				if(current.right==null)
				{
					current.right = newNode;
					break;
				}
				else
				{
					current = current.right;
				}
			}
			}
		}
		
	}
	
	public void in_order(BSNode node)
	{
		if(node !=null) {
		in_order(node.left);
		System.out.print(node.data + " -> ");
		in_order(node.right);
		}
	}
	public boolean search(int data)
	{
		BSNode current1 = root;
		
		int count=0;
		
		while(current1!=null)
		{
			if(current1.data == data) return true;
			
			else if( data <current1.data) current1=current1.left;
			
			else current1=current1.right;
		}
		return false;
	}

	public static void main(String[] args) {
		bs_tree b = new bs_tree();
		
		b.Insert(1);
		b.Insert(2);
		b.Insert(3);
		b.Insert(4);
		b.Insert(5);
		b.Insert(6);
		b.in_order(b.root);
		System.out.println(b.search(99));
		
		
		
		

	}

}
