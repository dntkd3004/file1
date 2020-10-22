package java_exam7;

public class exam6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		String s = "hi";
		
		System.out.println(s);
		System.out.println(bb());
		System.out.println(cc());
		System.out.println(dd(false));
		// 함수 사용하는 이유?? -> 코드 재활용
		// 호출
		gugu(2, 10);
		
		gugu(5, 20);
		
		gugu(7, 6);
		
	}
	public static int dd(boolean b) {
		if(b == true) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public static String cc() {
		return "bye";
	}
	
	public static String bb() {
		return "hi";
	}
	
	public static void gugu(int k, int b) {	// 정의
		int dan = k;
		for(int i = 1; i < b; i ++) {
			System.out.println(dan + "*" + i + "=" + dan * i);
		}
	}
}
