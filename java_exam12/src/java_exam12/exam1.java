package java_exam12;

public class exam1 {

	public static void main(String[] args) {
		// 문제 : 아래와 같이 출력되도록 해주세요.

		    전사 a전사 = new 전사();
		    
		    a전사.a무기 = new 칼();
		    a전사.공격();
		    //칼을 휘둘러 베기 공격을 합니다.
		    //데미지 : 50

		    a전사.a무기 = new 활();
		    a전사.공격();
		    //활로 시위를 당겨 원거리 공격을 합니다.
		    //데미지 : 30
	}

}

class 전사 {
		무기 a무기;
		void 공격() {
			a무기.사용();
		}
}

class 무기 {
		void 사용( ) {
			
		}
	}

class 칼 extends 무기 {

	int 데미지 = 50;

	void 사용() { 
		System.out.println("칼을 휘둘러 베기 공격을 합니다.");
		System.out.println("데미지 : "+데미지);
  	}
}

class 활 extends 무기 {

	  int 데미지 = 30;

	  void 사용() {
	    System.out.println("활로 시위를 당겨 원거리 공격을 합니다.");
	    System.out.println("데미지 : "+데미지);
	  }
	}
