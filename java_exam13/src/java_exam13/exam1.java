package java_exam13;

public class exam1 {

	public static void main(String[] args) {
		사람 a사람 = new 사람(10);
	    //a사람.나이세팅();
//		a사람.set나이1(20);
		System.out.println(a사람.get나이1());
		// 출력 : 20
		
		사람 b사람 = new 사람(23);
//		b사람.set나이1(20);
		System.out.println(b사람.get나이1());
		
	}

}

class 사람 {
	
	// class 안에는 변수, 메서드 선언 밖에 적지 못한다. -> 연산 X
	// 1. 선언과 동시에 초기화
	private	int 나이1 = 20;
	
	// 2. 생성자
	// 메서드의 일종. 리턴X, 클래스명과 무조건 동일
	// 객체 생성시 반드시 한번 실행(호출)
	사람(int a) {
		System.out.println("사람이 태어났습니다.");
		나이1 = a;
	}
	
//	나이1 = 30; //대입 연산
	
	public int get나이1() {
		return 나이1;
	}
	public void set나이1(int 나이1) {
		this.나이1 = 나이1;
	}
	
//	public void set나이1(int a) {
//		나이1 = a;
//	}
//	
//	public void set나이2(int a) {
//		나이2 = a;
//	}
//	
//	public int get나이1() {
//		return 나이1;
//	}
//	
//	public int get나이2() {
//		return 나이2;
//	}
}