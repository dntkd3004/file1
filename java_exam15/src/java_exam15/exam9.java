package java_exam15;

public class exam9 {
	  public static void main(String[] args) {
		    사람3 a사람 = new 사람3();
		    // 출력 1번째 사람이 태어났습니다.
		    사람3 b사람 = new 사람3();
		    // 출력 2번째 사람이 태어났습니다.
		    사람3 c사람 = new 사람3();
		    // 출력 3번째 사람이 태어났습니다.
		    사람3 d사람 = new 사람3();
		    // 출력 4번째 사람이 태어났습니다.
		    사람3 e사람 = new 사람3();
		    // 출력 5번째 사람이 태어났습니다.

		    a사람.호번();
		    // 출력 1번
		    b사람.호번();
		    // 출력 2번
		    c사람.호번();
		    // 출력 3번
		    d사람.호번();
		    // 출력 4번
		    e사람.호번();
		    // 출력 5번

		  }
}

class 사람3 {
	static int i = 1;
	
	사람3() {
		System.out.println(i+"번째 사람이 태어났습니다.");
		i++;
	}
	
	static int a = 1;
	
	void 호번() {
		System.out.println(a+"번");
		a++;
	}
}