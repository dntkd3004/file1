package java_exam2;

public class exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 값, 변수, 조건문, 반복문
		
		// 반복 제어 -> break
		// 준비물1. 반복 조건
		// 준비물2. 조건 변수
		// 준비물3. 조건 변수 제어
//		int num = 1;
//		
//		while(true) {
//			System.out.println("a");
//			if(num == 10) {
//				break;
//			}
//			num = num + 1;
//		}
//		
		
//		for(int num = 1; num < 12; num = num + 1) {
//			System.out.println("a");
//		}
		
		// 수열
//		for(int i = 0; i < 101; i++) {
//			System.out.println(i);
//		}
		//짝수 수열
		for(int i = 2; i < 101; i += 2) {
			System.out.println(i);
		}
		
		int a = 10;
		
		a = a + 1; //증가식
		a += 1;
		a++;
		
		a = a - 1;
		a -= 1;
		a--;
		
		a = a * 3;
		a *= 3;
		
		a = a / 3;
		a /= 3;
	}
}
