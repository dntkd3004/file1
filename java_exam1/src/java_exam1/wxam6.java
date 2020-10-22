package java_exam1;

public class wxam6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제 : 할인 대상인지 아닌지 출력해주세요.
		// 조건 : 나이가 19세 이하이거나 60세 이상이면 할인 대상입니다.
		// 조건 : 출력예시 처럼 출력되어야 합니다.
		// 조건 : `구현시작` 부분만 수정 할 수 있습니다..
		// 조건 : 2가지 이상의 방법으로 풀어야 합니다.
		
		int age = 20; // 이 값을 바꿔가면서 실행해보세요.

	    System.out.println("당신의 나이는 " + age + "살 입니다.");

	    // 구현시작
	    
	    // if문만 이용해서 풀기
	    if(age <= 19) {
	    	System.out.println("할인대상입니다.");
	    }
	    if(age >= 60) {
	    	System.out.println("할인대상입니다.");
	    }
	    // 조건문 중첩 => 조건 모두(동시) 만족
	    if(age > 19) {
	    	 if(age < 60) {
	 	    	System.out.println("할인대상이 아닙니다.");
	 	    }
	    }
	   
	    // if else로 풀기
	    if(age <= 19) {
	    	System.out.println("할인대상입니다.");
	    } else if(age >= 60) {
	    	System.out.println("할인대상입니다.");
	    } else if(age > 19) {
	    	if(age < 60) {
		    	System.out.println("할인대상이 아닙니다.");
		    }
	    }
	    // else 이용해서 풀기
	    if(age <= 19) {
	    	System.out.println("할인대상입니다.");
	    } else if(age >= 60) {
	    	System.out.println("할인대상입니다.");
	    } else {
	    	System.out.println("할인대상이 아닙니다.");
	    }
	    // 구현 끝

	    // 출력 => 할인대상입니다. 또는 할인 대상이 아닙니다.
	}

}
