package java_exam13;

public class exam3 {

	public static void main(String[] args) {
	    사람2 a사람 = new 사람2();
	    
	    int a사람의_왼팔_길이 = a사람.a왼팔.get길이();
	    
		System.out.println(a사람의_왼팔_길이 + "cm");
	    
		// 출력 : 70cm

	}

}
class 사람2 {
	int 나이;
	팔 a왼팔 = new 팔();
	
	사람2() {
		a왼팔 = new 팔();
	}
}

class 팔 {
	private int 길이 = 70;
	
	팔() {
		this.길이 = 70;
	}

	public int get길이() {
		return this.길이;
	}
}
