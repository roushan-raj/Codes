import java.util.*;

public class Q2_Method1_MostOptimal_Day14 {
	
	private class CacheEntry {
		int key;
		int value;
		
		public CacheEntry(int key, int value) {
			this.key = key;
			this.value = value;
		}
	}
	
	Deque<CacheEntry> q = new LinkedList<>();
	Map<Integer, CacheEntry> map = new HashMap<>();
	int CACHE_SIZE = 3;
	
	public int getFromCache(int key) {
		if(map.containsKey(key)) {
			CacheEntry entry = map.get(key);
			q.remove(entry);
			q.addFirst(entry);
			return entry.value;
		}
		return -1;
	}
	
	public void putEntryIntoCache(int key, int value) {
	    if(map.containsKey(key)) {
	      CacheEntry entry = map.get(key);
	      q.remove(entry);
	    } 
	    else {
	      if(q.size() == CACHE_SIZE) {
	        CacheEntry entryToBeRemoved = q.removeLast();
	        map.remove(entryToBeRemoved.key);
	      }
	    }
	    CacheEntry newEntry = new CacheEntry(key, value);
	    q.addFirst(newEntry);
	    map.put(key, newEntry);
	  }

	public static void main(String[] args) {
		
		Q2_Method1_MostOptimal_Day14 ob = new Q2_Method1_MostOptimal_Day14();
		ob.putEntryIntoCache(1, 10);
	    ob.putEntryIntoCache(2, 20);
	    ob.putEntryIntoCache(3, 30);
	    System.out.println(ob.getFromCache(2));
	    ob.putEntryIntoCache(4, 40);
	    ob.putEntryIntoCache(2, 80);
	    
	    System.out.println(ob.getFromCache(2));
	    System.out.println(ob.getFromCache(6));	
	    System.out.println(ob.getFromCache(2));
	  }
}
