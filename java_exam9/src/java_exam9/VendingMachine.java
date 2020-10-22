package java_exam9;

public class VendingMachine {
	
	int inputedMoney = 0; // 투입금액
	int change = 0;	// 거스름돈
	String beverageNames[] = {"콜라", "사이다", "커피"}; // 음료수 이름
	int beveragePrices[] = {1000, 1200, 800}; // 음료수 가격
	
	// 금액 투입 기능
	void setinputedMoney(int money) {
		inputedMoney = inputedMoney + money;
		System.out.println("현재 투입된 금액은 " + inputedMoney + "입니다.");
	}
	
	// 뽑기 가능한 음료 출력
	void printAllBeverages() {
		for(int i = 0; i < beverageNames.length; i++) {
			System.out.println(i + "." + beverageNames[i] + ":" + beveragePrices[i]);
		}
	}
	
	// 사용자가 선택한 음료 제공
	String getBeverage(int bno) {
		if(inputedMoney < beveragePrices[bno]) {
			System.out.println("금액이 부족합니다.");
			return "";
		}
		inputedMoney = inputedMoney - beveragePrices[bno];
		System.out.println("잔액은 " + inputedMoney + "입니다.");
		return beverageNames[bno];
	}
}
