package java_exam17;

import java.util.ArrayList;

public class exam1 {

	public static void main(String[] args) {
	/*	// Collection -> ArrayList, Map
		int[] arr = {1,2,3,4,5};
		// 1. 배열 삭제X
		// 2. 배열 추가X
		// 3. 길이가 정해져 있다.
		// 삭제
		//arr[1] = arr[2];
		//arr[2] = arr[3];
		//arr[3] = arr[4];
		// 추가
		arr[4] = arr[3];
		arr[3] = arr[2];
		arr[2] = arr[1];
		arr[1] = 6;
		
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}	*/

		ArrayList list = new ArrayList();
		list.add(10);
		list.add(11);
		list.add(12);
		
		System.out.println(list.get(0));
//		list.showAll();
//		list.remove(1);
//		list.showAll();
	}

}
/*
class ArrayList {
	
	int[] datas = new int[5];
	int size = 0;
	
	void add(int data) {
		datas[size] = data;
		size++;
	}
	
	int get(int index) {
	 	return datas[index];
	}
	
	void remove(int index) {
		
		for(int i = 0; i < datas.length - 1; i++) {
			System.out.println(datas[i]);
		}
		size--;
	}
}
*/