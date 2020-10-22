package java_exam13;

public class exam5 {

	public static void main(String[] args) {
		사람4 a사람 = new 사람4();
	    
		int 엄지손가락_길이 = a사람.a왼팔.a손.a엄지손가락.길이;
		
		System.out.println(엄지손가락_길이 + "cm");
		// 출력 : 7cm
	}

}
class 사람4 {
	팔3 a왼팔;

	사람4() {
	    a왼팔 = new 팔3();
	    a왼팔.a손 = new 손2();
	    a왼팔.a손.a엄지손가락 = new 손가락2();
	    a왼팔.a손.a엄지손가락.길이 = 7;
	  }
}

class 팔3 {
	손2 a손;
}

class 손2 {
	손가락2 a엄지손가락;
}

class 손가락2 {
	int 길이;
}