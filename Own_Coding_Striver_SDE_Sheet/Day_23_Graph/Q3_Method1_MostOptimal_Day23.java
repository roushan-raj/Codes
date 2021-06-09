import java.util.*;
public class Q3_Method1_MostOptimal_Day23 {
	
	private LinkedList<Integer> adj[];
	private boolean vis[];
	
	public Q3_Method1_MostOptimal_Day23(int v) {
		adj = new LinkedList[v];
		vis = new boolean[v];
		
		for(int i=0; i<v; i++) {
			adj[i] = new LinkedList<>();
		}
	}
	
	public void addEdge(int source, int destination) {
		adj[source].add(destination);
		adj[destination].add(source);
	}
	
	public void dfs(int start) {
		List<Integer> list = new LinkedList<>();
		Stack<Integer> stack = new Stack<>();
		stack.push(start);
		vis[start] = true;
		
		while(!stack.isEmpty()) {
			int curr = stack.pop();
			list.add(curr);
			
			for(int neigh : adj[curr]) {
				if(vis[neigh] == false) {
					stack.push(neigh);
					vis[neigh] = true;
				}
			}
		}
		System.out.println(list);
	}

	public static void main(String[] args) {
		int v = 7;
		Q3_Method1_MostOptimal_Day23 ob = new Q3_Method1_MostOptimal_Day23(v);
		    ob.addEdge(0, 1);
	        ob.addEdge(0, 2);
	        ob.addEdge(1, 3);
	        ob.addEdge(2, 4);
	        ob.addEdge(3, 5);
	        ob.addEdge(4, 5);
	        ob.addEdge(4, 6);
	        
	        System.out.println("DFS of given graph is: ");
	        ob.dfs(0);
	}
}
