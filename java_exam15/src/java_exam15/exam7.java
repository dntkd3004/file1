package java_exam15;
//문제 : 아래 코드의 잘 못된 점을 고쳐보세요.
public class exam7 {
	public static void main(String[] args) { 
		// static를 남용하면 생기는 문제점
		// 1.복잡성 증가
		// 2.재활용성 X
	    출력("안녕");
			// 출력 : 안녕    
			
		출력(5);
			// 출력 : 5
	}
	
	public static void 출력(String a) {
		System.out.println(a);
	}
	
	public static void 출력(int i) {
		System.out.println(i);
	}
	
}
