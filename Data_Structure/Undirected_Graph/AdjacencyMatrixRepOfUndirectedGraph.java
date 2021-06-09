
public class AdjacencyMatrixRepOfUndirectedGraph {
	
	private int V;
	private int E;
	private int [][] adjMatrix;
	
	public AdjacencyMatrixRepOfUndirectedGraph (int nodes) {
		this.V = nodes;
		this.E = 0;
		this.adjMatrix = new int [nodes][nodes];
	}
	
	public void addEdge(int v, int u) {
		adjMatrix[v][u] = 1;
		adjMatrix[u][v] = 1;
		E++;
	}
	
	public String toString () {
		StringBuilder sb = new StringBuilder();
		sb.append(V + " vertices, " + E + " edges " + "\n");
		for(int v=0; v<V; v++) {
			sb.append(v + ": ");
			for(int w : adjMatrix[v]) {
				sb.append(w + " ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		 
		AdjacencyMatrixRepOfUndirectedGraph ob = new AdjacencyMatrixRepOfUndirectedGraph(4);
		ob.addEdge(0, 1);
		ob.addEdge(1, 2);
		ob.addEdge(2, 3);
		ob.addEdge(3, 0);
		System.out.println(ob);

	}

}
