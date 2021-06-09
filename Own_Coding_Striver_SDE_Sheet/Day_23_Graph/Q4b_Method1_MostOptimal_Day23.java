import java.util.*;
public class Q4b_Method1_MostOptimal_Day23 {
	
	private LinkedList<Integer> adj[];
	private boolean vis[];
	private boolean backtrack[];
	
	public Q4b_Method1_MostOptimal_Day23(int v) {
		adj = new LinkedList[v];
		vis = new boolean[v];
		backtrack = new boolean[v];
		
		for(int i=0; i<v; i++) {
			adj[i] = new LinkedList<>();
		}
	}
	
	public void addEdges(int source, int destination) {
		adj[source].add(destination);
	}
	
/////////// Detecting Cycle in directed Graph using DFS //////////
	
	public boolean detectCycleInDirectedGrpah(int nodes) {
		
		for(int i=0; i<nodes; i++) {
			if(vis[i] == false) {
				if(isCycle(i))
					return true;
				}
			}
		return false;
	}
	
	public boolean isCycle(int curr) {
		vis[curr] = true;
		backtrack[curr] = true;
		
		for(int neigh : adj[curr]) {
			if(backtrack[neigh] == true)
				return true;
			if(vis[neigh] == false) {
				if(isCycle(neigh))
					return true;
			}
		}
		backtrack[curr] = false;
		return false;
	}

	public static void main(String[] args) {
		int nodes = 5;
		Q4b_Method1_MostOptimal_Day23 ob = new Q4b_Method1_MostOptimal_Day23(nodes);
		
		ob.addEdges(0, 1);
		ob.addEdges(1, 2);
		ob.addEdges(2, 3);
		ob.addEdges(3, 4);
		ob.addEdges(4, 1);
		
		System.out.println(ob.detectCycleInDirectedGrpah(nodes));
	}
}
