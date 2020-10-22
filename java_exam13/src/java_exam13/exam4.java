package java_exam13;

public class exam4 {
	public static void main(String[] args) {
		사람3 a사람 = new 사람3();
		int 엄지손가락_길이 = a사람.a왼팔.a손.a엄지손가락.길이;
    
		System.out.println(엄지손가락_길이 + "cm");
		// 출력 : 7cm
	}
}

class 사람3 {
	팔2 a왼팔 = new 팔2();
}

class 팔2 {
	손 a손 = new 손();
}

class 손 {
	손가락 a엄지손가락 = new 손가락();
}

class 손가락 {
	int 길이 = 7;
}

