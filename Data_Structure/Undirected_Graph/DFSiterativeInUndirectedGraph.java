import java.util.LinkedList;
import java.util.Stack;

public class DFSiterativeInUndirectedGraph {
	
	private LinkedList<Integer>[ ] adj;
	private int V;
	private int E;
	
	public DFSiterativeInUndirectedGraph (int nodes) {
		this.V = nodes;
		this.E = 0;
		this.adj = new LinkedList[nodes];
		for(int v = 0; v<V; v++) {
			adj[v] = new LinkedList<>();
		}
	}
	
	public void addEdge (int u, int v) {
		adj[u].add(v);
		adj[v].add(u);
		E++;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(V + " vertices, " + E + " edge " + "\n");
		for(int v=0; v<V; v++) {
			sb.append(v + ": ");
			for(int w : adj[v]) {
				sb.append(w + " ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
	
	public void dfs(int s) {
		boolean[] visited = new boolean[V];
		
		Stack<Integer> stack = new Stack<>();
		stack.push(s);
		
		while(!stack.isEmpty()) {
			int u = stack.pop();
			if(!visited[u]) {
				visited[u] = true;
				System.out.print(u + " ");
			
			for(int v : adj[u]) {
				if(!visited[v]) {
					stack.push(v);
				 }
			  }
		   }	
		}
	 }

	public static void main(String[] args) {
		 
		DFSiterativeInUndirectedGraph ob =  new DFSiterativeInUndirectedGraph(5);
		ob.addEdge(0, 1);
		ob.addEdge(1, 2);
		ob.addEdge(2, 3);
		ob.addEdge(3, 0);
		ob.addEdge(2, 4);
		ob.dfs(0);

	}

}
