package java_exam19;

import java.util.ArrayList;
import java.util.HashMap;

public class exam2 {

	  public static void main(String[] args) {
		    
		    ArrayList<Integer> aList = new ArrayList<Integer>();
		    HashMap<String, Integer> aMap = new HashMap<String, Integer>();

		    // 추가
		    aList.add(10); // 데이터 index 관리
		    aList.add(11); // 데이터 index 관리
		    aList.add(12); // 데이터 index 관리
		    aMap.put("숫자1", 10); // 데이터 key 관리
		    aMap.put("숫자2", 11); // 데이터 key 관리
		    aMap.put("숫자3", 12); // 데이터 key 관리

		    // 가져오기
		    int i1 = aList.get(0);
		    System.out.println(i1);

		    int i2 = aMap.get("숫자1");
		    System.out.println(i1);

		    // 모두 가져오기

		    for(int i = 0; i < aList.size(); i++) {
		      System.out.println(aList.get(i)); 
		    }

		    for(String a : aMap.keySet() ) {
		      System.out.println(aMap.get(a));
		    }

		    // 수정
		    aList.set(0, 100);
		    System.out.println(aList.get(0));
		    
		    aMap.put("숫자1", 100);
		    System.out.println(aMap.get("숫자1"));

		    // 삭제
		    aList.remove(0);
		    System.out.println(aList.get(0));

		    aMap.remove("숫자1");
		    System.out.println(aMap.get("숫자1"));


		  }

}
