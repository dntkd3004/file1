package java_exam11;

public class exam4 {

	public static void main(String[] args) {
		
		// 기본 타입
		
		// 수동 형변환
		int i = (int)10.1;
		System.out.println(i);
		
		// 자동 형변환 -> 안전
		double d = 10;
		System.out.println(d);
		
		// 객체 타입
		고양이 고양이1 = new 고양이();
		고양이1.숨쉬다();
		고양이1.야옹();
		
		강아지 강아지1 = new 강아지();
		강아지1.숨쉬다();
		강아지1.멍멍();
		
		// 상속 관계에서만 형변환 가능
		동물 동물1 = new 고양이();
		동물1.숨쉬다();
		
//		강아지 강아지2 = new 동물(); X불가능
	}
}

class 동물 {
	void 숨쉬다() {
		System.out.println("숨쉬다");
	}
}

class 고양이 extends 동물 {
	void 야옹() {
		System.out.println("야옹~");
	}
}

class 강아지 extends 동물  {
	void 멍멍() {
		System.out.println("멍멍~");
	}
}