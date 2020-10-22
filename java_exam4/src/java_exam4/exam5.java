package java_exam4;

public class exam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // v1 아래 배열의 값중 짝수만 출력
	    int[] arr = {2,45,12,4,21,6,17,2,8,10};
	    for(int i = 0; i < 10; i++) {
	    	if (arr[i] % 2 == 0) {
	    		System.out.println(arr[i]);
	    	}
	    }
	    System.out.println();
	    // v2 배열의 값중 짝수의 합 출력
	    for(int i = 0; i < 10; i++) {
	    	if (arr[i] % 2 != 0) {
	    		System.out.println(arr[i]);
	    	}
	    }
	}

}
