package java_exam17;
//문제 : 배열의 단점을 보완한 ArrayList 라는 클래스를 만들어주세요.
//아래와 같이 출력되도록 해주세요.
//add 함수에서 배열의 크기가 자동으로 늘어나도록 해주세요.
public class exam6 {
	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		ar.add(100);
		ar.add(200);
		ar.add(300);
		ar.add(400);
		
		int value = ar.get(0);
		System.out.println(value);
		// 출력 : 100
		
		value = ar.get(1);
		System.out.println(value);
		// 출력 : 200 
		
		value = ar.get(2);
		System.out.println(value);
		// 출력 : 300
		
		value = ar.get(3);
		System.out.println(value);
		// 출력 : 400
	}
}
class ArrayList {
	int[] datas;
	int lastIndex = -1;
	
	ArrayList() {
		datas = new int[3]; // 이 부분은 수정할 수 없습니다.
	}
	
	void add(int data) {
		lastIndex++;
				
		datas[lastIndex] = data;
	}
	
	int get(int index) {
		return datas[index];
	}
}