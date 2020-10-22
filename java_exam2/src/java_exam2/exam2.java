package java_exam2;

public class exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 논리연산자 : &&, ||
		// 12 + 43
		
		// && : 연산 대상이 모두 참일 때만 결과가 참, 나머진 거짓 -> 모든 조건을 만족시켜야 할 때
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		// || : 연산 대상이 모두 거짓일 때만 결과가 거짓, 나머진 참 -> 하나라도 만족하는 게 있을 때
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		// 연산자 우선순위 + < *
		
		System.out.println(1 + 2 * 3);
		
		// 논리연산자 우선순위 -> &&>||
		
		System.out.println(true || false && false);

	}

}
