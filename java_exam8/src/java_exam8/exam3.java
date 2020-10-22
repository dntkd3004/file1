package java_exam8;

public class exam3 {
	// 문제 : 자동차가 3번 달리게 해주세요.
	// 출력 : 자동차가 달립니다.

	  public static void main(String[] args) {
	    //v1. 1개의 자동차가 3번 달리게 해주세요.
		  Car c1 = new Car();
		  c1.model = "쏘나타";
		  c1.max_velocity = 200;
		  c1.run();
		  c1.run();
		  c1.run();
		  System.out.println( );

	    //v2. 3개의 자동차가 1번씩 달리게 해주세요.
		  c1.run();
		  Car c2 = new Car();
		  c2.model = "아반테";
		  c2.max_velocity = 180;
		  c2.run();
		  Car c3 = new Car();
		  c3.model = "싼타페";
		  c3.max_velocity = 220;
		  c3.run();
	    //자동차가 달립니다.
	    //자동차가 달립니다.
	    //자동차가 달립니다.
	    //자동차가 달립니다.
	    //자동차가 달립니다.
	    //자동차가 달립니다.
	  }
}
