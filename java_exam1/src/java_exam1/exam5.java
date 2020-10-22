package java_exam1;

public class exam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 4대요소 값, 변수, 조건문, 반복문
		
		// 논리값(진리값) - 참/거짓
		System.out.println(true);	//참
//		System.out.println("true"); //참
//		System.out.println("10");   //참
//		System.out.println(10);     //참
		System.out.println(false);  //거짓
		
		// 명제 - 참/거짓이 판별되는 것
		// 비교연산자 : >, <, ==, !=, >=, <=
		System.out.println(10 > 5);
		System.out.println(10 < 5);
		
		// 조건 - 명제에서 정해지지 않은 값을 포함
		int num;
		num = 1;
		System.out.println(num > 5);
		
		// 조건문 : 조건에 따라서 실행 하거나 하지 않거나
		if(num == 1) {
			System.out.println("안녕");	
		}
		
		// 날씨 1. 맑음, 2. 비, 3. 눈
		int weather = 3;
		// 날씨에 따른 실행문 결정
		if(weather == 1) {
			System.out.println("날씨가 맑습니다. 썬크림 바르세요");	// 맑을 때
		}
		if(weather == 2) {
			System.out.println("비가 옵니다. 우산 챙기세요");	// 비올 때
		}
		if(weather == 3){
		System.out.println("눈이 옵니다. 외투를 챙기세요");	// 눈올 때
		}
	}

}
