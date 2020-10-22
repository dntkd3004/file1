package java_exam10;
// 메서드 재정의 라고 합니다.
// 메서드 오버라이드 라고도 합니다.
// 메서드 재정의 => 부모가 물려준 능력을 다시 구현한다.
public class 고무오리 extends 오리공통 {
	
	// 오버라이딩
	void 날다() {
		System.out.println("고무 날개로는 날 수 없습니다.");
	}

	void 헤엄치다() {
		System.out.println("고무오리는 둥둥 떠다닙니다.");
	}
	
	void 고무오리기능() {
		System.out.println("고무오리만의 기능");
	}
}
