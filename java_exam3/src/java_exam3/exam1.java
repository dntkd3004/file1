package java_exam3;

public class exam1 {
	// 문제 : 구구단 작성
	// 조건 : 짝수번째만 곱하기
	/* 출력예시 :

	  2 * 2 = 4
	  2 * 4 = 8
	  2 * 6 = 12
	  2 * 8 = 16
	  
	  ... 

	  9단까지 이런식으로 나오면 됩니다.

	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 4대요소 - 값, 변수, 조건문, 반복문
		// else if, else
		// 논리연산자 -> && ||
		// 반복문 -> 조건변수, 반복 조건, 조건변수 제어
		
		// 중첩 반복문
		
		for( int j = 2; j < 10; j++) {
			for(int i = 1; i < 10; i++){
				if(i%2 == 0) {
					System.out.println(j+"*"+i+"="+j*i);
				}
			}
		}
	}
}