package java_exam13;

public class exam2 {

	public static void main(String[] args) {
		사람1 a사람 = new 사람1(20, "홍길동", "한양", "착함");

//	    a사람.나이 = 20;
//	    a사람.이름 = "홍길동";
//	    a사람.고향 = "한양";
//	    a사람.성격 = "쾌활";
		
//	    a사람.set나이(20);
//	    a사람.set이름("홍길동");
//		a사람.set고향("한양");
//		a사람.set성격("착함");
		
		System.out.println(a사람.get나이());
		// 출력 : 20
		System.out.println(a사람.get이름());
		// 출력 : 홍길동
		System.out.println(a사람.get고향());
		// 출력 : 한양
		System.out.println(a사람.get성격());
		// 출력 : 착함
	}

}
 class 사람1 {
	private int    나이;
	private String 이름;
	private String 고향;
	private String 성격;
	
	사람1(int 나이,String 이름,String 고향,String 성격) {
		this.나이 = 나이;
		this.이름 = 이름;
		this.고향 = 고향;
		this.성격 = 성격;
	}
	
	public int get나이() {
		return 나이;
	}
	public void set나이(int 나이) {
		this.나이 = 나이;
	}
	public String get이름() {
		return 이름;
	}
	public void set이름(String 이름) {
		this.이름 = 이름;
	}
	public String get고향() {
		return 고향;
	}
	public void set고향(String 고향) {
		this.고향 = 고향;
	}
	public String get성격() {
		return 성격;
	}
	public void set성격(String 성격) {
		this.성격 = 성격;
	}
}