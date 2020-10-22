package java_exam4;

public class exam7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // arr 배열에 10, 20, 30, 40, 50, 60, 70, 80, 90, 100을 저장하고 출력해주세요.
		int[] arr = new int [10];
		
		for(int i = 0; i < 10; i++) {
			arr[i] = (10 * i) + 10;
		}
		for(int i = 0; i < 10; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
