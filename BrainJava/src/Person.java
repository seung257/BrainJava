public class Person {

	String name;
	int age;
	
	//매개변수 없는 생성자
	public Person() {
		
	}
	
	//매개변수 있는 생성자
	public Person(String name) {
		this.name = name;
		
	}
	//매개변수 2개있는 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person(int age, String name) 매개변수 2개있는 호춟");
	}
	
	public void showPerson() {
		System.out.println("이름:" + name + "나이:" + age);
	}
	
	public void showPerson(Person obj) {
		System.out.println("showPerson(Person obj) 메소드 호출");
		System.out.println("이름은 : " + name);
		System.out.println("나이:" + age + "입니다." );
	}
	
}
