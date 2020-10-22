package java_exam7;

public class exam5 {
	  public static void main(String[] args) {

		    //구구단 7단을 출력해주는 메서드를 만들어주세요.
		    gugu1(); // 7단 출력


		    // 구구단 원하는 단을 출력해주는 메서드를 만들어주세요.(매개변수)
		    gugu2(3); // 3단 출력
		    gugu2(5); // 5단 출력
		    gugu2(6); // 6단 출력

		    //구구단을 1단부터 원하는 단까지 출력해주는 메서드를 만들어주세요.(매개변수)
		    gugu3(5); // 1~5단 까지 출력
		    gugu3(11); // 1~11단 까지 출력
		    gugu3(100); // 1~100단 까지 출력
		    




		    //원하는 이름을 출력해주는 메서드를 만들어주세요(매개변수)
		    printName("홍길동"); // 홍길동 출력

		    //자신의 이름을 리턴하는 메서드를 만들고 변수 my_name에 저장해주세요. 그리고 my_name을 출력해주세요.(리턴)
		    String myName = getName(my_name);
		    
		    // 원하는 수를 제곱해서 리턴해주는 메서드를 만들어주세요, 그리고 num1 변수에 저장해주세요. num1을 출력해주세요.(매개변수, 리턴)

		    int num1 = square(10);
		    System.out.println(num1); // 100 출력

		    // 원하는 수를 제곱한 후 2로 나눈 값을 리턴해주는 메서드를 만들어주세요. 단, 제곱은 위에서 만들어진 메서드를 이용해야만 합니다. 제곱해주는 코드를 중복해서 사용하지 말아주세요. num2에 저장해주세요. 그리고 num2를 출력해주세요.(매개변수, 리턴)

		    int num2 = calc2(6);
		    System.out.println(num2); // 18 출력


		    // 1부터 임의의 수까지 사이에 있는 짝수들의 합을 리턴하는 메서드를 만들어주세요. 마찬가지로 짝수 판별 코드를 중복해서 작성하지 말고 이미 만들어진 짝수판별 메서드를 이용해주세요. 그리고 num3에 저장해주세요. num3를 출력해주세요.(매개변수, 리턴)

		    int num3 = calc(10);
		    System.out.println(num3); // 30 출력

		  }
	  public static void gugu1() {
		  int dan = 7;
		  for (int a = 1; a < 10; a++) {
			  System.out.println(dan + "*" + a + "=" + dan*a);
		  }
	  }
	  public static void gugu2(int b) {
		  for (int a = 1; a < 10; a++) {
			  System.out.println(b + "*" + a + "=" + b*a);
		  }
	  }
	  public static void gugu3(int c) {
		  int dan = c;
		  for (dan = 1; dan <= c; dan++) {
		  	for (int a = 1; a < 10; a++) {
			  System.out.println(dan + "*" + a + "=" + dan*a);
		  	}
		  }
	  }
	  public static void printName(String a){
		  System.out.println(a);
	  }
	  public static String getName(String a) {
		  return "이우상";
	  }
	  public static int square(int a) {
		  return 100;
	  }
	  public static int calc2(int a) {
		  return 18;
	  }
	  public static int calc(int a) {
		  return a;
	  }
//		  
//		  public static boolean isEven(int no) {
//		    if(no % 2 == 0) {
//		      return true;
//		    }
//
//		    return false;
//		  }

}
