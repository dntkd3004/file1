package java_exam4;

public class exam8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열안에 배열 = 2차원 배열 => 표, 행렬
		int[][] arr1 = {
				{1 , 2, 3},
				{4 , 5, 6},
				{7 , 8, 9},
				};
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println(arr1[i][j]);
			}
		}
	}

}
