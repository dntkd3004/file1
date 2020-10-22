package java_exam15;
//문제 : 아래 코드의 잘 못된 점을 고쳐보세요.
public class exam5 {
		
	public static void main(String[] args) {
		// 오직 객체만으로 해결하면 번거롭다.
		
		System.out.println(수학3.PI);
	    // 출력 : 3.141592
			
		System.out.println(수학3.더하기(10, 20));
		// 출력 : 30
		}
}
class 수학3 {
	static double PI = 3.141592;
	
	static int 더하기(int a, int b) {
		return a+b;
	}
}