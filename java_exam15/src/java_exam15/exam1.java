package java_exam15;
//문제 : 아래 코드의 잘 못된 점을 고쳐보세요. 
public class exam1 {

	public static void main(String[] args) {
	    
		자동차 a자동차 = new 자동차();
		a자동차.달리다();
		// 출력 : 자동차가 달립니다.
	}

}
class 자동차 {
	  
	  int 최고속력;

	  void 달리다() {
	    System.out.println("자동차가 달립니다.");
	  }
}
