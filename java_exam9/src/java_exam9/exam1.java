package java_exam9;

public class exam1 {
	// 문제 : 사람 3명을 저장할 수 있는 배열을 만들고 사람으로 채워주세요.
	// 3명의 사람에게 자기소개를 시켜보세요.
	public static void main(String[] args) {
	    
		new Person().자기소개();
		
		Person p1 = new Person();
		p1.자기소개();
		
		int[] arr = new int [10];
		
		String[] arr2 = new String[10];
		
		Person[] arr3 = new Person[10];
		
		arr[0] = 1;
		arr2[0] = "aaa";
		
		arr3[0] = new Person();
		arr3[1] = new Person();
		arr3[2] = new Person();
		
		System.out.println(arr[0]);
		
		arr3[0].자기소개();
		arr3[1].자기소개();
		arr3[2].자기소개();
		
//	     System.out.println(new Person()); 주민등록처럼 서로 다른 주소를 가지고 있음
//	     System.out.println(new Person()); 
	}
}