//자바의 싱글톤 패턴 구현 ( singleton design pattern )

// < UserService를 한 번만 생성하도록 구현하기 >

class UserService{
	
	//3. static
	private static UserService service;
	
	//1. 생성자를 private 지정
	private UserService() {
	}
	
	//2. 한 번은 생성하기 : 자신의 메서드에서 생성
	public static UserService getInstance() {
		if(service==null) {  //4. 한번만 생성되도록 함
			service = new UserService();
		}
		return service;
	}
	//외부에서 객체 생성 불가! 객체 생성하지 않고 getInstance에 접근하기 위해 static
}

public class TestMain {

	public static void main(String[] args) {

		//UserService s1 = new UserService();
		//UserService s2 = new UserService();
		//=>객체 생성 안됨. 메서드로 접근
		UserService s1 = UserService.getInstance();	//100번지
		UserService s2 = UserService.getInstance();	//100번지
		UserService s3 = UserService.getInstance();	//100번지
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s2 == s3);
		// 전부 같은 주소값
		
		// ==> 대표적인 싱글톤 객체 : Calendar.getInstance()
		
		
		/*
		 * 4. if문
		 * 맨 처음 getInstance 호출하면 null이기 때문에 if문이 실행되어 객체 생성이 되고 service변수에 100번지가 저장된다
		 * 두번째 호출부터는 null이 아니므로 if문 실행되지 않고 객체생성없이 service값인 100번지를 반환한다
		 */
		
		
	}

}
