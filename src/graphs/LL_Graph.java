package graphs;
import java.util.*;

public class LL_Graph {
	
	static List<List<Integer>> li = new LinkedList<List<Integer>>();
	
	public LL_Graph(int vertices)
	{
		for(int i=0;i<vertices;i++)
		{
			li.add(new ArrayList<Integer>());
			
		}
	}
	
	public static void addEdge(int src,int dest)
	{
		li.get(src).add(dest);
		li.get(dest).add(src);
		
	}
	
	public static void display()
	{
		for(int i=0;i<li.size();i++)
		{
			System.out.print(i+ " -> ");
			for(int j=0;j<li.get(i).size();j++)
			{
				System.out.print(li.get(i).get(j)+ " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		LL_Graph l = new LL_Graph(5);
		addEdge(0,1);
		addEdge(0,2);
		addEdge(0,3);
		addEdge(0,4);
		addEdge(1,2);
		addEdge(1,0);
		addEdge(1,3);
		addEdge(3,0);
		addEdge(3,4);
		addEdge(3,1);
		addEdge(4,3);
		addEdge(4,0);
		
		display();
		
	}
	

}
