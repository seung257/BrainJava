public class Person {

	String name;
	int age;
	
	//�Ű����� ���� ������
	public Person() {
		
	}
	
	//�Ű����� �ִ� ������
	public Person(String name) {
		this.name = name;
		
	}
	//�Ű����� 2���ִ� ������
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person(int age, String name) �Ű����� 2���ִ� ȣ�z");
	}
	
	public void showPerson() {
		System.out.println("�̸�:" + name + "����:" + age);
	}
	
	public void showPerson(Person obj) {
		System.out.println("showPerson(Person obj) �޼ҵ� ȣ��");
		System.out.println("�̸��� : " + name);
		System.out.println("����:" + age + "�Դϴ�." );
	}
	
}
