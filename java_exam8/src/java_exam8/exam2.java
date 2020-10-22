package java_exam8;

public class exam2 {
	  public static void main(String[] args) {
		    System.out.println("결과 : " + get_sum(50, 100));
		  // 출력 => 675
		  }

		  // 어떤수가 홀수인지 아닌지 체크하는 함수
		  public static int is_odd(int num) {
		    // num이 홀수 ?? 짝수??
			  if(num % 2 == 0) {
				  
			  }
		  }

		  // 어떤수가 3의 배수인지 아닌지 체크하는 함수
		  public static int is_three_multiple(int num) {

		  }

		  // is_odd와 is_three_multiple 이용해서 완성해주세요.
		  public static int get_sum(int n, int m) {
		    int sum = 0;
			for(int i = n; i <= m; i++) {
				if(i % 2 != 0 && i % 3 == 0) {
					sum += i;	
				}
		    }
			return sum;
		  }
}
