package part24;

import java.util.HashMap;

public class MapSample {
	public static void main(String[] args) {
		MapSample sample = new MapSample();
		sample.checkKeySet();
	}
	
	public void checkHashMap() {
		HashMap<String, String> map = new HashMap<>();
		map.put("A", "a");
		System.out.println(map.get("A"));
		System.out.println(map.get("B"));
	}
	
	public void checkKeySet() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("A", "a");
		map.put("C", "c");
		map.put("D", "d");
		//Set<String> keySet = map.keySet(); keySet의 리턴 타입은 set
		for(String key : map.keySet()) {
			System.out.println(key + "=" + map.get(key));
		}
	}
}
