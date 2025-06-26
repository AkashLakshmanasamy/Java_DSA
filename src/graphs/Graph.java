package graphs;
import java.util.*;


public class Graph {
	
	static int [][] adjMatrix;
	static int vertices;
	
	public Graph(int numvertices)
	{
		Graph.vertices = numvertices;
		Graph.adjMatrix = new int[numvertices][numvertices];
		
	}
	
	
	public void addEdge(int src,int dest)
	{
		adjMatrix[src][dest] = 1; // undirected graph
		adjMatrix[dest][src] =1;
	}
	
	public void display()
	{
		for(int i=0;i<vertices;i++ )
		{
			for(int j=0;j<vertices;j++)
			{
				System.out.print(adjMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void bfs(int start)
	{
		boolean[] visited = new boolean[vertices];
		Queue<Integer> data = new ArrayDeque<Integer>();
		visited[start] =true;
		data.add(start);
		System.out.println("bfs: ");
		while(!data.isEmpty())
		{
			int current = data.poll();
			System.out.print(current+ " -> ");
			for(int i=0;i<vertices;i++)
			{
			if(adjMatrix [current][i]== 1 && !visited[i])
			{
				visited[i] = true;
				data.add(i);
			}
			}
		}
		System.out.println();
		
		
	}
	
	public void dfs_logic(int start, boolean[] visited)
	{
		visited[start] = true;
		System.out.print
		(start + "->");
		
		for(int i=0;i<vertices;i++)
		{
			if(adjMatrix[start][i]==1 && !visited[i])
			{
				dfs_logic(i,visited);
			}
		}
		
	}
	
	public void dfs(int start)
	{
		System.out.println("DFS : ");
		boolean [] visited = new boolean[vertices];
		dfs_logic(start,visited);
	}
	public static void main(String[] args) {
		
		Graph g = new Graph(5);
		g.addEdge(0,1);
		g.addEdge(0,2);
		g.addEdge(0,3);
		g.addEdge(0,4);
		g.addEdge(1,0);
		g.addEdge(1,2);
		g.addEdge(1,3);
		g.addEdge(2,0);
		g.addEdge(2,1);
		g.addEdge(3,1);
		
		//g.display();
		g.bfs(0);
		System.out.println();
		g.dfs(1);
		System.out.println();
		System.out.println();
		
		g.display();
		

	}

}
