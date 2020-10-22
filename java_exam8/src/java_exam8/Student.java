package java_exam8;

public class Student {
	String name;
	int math;
	int korean;
	int english;
	
	public void sum() {
		int sum = math+korean+english;
		System.out.println(name+"의 총점은 "+sum);
	}
	
	public void avg() {
		float avg = (math+korean+english)/3;
		System.out.println(name+"의 평균은 "+avg);
	}
}
