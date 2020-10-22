package java_exam15;

public class exam2 {

	public static void main(String[] args) {
		// 1. static를 사용하는 이유?? 공유
		// 2. 사용 시점이 인스턴스보다 우선
		new 사람();
		
//		수학 a수학 = new 수학();
//		수학 b수학 = new 수학();
//		
//		a수학.PI = 3.13;
//		System.out.println(a수학.PI);
//		System.out.println(b수학.PI);
		
		System.out.println(수학.PI);
		
		수학.printPI();
	}

}

class 사람 {
	int 나이;
	String 이름;
}

class 고양이 {
	int 나이;
	String 품종;
}

class 수학{
	static double PI = 3.141592;
	
	static void printPI() {
		System.out.println(3.141592);
	}
}