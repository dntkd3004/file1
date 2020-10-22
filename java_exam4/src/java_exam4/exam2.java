package java_exam4;
//배열을 이용해 1~10까지 출력해보세요.
public class exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // 선언과 동시에 초기화
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
	    // 먼저 10개짜리 배열 만들고. 값을 각각 부여.
		// 자료형(타입), 길이 정보
//		int[] arr1 = new int[10];	//배열 기본 선언
//		String[] arr2 = new String[5];
		
		arr[0] = 1;
		arr[9] = 10;
		System.out.println(arr[9]);
	}

}
