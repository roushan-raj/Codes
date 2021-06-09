import java.util.*;
public class Group_Anagrams {
	
	public List<List<String>> groupAnagrams(List<String> str) {
		if(str.size() == 0) {
			return new ArrayList<>();
		}
		
		Map<String, List> ans = new HashMap<String, List>();
		
		for(String s : str) {
			char [] ch = s.toCharArray();
			Arrays.sort(ch);
			String key = String.valueOf(ch);
			if(!ans.containsKey(key)) {
				ans.put(key, new ArrayList<>());
			}
			ans.get(key).add(s);
		}
		
		System.out.println(ans.size());
		return new ArrayList(ans.values());
	}

	public static void main(String[] args) {
		Group_Anagrams ob = new Group_Anagrams();
		List<String> str = new ArrayList<String>();
		str.add("eat");
		str.add("tea");
		str.add("ate");
		str.add("bat");
		str.add("tan");
		str.add("nat");
		
		List<List<String>> res = ob.groupAnagrams(str);
		System.out.println(res);
	}
}
