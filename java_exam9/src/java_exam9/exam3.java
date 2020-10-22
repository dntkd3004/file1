package java_exam9;

public class exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 음료수를 객체로
		VendingMachine vm = new VendingMachine();
		
		vm.printAllBeverages();
		vm.setinputedMoney(2000);
		String rst = vm.getBeverage(1);
		System.out.println(rst);
		vm.setinputedMoney(500);
		String rst2 = vm.getBeverage(0);
		System.out.println(rst2);
	}

}
