package java_exam3;

public class exam8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int y = 1; y<=3; y++) {
			for(int a = (3-y); a>0; a--) 
				System.out.print(" ");
			
			for(int a = 0; a<y; a++) 
				System.out.print("*");	
				System.out.println();

		}
		for(int y = 1; y<=5; y++) {
			for(int a = (5-y); a>0; a--) 
				System.out.print(" ");
			
			for(int a = 0; a<y; a++) 
				System.out.print("*");	
				System.out.println();

		}
		for(int y = 1; y<=7; y++) {
			for(int a = (7-y); a>0; a--) 
				System.out.print(" ");
			
			for(int a = 0; a<y; a++) 
				System.out.print("*");	
				System.out.println();

		}
		// 출력
		/*


		   *
		  **
		 ***

		    
	    */

	    // y = 5;
	    // 출력
	    /*


	        *
	       **
	      ***
	     ****
	    *****


	    */

	    // y = 7;
	    // 출력
	    /*


	          *
	         **
	        ***
	       ****
	      *****
	     ******
	    *******


	    */
	}

}
