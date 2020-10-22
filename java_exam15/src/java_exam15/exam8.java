package java_exam15;

public class exam8 {
	  public static void main(String[] args) {
		    new 사람2();
		    // 출력 1번째 사람이 태어났습니다.
		    new 사람2();
		    // 출력 2번째 사람이 태어났습니다.
		    new 사람2();
		    // 출력 3번째 사람이 태어났습니다.
		    new 사람2();
		    // 출력 4번째 사람이 태어났습니다.
		    new 사람2();
		    // 출력 5번째 사람이 태어났습니다.

		  }
}

class 사람2 {
	
	static int i = 1;
	
	사람2() {
		System.out.println(i+"번째 사람이 태어났습니다.");
		i++;
	}
}