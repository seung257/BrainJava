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
		
		//Ŭ���� ����
		Person person;
		//�Ű����� ���� ����Ʈ ������ ȣ���Ͽ� ��ü����
//		person = new Person();
		
		//String �Ű����� 1���ִ� ������ ȣ���Ͽ� ��ü����
		//person = new Person("ȫ�浿",20);
		
		//String �Ű����� int �Ű����� �մ� 1���ִ� ������ ȣ���Ͽ� ��ü����
		person = new Person("ȫ�浿", 20);
		
		//person.name = "�̼���";
		person.age = 40;
		
		
		//�޼ҵ� ȣ��
		person.showPerson();
		System.out.println(person);

	}

}
