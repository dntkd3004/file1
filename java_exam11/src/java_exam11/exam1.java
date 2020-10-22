package java_exam11;

public class exam1 {

	public static void main(String[] args) {
		//문제 : 아래와 같이 출력되도록 해주세요.
		//조건 : 전사 클래스에는 System.out.println을 사용하시면 안됩니다.

		 전사 a전사 = new 전사();
		 
		 a전사.a칼 = new 칼();
		 
		 a전사.a활 = new 활();

		 a전사.칼공격();
		 //칼을 휘둘러 베기 공격을 합니다.
		 //데미지 : 50
		 
		 a전사.활공격();
		 //활로 시위를 당겨 원거리 공격을 합니다.
		 //데미지 : 30
		 
		 무기 a무기 = new 칼();

		 a무기.공격();
		 // 출력 : 칼로 공격합니다.

		 a무기 = new 활();
		 a무기.공격();
		 // 출력 : 활로 공격합니다.

	}
}

class 전사 {
	칼 a칼;
	
	활 a활;
	
	void 칼공격() {
		a칼.베다();
	}
	
	void 활공격() {
		a활.쏘다();
	}
}
class 칼 extends 무기 {
	
	/*
	 * public -> 모든 객체에 접근 허용
	 * protected -> 같은 패키지 + 상속 관계 객체만 접근 허용
	 * default -> 같은 패키지 객체만 접근 허용
	 * private -> 자기 자신만 접근 허용
	 * */
	
	private int 데미지 = 50;
	
	void 베다() {
		System.out.println("칼을 휘둘러 베기 공격을 합니다.");
		System.out.println("데미지 : " + 데미지);
	}
	
}

class 활 extends 무기 {
	
	 int 데미지 = 30;

	 void 쏘다( ) {
		 System.out.println("활로 시위를 당겨 원거리 공격을 합니다.");
		 System.out.println("데미지 : " + 데미지);
	 }
	 
}

class 무기 {
	void 공격() {
		System.out.println("로 공격합니다.");
	}
}