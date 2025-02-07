package com.yedam.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExe {
	public static void main(String[] args) {
		
		// Map의 특징: map은 키값과 벨류값을 나눠서 담긴다. 인덱스값이 없고
		// 키값과 벨류값만 지정되어 저장된다.
		// 키:값 => 엔트리
		Map<String, Integer> map = new HashMap<String, Integer>(); // 대표적인게 HashMap
		map.put("홍길동", 90);
		map.put("김민수", 80);
		map.put("박은수", 85);
		map.put("박은진", 78);
		map.put("김민수", 60);
		
		// 키 => 값 반환.
		// 중복된 값이 있을경우 최근값으로 덮어버림. (key값 중복)
		Integer val = map.get("김민수");
		System.out.println(val);
		
		Set<String> keys = map.keySet();
		// 키 -> set 반환.
//		for(String key : keys) {
////			System.out.println(map);
//			System.out.printf("키:%s, 값:%d\n", key, map.get(key));
//		}
		// Map<키:val> = map타입
		// 키:값 = 엔트리 키와값이 같이있는경우를 엔트리라고 부름
		//엔트리반환. (entrySet())
		Set<Entry <String, Integer>> entry = map.entrySet();
		for(Entry <String, Integer> ent: entry) {
			System.out.printf("키:%s, 값:%d\n", ent.getKey(), ent.getValue());
		}
		
	}
}
