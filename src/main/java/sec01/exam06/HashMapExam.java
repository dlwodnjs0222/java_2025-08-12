package sec01.exam06;

import java.util.*;

public class HashMapExam {
	public static void main(String[] args) {
//		Map<String, Integer> map = new HashMap<String, Integer>();
		Map<String, Integer> map = new Hashtable<String, Integer>();
		
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		System.out.println("객체 수:" + map.size());
		
		System.out.println("\t홍길동 : " + map.get("홍길동"));
		System.out.println();
		
		Set<String> keyset = map.keySet();
		Iterator<String> keyiterator = keyset.iterator();
		while(keyiterator.hasNext()) {
			String key = keyiterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		map.remove("홍길동");
		System.out.println("객체 수:" + map.size());
		
		Set<Map.Entry<String, Integer>> entryset = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entrtiterator = entryset.iterator();
		
		while(entrtiterator.hasNext()) {
			Map.Entry<String, Integer> entry = entrtiterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		map.clear();
		System.out.println("객체 수:" + map.size());
	}

}
