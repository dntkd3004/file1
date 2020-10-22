package java_exam4;

public class exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A반 = {90, 80, 70, 70}; // 배열 선언 : 선언과 동시에 초기화
		
		// 배열 -> 변수가 많다. => 하나의 변수로 다수의 값을 관리
		// 다수의 값을 일괄처리(반복문)에 사용하고 싶다.
		
		for(int i = 0; i < 4; i++) {
			System.out.println(A반[i]);	// 후보값들의 순번 지정해서 하나의 값을 사용
		}
		
//		int a = 10;
//		a++;
//		
//		A반[0] = 10; //int 변수
//		A반[0]++;
		
//		String[] 문자배열 = {"홍길동", "임꺽정", "이순신"};
	}

}
