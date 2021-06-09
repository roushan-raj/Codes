import java.util.*;
public class Q2_Method1_MostOptimal_Day23 {
	
	private LinkedList<Integer> adj[];
	private boolean vis [];
	
	public Q2_Method1_MostOptimal_Day23(int v) {
		vis = new boolean[v];
		adj = new LinkedList[v];
		
		for(int i=0; i<v; i++) {
			adj[i] = new LinkedList<>();
		}
	}
	
	public void addEdge(int source, int destination) {
		adj[source].add(destination);
		adj[destination].add(source);
	}
	
	public void bfs(int start) {
		List<Integer> list = new ArrayList<>();
		Queue<Integer> q = new LinkedList<>();
		q.add(start);
		vis[start] = true;
		
		while(!q.isEmpty()) {
			int curr = q.poll();
			list.add(curr);
			
			for(int neigh : adj[curr]) {
				if(vis[neigh] == false) {
					q.add(neigh);
					vis[neigh] = true;
				}
			}
		}
		System.out.println(list);
	}

	public static void main(String[] args) {
		int v = 6;
		Q2_Method1_MostOptimal_Day23 ob = new Q2_Method1_MostOptimal_Day23(v);
	    ob.addEdge(0, 1);
        ob.addEdge(0, 2);
        ob.addEdge(0, 3);
        ob.addEdge(1, 4);
        ob.addEdge(2, 4);
        ob.addEdge(2, 5);
        ob.addEdge(4, 5);
    
        System.out.println("BFS of given graph is: ");
        ob.bfs(0);
	}
}
