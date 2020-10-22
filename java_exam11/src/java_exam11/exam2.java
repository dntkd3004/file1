package java_exam11;



public class exam2 {

	public static void main(String[] args) {
		 
		홍길동 a홍길동 = new 홍길동();
		a홍길동.C언어프로그래밍();
		a홍길동.java프로그래밍();
		a홍길동.파이썬프로그래밍();
		
		임꺽정 a임꺽정 = new 임꺽정();
		a임꺽정.파이썬프로그래밍();
		
	}

}

class 임꺽정 {
	홍길순 a홍길순 = new 홍길순();
	void 파이썬프로그래밍() {
		a홍길순.파이썬프로그래밍();
	}
}

class 홍길동 {
	
	홍길순 a홍길순 = new 홍길순();
	
	void C언어프로그래밍() {
		System.out.println("c 프로그래밍을 합니다.");
	}
	void java프로그래밍() {
		System.out.println("java 프로그래밍을 합니다.");
	}
	void 파이썬프로그래밍() {
		a홍길순.파이썬프로그래밍();
	}
}

class 홍길순 {
	void 파이썬프로그래밍() {
		System.out.println("new 파이썬 프로그래밍을 합니다.");
	}
}