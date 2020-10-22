package java_exam7;

public class exam7 {

	  public static void main(String[] args) {
		  System.out.println("결과 : " + get_sum(50, 100));
		  // 출력 => 675
	  }

	  // 어떤수가 홀수인지 아닌지 체크하는 함수
	  public static boolean is_odd(int num) {
	    // num이 홀수 ?? 짝수??
		  if (num % 2 != 0) {
			  return true;
		  } else {
			  return false;
		  }
	  }

	  // 어떤수가 3의 배수인지 아닌지 체크하는 함수
	  public static boolean is_three_multiple(int num) {
		  if (num % 3 == 0) {
			  return true;
		  } else {
			  return false;
		  }
	  }

	  // is_odd와 is_three_multiple 이용해서 완성해주세요.
	  public static int get_sum(int n, int m) {
		  for(n = 50; n <= m; n++) {
			  if( is_odd == true && is_three_multiple == true) {
				  return n;
			  }
		  }
	  }
}
