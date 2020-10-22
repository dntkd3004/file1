package java_exam3;

public class exam9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=5-i;j>0;j--)
				System.out.print(" ");
			for(int j=0;j<(i*2-1);j++)
				System.out.print("*");
			System.out.println();
			}
	    // 출력
	    /*


	      *
	     ***
	    *****

	    
	    */

	    // y = 5;
	    // 출력
	    /*


	        *
	       ***
	      *****
	     *******
	    *********


	    */

	    // y = 7;
	    // 출력
	    /*


	          *
	         ***
	        *****
	       *******
	      *********
	     ***********
	    *************


	    */
	}

}
