public class Person {

	String name;
	int age;
	
	//¸Å°³º¯¼ö ¾ø´Â »ı¼ºÀÚ
	public Person() {
		
	}
	
	//¸Å°³º¯¼ö ÀÖ´Â »ı¼ºÀÚ
	public Person(String name) {
		this.name = name;
		
	}
	//¸Å°³º¯¼ö 2°³ÀÖ´Â »ı¼ºÀÚ
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person(int age, String name) ¸Å°³º¯¼ö 2°³ÀÖ´Â È£­z");
	}
	
	public void showPerson() {
		System.out.println("ÀÌ¸§:" + name + "³ªÀÌ:" + age);
	}
	
	public void showPerson(Person obj) {
		System.out.println("showPerson(Person obj) ¸Ş¼Òµå È£Ãâ");
		System.out.println("ÀÌ¸§Àº : " + name);
		System.out.println("³ªÀÌ:" + age + "ÀÔ´Ï´Ù." );
	}
	
}
