package java_exam6;

public class exam9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		boolean flag = isEven(num);	
		
		//결과를 이용해 출력
		if (flag) {
			System.out.println("aa");
		}
	}
	public static boolean isEven(int num) {
		boolean flag;
		//짝수판별
		if (num % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
