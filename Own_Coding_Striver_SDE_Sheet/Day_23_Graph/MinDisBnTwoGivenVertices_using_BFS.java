import java.util.*;
public class MinDisBnTwoGivenVertices_using_BFS {
	
	private LinkedList<Integer> adj[];
	
	public MinDisBnTwoGivenVertices_using_BFS(int v) {
		adj = new LinkedList[v];
		for(int i=0; i<v; i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	public void addEdge(int source, int destination) {
		adj[source].add(destination);
		adj[destination].add(source);
	}
	
	List<Integer> list = new ArrayList<>();
	
	public int bfs(int source, int destination) {
		boolean vis[] = new boolean[adj.length];
		int parent[] = new int [adj.length];
		Queue<Integer> q = new LinkedList<>();
		
		q.add(source);
		parent[source] = -1;
		vis[source] = true;
		
		while(!q.isEmpty()) {
			int curr = q.poll();
			list.add(curr);
			
			if(curr == destination) break;
			
			for(int neighbor : adj[curr]) {
				if(!vis[neighbor]) {
					vis[neighbor] = true;
					q.add(neighbor);
					parent[neighbor] = curr;
				}
			}
		}
		int curr = destination;
		int distance = 0;
		
		while(parent[curr] != -1) {
			System.out.print(curr+" -> ");
			curr = parent[curr];
			distance++;
		}
		return distance;
	}

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter no.of vertices and edges");
//		
//		int vertices = sc.nextInt();
//		int edges = sc.nextInt();
		
		int vertices = 5;
		MinDisBnTwoGivenVertices_using_BFS ob = new MinDisBnTwoGivenVertices_using_BFS(vertices);
        ob.addEdge(0, 1);
        ob.addEdge(1, 2);
        ob.addEdge(2, 3);
        ob.addEdge(3, 4);
        ob.addEdge(0, 4);
        ob.addEdge(2, 4);
		
//		System.out.println("Enter " + edges + " edges");
//		for(int i=0; i<edges; i++) {
//			int source = sc.nextInt();
//			int destination = sc.nextInt();
//			
//			ob.addEdge(source, destination);
//		}
//		
//		System.out.println("Enter Source and Destination");
//		int source = sc.nextInt();
//		int destination = sc.nextInt();
		
		int distance = ob.bfs(0, 3);
		System.out.println("Minimum distance is: " + distance);
		System.out.print(ob.list);
	}
}
