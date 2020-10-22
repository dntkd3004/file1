package java_exam3;
//구구단은 n단 ~ m단 중 홀수단만 1 ~ limit 까지 곱 중 짝수곱만 출력해주세요.
public class exam4 {
	/*  출력 예시
    5 * 2 = 10
    5 * 4 = 20
    5 * 6 = 30
    5 * 8 = 40
    5 * 10 = 50

    7 * 2 = 14
    7 * 4 = 28
    7 * 6 = 42
    7 * 8 = 56
    7 * 10 = 70
    ...
    ...
    19 * 2 = 38
    19 * 4 = 76
    


    */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int m = 19;
		int limit = 11;
		for(n = 4;n <= m; n++) {
			if(n % 2 != 0) {
				for(int i = 1; i <= limit;i++) {
					if(i % 2 == 0){
						System.out.println(n+"*"+i+"="+n*i);
					}
				}
			}
		}
	}

}
