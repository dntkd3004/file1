package java_exam5;
//문제 : 자동차 틀(설계도)을 만들어주세요.
//문제 : 사람 틀(설계도)을 만들어주세요.
//문제 : 자전거 틀(설계도)을 만들어주세요.
//문제 : 비행기 틀(설계도)을 만들어주세요.
//문제 : 핸드폰 틀(설계도)을 만들어주세요.
//문제 : 고양이 틀(설계도)을 만들어주세요.

//각 클래스를 이용 객체화 한 후 객체들의 정보를 출력해주세요.
public class exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // 자동차
	    // 모델 : 싼타페
	    // 최고속력 : 240
	    Car c1 = new Car();
	    c1.model = "싼타페";
	    c1.max_velocity = 240;

	    // 모델 : 아반떼
	    // 최고속력 : 220
	    Car c2 = new Car();
	    c2.model = "아반떼";
	    c2.max_velocity = 220;

	    System.out.println(c1.model);
	    System.out.println(c1.max_velocity);
	    System.out.println(c2.model);
	    System.out.println(c2.max_velocity);


	    // 사람
	    // 이름 : 홍길동
	    // 나이 :27

	    Person p1 = new Person();

	    p1.name = "홍길동";
	    p1.age = 27;

	    System.out.println(p1.name);
	    System.out.println(p1.age);
	    // 자전거
	    // 모델 : 스캇
	    // 가격 : 2000000
	    Bicycle b1 = new Bicycle();

	    b1.model = "스캇";
	    b1.price = 2000000;
	    System.out.println(b1.model);
	    System.out.println(b1.price);

	    // 비행기
	    // 모델 : 보잉
	    // 가용인원 : 120

	    Airplane a1 = new Airplane();

	    a1.model = "보잉";
	    a1.capacity = 120;
	    System.out.println(a1.model);
	    System.out.println(a1.capacity);

	    // 핸드폰 
	    // 브랜드 : 갤럭시
	    // 가격 : 1200000
	    CellPhone cp1 = new CellPhone();

	    cp1.brand = "갤럭시";
	    cp1.price = 1200000;
	    System.out.println(cp1.brand);
	    System.out.println(cp1.price);


	    // 고양이
	    // 품종 : 터기쉬 앙고라
	    // 나이 : 4

	    Cat cat1 = new Cat();

	    cat1.kind = "터키쉬 앙고라";
	    cat1.age = 4;
	    System.out.println(cat1.kind);
	    System.out.println(cat1.age);

	}

}
class Car {
	  String model;
	  int max_velocity;
	}

	class Person {
	  String name;
	  int age;
	}

	class Bicycle {
	  String model;
	  int price;
	}

	class Airplane {
	  String model;
	  int capacity;
	}

	class CellPhone {
	  String brand;
	  int price;
	}

	class Cat {
	  String kind;
	  int age;
	}