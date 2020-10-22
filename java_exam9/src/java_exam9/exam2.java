package java_exam9;
//회원 모델링 : 아이디, 비밀번호, 이름, 나이

public class exam2 {
	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		c1.setUserId("chacha");
		c1.setUserPw("c1234");
		c1.setUserName("차태진");
		c1.setUserAge(35);

		Customer c2 = new Customer();
		c2.setUserId("sony");
		c2.setUserPw("ss112");
		c2.setUserName("손흥민");
		c2.setUserAge(29);

		Customer c3 = new Customer();
		c3.setUserId("hong123");
		c3.setUserPw("h1234");
		c3.setUserName("홍길동");
		c3.setUserAge(26);

		Customer c4 = new Customer();
		c4.setUserId("kim123");
		c4.setUserPw("kkk12");
		c4.setUserName("김서방");
		c4.setUserAge(24);
		// 1. 한 회원의 전체 정보 출력
		
		System.out.println(c1.getUserId());
		System.out.println(c1.getUserPw());
		System.out.println(c1.getUserName());
		System.out.println(c1.getUserAge());
		
		// 2. 전체 회원 전체 정보 출력
		
		//Customer[] customers = {c1, c2, c3, c4};
		
		Customer[] customers = new Customer[4];
		customers[0] = c1;
		customers[1] = c2;
		customers[2] = c3;
		customers[3] = c4;
		
		for(int i = 0; i < customers.length; i++) {
//			System.out.println(customers[i].getUserId());
//			System.out.println(customers[i].getUserPw());
//			System.out.println(customers[i].getUserName());
//			System.out.println(customers[i].getUserAge());
			customers[i].print();
		}
		
	}
}

class Customer {

	String userId;
	String userPw;
	String userName;
	int age;

	void setUserId(String s) {
		userId = s;  
	}

	String getUserId() {
		return userId;
	}

	void setUserPw(String s) {
		userPw = s;  
	}

	void setUserName(String s) {
		userName = s;  
	}

	void setUserAge(int i) {
		age = i;  
	}

	String getUserPw() {
		return userPw;
	}

	String getUserName() {
		return userName;
	}

	int getUserAge() {
		return age;
	}

	void print() {
		System.out.println(userId); // 출력 : chacha
		System.out.println(userPw); // 출력 : 1234
		System.out.println(userName); // 출력 : 차태진
		System.out.println(age); // 출력 : 3
	}
}
