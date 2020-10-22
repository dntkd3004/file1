package java_exam3;
//n부터 m까지의 수중 k의 배수인 수들의 합 구하기
public class exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int n = 5;
	    int m = 80;
	    int k = 3;
	    int sum = 0;
	    for(n = 5;n < m; n++) {
	    	if(n%k == 0) {
	    		sum += n;
	    	}
	    }
    	System.out.println(sum);
	}

}
