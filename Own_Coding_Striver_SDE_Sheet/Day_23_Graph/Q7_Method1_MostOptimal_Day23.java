import java.util.*;
public class Q7_Method1_MostOptimal_Day23 {
	
	private LinkedList<Integer> adj[];
	private int color [];
	
	public Q7_Method1_MostOptimal_Day23(int v) {
		adj = new LinkedList[v];
		color = new int[v];
		
		for(int i=0; i<v; i++) {
			adj[i] = new LinkedList<>();
		}
	}
	
	public void addEdges(int source, int destination) {
		adj[source].add(destination);
		adj[destination].add(source);
	}
	
	public boolean bipartiteGraph(int nodes) {
		for(int i=0; i<nodes; i++) {
			if(color[i] == 1 || color[i] == -1)
				continue;
			
			Queue<Integer> q = new LinkedList<>();
			q.add(i);
			color[i] = 1;
			
			while(!q.isEmpty()) {
				int curr = q.poll();
				
				for(int neigh : adj[curr]) {
					if(color[neigh] == 0) {
						color[neigh] = - color[curr];
						q.add(neigh);
					}
					
					if(color[neigh] == color[curr])
						return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int nodes = 5;
		Q7_Method1_MostOptimal_Day23 ob = new Q7_Method1_MostOptimal_Day23(nodes);
		
//		ob.addEdges(0, 1);
//		ob.addEdges(1, 2);
//		ob.addEdges(2, 3);
//		ob.addEdges(3, 0);
		
		ob.addEdges(0, 1);
		ob.addEdges(0, 2);
		ob.addEdges(1, 3);
		ob.addEdges(2, 4);
		ob.addEdges(3, 4);
		
		System.out.println(ob.bipartiteGraph(nodes));
	}
}
