package java_exam10;
//문제 : 아래가 실행되도록 해주세요.
public class exam2 {
	public static void main(String[] args) {
		사람 a사람;  // 빈 변수

		a사람 = new 사람(); 

		a사람.나이 = 20;
		a사람.a왼팔 = new 팔();
		
	 
		System.out.println(a사람.나이); // 출력 20
		System.out.println(a사람.a왼팔.길이); // 출력 60
	}
}

class 사람 {	// 구성 패턴
	int 나이;
	팔 a왼팔;
}
class 팔 {
	int 길이 = 60;
}