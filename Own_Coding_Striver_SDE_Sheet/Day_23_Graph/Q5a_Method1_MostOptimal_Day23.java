
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

//////////// Topological sort using BFS also known as Kahn's Algorithm /////////

class Graph {
	  List<Integer> adj[];
	  HashMap<Integer, Integer> incomingDegree;
	  int nodes;
	  Queue<Integer> sourceQueue;
	
	  public Graph(int nodes) {
		    adj = new LinkedList[nodes];
		    incomingDegree = new HashMap<>();
		    sourceQueue = new LinkedList<>();
		    this.nodes = nodes;
		    
		    for (int i = 0; i < nodes; i++) {
		      adj[i] = new LinkedList<>();
		      incomingDegree.put(i, 0);
		    }
	  }

  public void addEdge(int a, int b) {
	    adj[a].add(b);
	    incomingDegree.put(b, incomingDegree.get(b) + 1);
  }
 
  public List<Integer> topologicalSort() {

	    for(Map.Entry<Integer, Integer> entry: incomingDegree.entrySet()) {
		      if(entry.getValue() == 0) {
		         sourceQueue.add(entry.getKey());
		      }
	    }
    
	    List<Integer> result = new ArrayList<>();
    
	    while(!sourceQueue.isEmpty()) {
		      int source = sourceQueue.remove();
		      result.add(source);
		  
	          for(Integer child: adj[source]) {
			        incomingDegree.put(child, incomingDegree.get(child) - 1);
			        
			        if(incomingDegree.get(child) == 0) {
			           sourceQueue.add(child);
			        }
			   }
	    }
    
    if(result.size() != nodes) {
	      System.out.println("Cycle is there in graph");
	      return new ArrayList<>();
    }
    return result;
  }
}

public class Q5a_Method1_MostOptimal_Day23 {

  public static void main(String[] args) {
    int nodes = 6;
    
    Graph ob = new Graph(nodes);
    
    ob.addEdge(0, 1);
    ob.addEdge(0, 2);
    ob.addEdge(1, 3);
    ob.addEdge(1, 4);
    ob.addEdge(2, 4);
    ob.addEdge(3, 5);
    ob.addEdge(4, 5);
    
    System.out.println(ob.topologicalSort());
  }
}
