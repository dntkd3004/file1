package java_exam2;

public class exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tunnel1 = 180;
		int tunnel2 = 182;
	    int tunnel3 = 172;

	    if(tunnel1 <= 170 || tunnel2 <= 170 || tunnel3 <= 170) {
	    	System.out.println("CRASH");
	    }	else {
	    	System.out.println("PASS");
	    }
	    if(tunnel1 > 170 || tunnel2 > 170 || tunnel3 > 170) {
	    	System.out.println("PASS");
	    }	else {
	    	System.out.println("CRASH");
	    }
	}

}
