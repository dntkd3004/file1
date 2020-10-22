package java_exam19;

import java.util.HashMap;

public class exam3 {
	  public static void main(String[] args) {
		    
		    //HashMap 앞 key, 뒤 value
		    HashMap<String, Object> amap = new HashMap<>();
		   

		    // 값 추가 - put()
		    amap.put("이름", "차태진");
		    amap.put("a", "안녕");
		    amap.put("b", "잘가");
		    amap.put("c", 0);
		    amap.put("d", 1);
		    

		    // 값 가져오기 - get()
		    String a = (String)amap.get("이름");
		    String b = (String)amap.get("a");
		    String c = (String)amap.get("b");
		    int d = (int)amap.get("c");
		    int e = (int)amap.get("d");

		    System.out.println(a);
		    System.out.println(b);
		    System.out.println(c);
		    System.out.println(d);
		    System.out.println(e);

		    // 값 삭제 - remove
		    amap.remove("이름");
		    amap.remove("d");
		    
		    System.out.println(amap.get("이름"));

		    // 값 수정 - put
		    // put의 이중적 사용 - 없으면 추가, 있으면 수정

		    amap.put("a", "안녕하세요");
		    amap.put("b", "잘가세요");

		    System.out.println(amap.get("a"));
		    
		    // 데이터 개수 - size
		    int size = amap.size();
		    System.out.println(size);

		  }
}
