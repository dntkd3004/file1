package java_exam6;

public class exam8 {
	  public static void main(String[] args) {

		    greeting1(2);
		    // 하이~

		    greeting1(3);
		    // 봉쥬

		    greeting1(1);
		    // 안녕하세요

		    greeting2(1, 3); 
		    // 안녕하세요
		    // 안녕하세요
		    // 안녕하세요

		    greeting2(2, 5); 
		    // 하이~
		    // 하이~
		    // 하이~
		    // 하이~
		    // 하이~

		    greeting2(3, 7); 
		    // 봉쥬
		    // 봉쥬
		    // 봉쥬
		    // 봉쥬
		    // 봉쥬
		    // 봉쥬
		    // 봉쥬
		  }
	  public static void greeting1(int i) {
		  for(i = 1; i < 4; i++) {
			  if (i == 1) {
				  System.out.println("안녕하세요");
			  } else if (i == 2) {
				  System.out.println("하이~");
			  } else {
				  System.out.println("봉쥬");
			  } 
		  }
	  }
	  public static void greeting2(int j, int k) {
		  for(j = 1; j < 4; j++) {
			  for( k = 3; k < 8; k++) {
					  if (j == 1 && k == 3) {
						  System.out.println("안녕하세요");
					  } else if (j == 2 && k == 5) {
						  System.out.println("하이~");
					  } else if (j == 3 && k == 7) {
						  System.out.println("봉쥬");  
					  }
			  }
		  }
	  }
}
