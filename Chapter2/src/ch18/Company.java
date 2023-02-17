package ch18;

public class Company {
	//싱글톤 예제
	private static Company instance = new Company();
	public Company() {}
	
	public static Company getInstance() { 
		//외부에서 클래스명으로 접근이 가능하도록
		
		if (instance == null) {
			instance = new Company();
		}
		
		return instance;
	}
	
}
