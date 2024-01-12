package ch08_collection;

import java.util.HashMap;
import java.util.Set;

public class CollectionMap {

	public static void main(String[] args) {
		// key와 value 한쌍인 데이터를 저장
//		HashMap<String, String> stuMap = new HashMap<String, String>();
		// 제네릭의 첫번째는 key의 타입, 두번쨰는 value의 타입
		HashMap<String, String> stuMap = new HashMap<>(); //위와 동일함
		stuMap.put("첫쨰", "길동");
		stuMap.put("둘쨰", "동길");
		stuMap.put("셋째", "홍길");
        //순서는 보장하지 않음.
		System.out.println(stuMap);
		HashMap<String, Integer> coinMap = new HashMap<>();
		coinMap.put("비트코인", 45000000);
		coinMap.put("이더리움", 10000000);
	    System.out.println(coinMap);
	    // .get ("키")
	    System.out.println(coinMap.get("비트코인"));
	    System.out.println(stuMap.get("첫쨰"));
	    // .size()
	    System.out.println(stuMap.size());
	    // .containsKey, .containsValue
	    System.out.println(stuMap.containsKey("둘째"));
	    System.out.println(stuMap.containsValue("길동"));
	    // .remove("키") 삭제
	    stuMap.remove("셋쨰");
	    // .put이 수정
	    coinMap.put("비트코인", 200000);
	    System.out.println(coinMap);
	    
	    //KeySet 이용
	    Set<String> keySet = stuMap.keySet();
        System.out.println(keySet);
        for(String key : keySet) {
        	System.out.println(stuMap.get(key));
        }
        
	}

}
