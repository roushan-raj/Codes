
import java.util.*;
public class BFS_Queue {
	
	private LinkedList<Integer> [] adj;
	private int Vertices;
	
	@SuppressWarnings("unused")
	private int Edges;
	
	@SuppressWarnings("unchecked")
	public BFS_Queue(int nodes) {
		this.Vertices = nodes;
		this.Edges = 0;
		this.adj = new LinkedList[nodes];
		for(int v=0; v<Vertices; v++) {
			adj[v] = new LinkedList<>();
		}
	}
	
	public void addEdge(int u, int v) {
		adj[u].add(v);
		adj[v].add(u);
		Edges++;
	}
	
	public void bfs(int s) {
		boolean visited[] = new boolean[Vertices];
		
		Queue<Integer> q = new LinkedList<>();
		visited[s] = true;
		q.offer(s);
		
		while(!q.isEmpty()) {
			int res = q.poll();
			System.out.print(res+" ");
			
			for(int v : adj[res]) {
				if(!visited[v]) {
					visited[v] = true;
					q.offer(v);
				}
			}
		}
	}

	public static void main(String[] args) {
		BFS_Queue ob = new BFS_Queue(5);
		ob.addEdge(0, 1);
		ob.addEdge(1, 2);
		ob.addEdge(2, 3);
		ob.addEdge(3, 0);
		ob.addEdge(2, 4);
		
		ob.bfs(0);
	}
}
