package java_exam17;

import java.util.ArrayList;

public class exam2 {
	public static void main(String[] args) {

		// CRUD
		// Create,Read,Update,Delete
		
		int[] arr = new int[10];
//		사람[] arr2 = new 사람[10];
		
		ArrayList<Integer> alist = new ArrayList<Integer>();
		ArrayList<String> blist = new ArrayList<String>();
//		ArrayList<사람> clist = new ArrayList<사람>();

		arr[0] = 10;
		arr[1] = 20;
		
		// 값 추가 - add()
		alist.add(1);
		alist.add(2);
		alist.add(3);
		blist.add("aaa");
//		clist.add(new 사람());
		
		System.out.println(arr[0] + 10);

		// 값 가져오기 - get()
		int a = alist.get(0);
		int b = alist.get(1);
		int c = alist.get(2);
		String d = blist.get(0);

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

		// 값 삭제 - remove
		alist.remove(0);

		// 값 수정 - set
		a = alist.get(0);
		System.out.println(a);
		
		alist.set(0, 100);
		System.out.println(alist.get(0));

		// 데이터 개수 - size
		int size = alist.size();

		System.out.println(size);

	}
}
//class 사람{
//	
//}