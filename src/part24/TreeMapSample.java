package part24;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapSample {
	public static void main(String[] args) {
		TreeMapSample sample = new TreeMapSample();
		sample.checkTreeMap();
	}
	
	public void checkTreeMap() {
		TreeMap<String, String> treeMap = new TreeMap<>();
		treeMap.put("A", "a");
		treeMap.put("가", "e");
		treeMap.put("1", "f");
		treeMap.put("a", "g");
		
		Set<Map.Entry<String, String>> entries = treeMap.entrySet();
		for(Map.Entry<String, String> entry : entries) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
	}
}
