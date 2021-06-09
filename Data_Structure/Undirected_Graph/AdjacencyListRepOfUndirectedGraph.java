import java.util.LinkedList;

public class AdjacencyListRepOfUndirectedGraph {
	
	private LinkedList<Integer>[ ] adj;
	private int V;
	private int E;
	
	public AdjacencyListRepOfUndirectedGraph (int nodes) {
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

	public static void main(String[] args) {
		AdjacencyListRepOfUndirectedGraph ob = new AdjacencyListRepOfUndirectedGraph(4);
		ob.addEdge(0, 1);
		ob.addEdge(1, 2);
		ob.addEdge(2, 3);
		ob.addEdge(3, 0);
		System.out.println(ob);

	}

}
