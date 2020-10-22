package java_exam8;

public class exam1 {

	public static void main(String[] args) {
	    int rst1 = sumOfFactor(1000); 
	    System.out.println(rst1); //2340 출력

	    boolean rst2 = isPrimeNumber(10); 
	    System.out.println(rst2); // false
	    
	    boolean rst3 = isPrimeNumber(7); 
	    System.out.println(rst3); // true

	    int rst4 = countOfPrimeNumbers(1000); 
	    System.out.println(rst4); // 168

	    int rst5 = sumOfPrimeNubmers(1000); 
	    System.out.println(rst5); // 76127
	  }

	  // 약수의 합 구하기
	  public static int sumOfFactor(int num) {
		  int sum = 0;
		  // i는 약수의 대상			  
			  for(int j = 1; j <= num; j++) {
				// 약수 판별
				 if(i % j == 0) {
					 sum += j;
				 }
			  }
	  }

	  // num이 소수인지 아닌지 판별하기
	  public static boolean isPrimeNumber(int num) {
		  if()
	  }

	  // 1부터 n까지의 수중 소수의 개수 구하기
	  public static int countOfPrimeNumbers(int n) {

	  }

	  // 1부터 n까지의 수중 소수의 합 구하
	  public static int sumOfPrimeNubmers(int n) {
		  
	  }

}
