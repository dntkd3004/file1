package java_exam17;
import java.util.ArrayList;

public class exam12 {
	public static void main(String[] args) {
		
		사람10[] arr = new 사람10[3];
		ArrayList<사람10> list = new ArrayList<사람10>();
		
		사람10 aa = new 사람10();
		사람10 bb = new 사람10();
		사람10 cc = new 사람10();
		
		arr[0] = aa;
		list.add(aa);
		arr[1] = bb;
		arr[2] = cc;
		
		aa.자기소개();
		arr[0].자기소개();
		list.get(0).자기소개();
	}
}

class 사람10 {

	void 자기소개() {
		System.out.println("안녕하세요");
	}
}