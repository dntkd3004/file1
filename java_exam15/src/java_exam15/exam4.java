package java_exam15;
//문제 : 아래 코드의 잘 못된 점을 고쳐보세요.
public class exam4 {
	public static void main(String[] args) {
	
		수학2 수학 = new 수학2();
		System.out.println(수학.더하기(10, 20));		
		// 출력 : 30
		
		수학2 a수학 = new 수학2();
		System.out.println(a수학.더하기2(20, 20, 50));	
		// 출력 : 90
	}
}
class 수학2 {
	  
	  int 더하기(int a, int b) {
	    return a + b;
	  }
	  int 더하기2(int a, int b, int c) {
		    return a + b + c;
	  }
}