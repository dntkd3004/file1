package java_exam17;
import java.util.ArrayList;

public class exam11 {
	  public static void main(String[] args) {
		    
		    // 아래 사람 객체를 ArrayList에 저장해주세요.
		  ArrayList<사람> alist = new ArrayList<사람>();
		  
		    사람 사람1 = new 사람(17, "홍길동");
		    사람 사람2 = new 사람(19, "임꺽정");
		    사람 사람3 = new 사람(27, "이순신");
		    사람 사람4 = new 사람(32, "강감찬");
		    사람 사람5 = new 사람(53, "을지문덕");
		    사람 사람6 = new 사람(12, "황진이");

		    // 1. 모든 사람이 호명하게 해주세요.
		    /* 
		      홍길동
		      임꺽정
		      이순신
		      강감찬
		      을지문덕
		      황진이
		    */
		    alist.add(사람1);
		    alist.add(사람2);
		    alist.add(사람3);
		    alist.add(사람4);
		    alist.add(사람5);
		    alist.add(사람6);
		    
		    for(int i = 0; i < alist.size(); i++) {
		    	alist.get(i).호명();
		    }
		    
		    System.out.println();
		    // 2. 사람의 나이가 20 이하인 사람만 호명하게 해주세요.
		    /* 
		      홍길동
		      임꺽정
		      황진이
		    */
		    if(alist.get()<=20) {
		    	alist.get(i).호명();
		    }
		    // 3. 황진이의 이름을 황진희로 바꿔주세요. 그리고 출력해주세요.
		    // 출력 황진


		    // 4. 나이가 10대인 사람들을 리스트에서 삭제해주세요.

		    // 5. 리스트의 모든 사람을 호명하게 해주세요.
		    /* 
		      이순신
		      강감찬
		      을지문덕
		    */

		  }
}
class 사람 {
	  int 나이;
	  String 이름;

	  사람(int 나이, String 이름) {
	    this.나이 = 나이;
	    this.이름 = 이름;
	  }

	  void 호명() {
	    System.out.println(이름);
	  }
	}