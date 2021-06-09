
import java.util.LinkedList;
public class Q4a_Method1_MostOptimal_Day23 {
	
	private LinkedList<Integer> adj[];
	private boolean vis[];
	
	public Q4a_Method1_MostOptimal_Day23(int vertices) {
		adj = new LinkedList[vertices];
		vis = new boolean[vertices];
		
		for(int i=0; i<vertices; i++) {
			adj[i] = new LinkedList<>();
		}
	}
	
	public void addEdges(int source, int destination) {
		adj[source].add(destination);
		adj[destination].add(source);
	}
	
	public boolean detectCycleInUndirectedGraph(int nodes) {
		for(int i=0; i<nodes; i++) {
			if(vis[i] == false) {
				if(isCycle(i, -1))
					return true;
			}
		}
		return false;
	}
	
	/////////// Detecting Cycle in undirected Graph using DFS //////////
	
	public boolean isCycle(int curr, int parent) {
		
		vis[curr] = true;
		for(int neigh : adj[curr]) {
			if(vis[neigh] == false) {
				if(isCycle(neigh, curr))
					return true;
			}
			else if(neigh != parent)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int nodes = 7;
		Q4a_Method1_MostOptimal_Day23 ob = new Q4a_Method1_MostOptimal_Day23(nodes);
		ob.addEdges(0, 1);
		ob.addEdges(1, 2);
		ob.addEdges(2, 3);
		//ob.addEdges(3, 1);
		ob.addEdges(4, 5);
		ob.addEdges(5, 6);
		ob.addEdges(6, 4);
		
		System.out.println(ob.detectCycleInUndirectedGraph(nodes));
	}
}
