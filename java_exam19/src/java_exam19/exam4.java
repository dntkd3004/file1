package java_exam19;

import java.util.HashMap;
import java.util.Map;

public class exam4 {
	public static void main(String[] args) {

	    // 1. ages 맵을 만들어주세요. ages의 put 메서드는 인자로 String, Integer 만 입력가능해야 합니다.
		HashMap<String, Integer> ages = new HashMap<>();
	    // 2. key로 학생의 이름을, value로 학생의 나이를 맵에 입력해주세요.
	    // 영희 : 21
	    // 철수 : 27 
	    // 민서 : 25 
	    // 광수 : 27
	    ages.put("영희", 21);
	    ages.put("철수", 27);
	    ages.put("민서", 25);
	    ages.put("광수", 27);
	    
	    // 3. 맵의 데이터를 아래와 같이 출력해주세요.
		// /* 출력결과 */
	    // // 이름 : 영희, 나이 : 21
		// // 이름 : 철수, 나이 : 27
		// // 이름 : 민서, 나이 : 25
		// // 이름 : 광수, 나이 : 27
	    System.out.println("이름 : 영희, 나이 :"+ ages.get("영희"));
	    System.out.println("이름 : 철수, 나이 :"+ ages.get("철수"));
	    System.out.println("이름 : 민서, 나이 :"+ ages.get("민서"));
	    System.out.println("이름 : 광수, 나이 :"+ ages.get("광수"));
	    System.out.println();
	    
	    // 4. 맵에서 영희의 데이터를 지워주세요. 그리고 다시 모든 학생 정보를 출력해주세요.
	    // /* 출력결과 */
		// // 이름 : 철수, 나이 : 27
		// // 이름 : 민서, 나이 : 25
		// // 이름 : 광수, 나이 : 27
	    ages.remove("영희");
	    System.out.println("이름 : 영희, 나이 :"+ ages.get("영희"));
	    System.out.println("이름 : 철수, 나이 :"+ ages.get("철수"));
	    System.out.println("이름 : 민서, 나이 :"+ ages.get("민서"));
	    System.out.println("이름 : 광수, 나이 :"+ ages.get("광수"));
	    System.out.println();

	    // 4. everyone 맵을 만들고 사람과 원숭이를 저장해주세요. kye는 객체의 이름, value는 실제 객체입니다.
	    // 사람 : new 사람(),
	    // 원숭이 : new 원숭이()
	    HashMap<String, Object> everyone = new HashMap<>();
	    
	    everyone.put("사람", new 사람2());
	    everyone.put("원숭이", new 원숭이2());
	    
	    // 6. everyone 맵에서 사람을 가져와 아래와 같이 출력해주세요. 
		// 출력 => 사람이 말합니다.
	    사람2 a사람 = (사람2)everyone.get("사람");
	    a사람.말하다();

	    // 5. everyone 맵에서 원숭이를 가져와 아래와 같이 출력해주세요.
		// 출력 => 원숭이가 묘기를 부립니다.
	    원숭이2 a원숭이 = (원숭이2)everyone.get("원숭이");
	    a원숭이.묘기();
	    
		}
}

class 사람2 {
	void 말하다() {
		System.out.println("사람이 말합니다.");
	}
}
class 원숭이2 {
	void 묘기() {
		System.out.println("원숭이가 묘기를 부립니다.");
	}
}