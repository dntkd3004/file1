package java_exam19;

import java.util.ArrayList;

public class exam1 {

	  public static void main(String[] args) {
		    
		    // 아래 사람 객체를 ArrayList에 저장해주세요.
		    사람 사람1 = new 사람(17, "홍길동");
		    사람 사람2 = new 사람(19, "임꺽정");
		    사람 사람3 = new 사람(27, "이순신");
		    사람 사람4 = new 사람(32, "강감찬");
		    사람 사람5 = new 사람(53, "을지문덕");
		    사람 사람6 = new 사람(12, "황진이");
		    
		    ArrayList<사람> people = new ArrayList<>();	    
	
		    people.add(사람1);
		    people.add(사람2);
		    people.add(사람3);
		    people.add(사람4);
		    people.add(사람5);
		    people.add(사람6);
 
		    // 1. 모든 사람이 호명하게 해주세요.
		    /* 
		      홍길동
		      임꺽정
		      이순신
		      강감찬
		      을지문덕
		      황진이
		    */   
		    
		    for(int i = 0; i < people.size(); i++) {
		    	사람 a사람 = people.get(i);
			    a사람.호명();	
		    }
		    System.out.println();
		    
		    // 2. 사람의 나이가 20 이하인 사람만 호명하게 해주세요.
		    /* 
		      홍길동
		      임꺽정
		      황진이
		    */

		    for(int i = 0; i < people.size(); i++) {
		    	사람 a사람 = people.get(i);
		    	
		    	if(a사람.get나이() <= 20) {
		    		a사람.호명();	
		    	}
		    }
		    System.out.println();

		    // 3. 황진이의 이름을 황진희로 바꿔주세요. 그리고 출력해주세요.
		    // 출력 황진

		    //사람6.set이름("황진희");
		    //문자열 대상1.equals(대상2) 문자열 비교 대상 ==(x)
		    for(int i = 0; i < people.size(); i++) {
		    	사람 a사람 = people.get(i);
		    	if(a사람.get이름().equals("황진이")) {
		    		a사람.set이름("황진희");
		    		people.set(i,a사람);
		    		break;
		    	}
		    }
		    for(int i = 0; i < people.size(); i++) {
		    	사람 a사람 = people.get(i);
			    a사람.호명();	
		    }
		    System.out.println();
		    
		    // 4. 나이가 10대인 사람들을 리스트에서 삭제해주세요.
		    // for문(x)

//		    for(int i = 0; i < people.size(); i++) {
//		    	사람 a사람 = people.get(i);
//		    	
//		    	if(a사람.get나이() >= 10 && a사람.get나이() < 20) {
//		    		people.remove(a사람);
//		    		//people.remove(i) 와 다른 개념
//		    		// 객체.remove(두가지 버전이 존재)
//		    	}
//		    }
		    
		    // 5. 리스트의 모든 사람을 호명하게 해주세요.
		    /* 
		      이순신
		      강감찬
		      을지문덕
		    */
//		    for(int i = 0; i < people.size(); i++) {
//		    	사람 a사람 = people.get(i);
//			    a사람.호명();	
//		    }
		    
		  }

}

class 사람 {
	  private int 나이;
	  private String 이름;

	  사람(int 나이, String 이름) {
	    this.나이 = 나이;
	    this.이름 = 이름;
	  }

	  public int get나이() {
		return 나이;
	}

	public void set나이(int 나이) {
		this.나이 = 나이;
	}

	public String get이름() {
		return 이름;
	}

	public void set이름(String 이름) {
		this.이름 = 이름;
	}

	void 호명() {
	    System.out.println(이름);
	  }
	}