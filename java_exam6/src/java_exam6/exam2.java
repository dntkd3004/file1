package java_exam6;

import java_exam6.Person;

public class exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 함수 (메서드)
		Person p1 = new Person();
		p1.name = "jackylove";
		p1.age = 25;
		p1.home = "서울";
		
		Person p2 = new Person();
		p2.name = "jackylove";
		p2.age = 25;
		p2.home = "서울";
		
		Person p3 = new Person();
		p3.name = "jackylove";
		p3.age = 25;
		p3.home = "서울";
		
		print(p2);	// a세번
		print(p1);	// b세번
		print(p3);	// c세번
		
	}
	// 함수 -> 코드 재활용
	public static void print(Person p1) {
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.home);
	}
//	public static void 함수명(매개변수){
//		재활용될 코드
//	}
}
