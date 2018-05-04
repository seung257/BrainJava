/**
 * 2018. 5. 3. Dev By Lee.S.J
 * 
 * BrainJava
 */

/**
 * @author lee
 *
 */
public class PersonInfo {

	public static void main(String[] args) {
		
		//클래스 변수
		Person person;
		//매개변수 없는 디폴트 생성자 호출하여 객체생성
//		person = new Person();
		
		//String 매개변수 1개있는 생성자 호출하여 객체생성
		//person = new Person("홍길동",20);
		
		//String 매개변수 int 매개변수 잇는 1개있는 생성자 호출하여 객체생성
		person = new Person("홍길동", 20);
		
		//person.name = "이순신";
		person.age = 40;
		
		
		//메소드 호출
		person.showPerson();
		System.out.println(person);

	}

}
