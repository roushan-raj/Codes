
import java.util.*;
public class Q2b_DFS_Stack_Method1_MostOptimal_Day13 {
	
	private LinkedList<Integer> [] adj;
	private int Vertices;
	private int Edges;
	
	public Q2b_DFS_Stack_Method1_MostOptimal_Day13(int nodes) {
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
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(Vertices + " vertices, " + Edges + " edges " + "\n");
		for(int v=0; v<Vertices; v++) {
			sb.append(v + ": ");
			for(int w : adj[v]) {
				sb.append(w + " ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
	
	public void bfs(int s) {
		boolean visited[] = new boolean[Vertices];
		
		Stack<Integer> stack = new Stack<>();
		visited[s] = true;
		stack.push(s);
		
		while(!stack.isEmpty()) {
			int res = stack.pop();
			System.out.print(res+" ");
			
			for(int v : adj[res]) {
				if(!visited[v]) {
					visited[v] = true;
					stack.push(v);
				}
			}
		}
	}

	public static void main(String[] args) {
		Q2b_DFS_Stack_Method1_MostOptimal_Day13 ob = new Q2b_DFS_Stack_Method1_MostOptimal_Day13(5);
		ob.addEdge(0, 1);
		ob.addEdge(1, 2);
		ob.addEdge(2, 3);
		ob.addEdge(3, 0);
		ob.addEdge(2, 4);
		
		System.out.println(ob);
		
		ob.bfs(0);
	}
}
