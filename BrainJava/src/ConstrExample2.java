/**
 * 2018. 5. 3. Dev By Lee.S.J
 * 
 * BrainJava
 */

public class ConstrExample2 {
	public static void main(String[] args) {
		SubscriberInfo obj1, obj2;
		obj1 = new SubscriberInfo("��ȫ��", "poorman", "zebi");
		obj2 = new SubscriberInfo("�����", "richman", "money", "02-000-0000", "Ÿ���Ӹ���");
		
		printSubscriberInfo(obj1);
		printSubscriberInfo(obj2);

	}
	static void printSubscriberInfo(SubscriberInfo obj) {
		System.out.println("�̸�:" + obj.name);
		System.out.println("���̵�:" + obj.id);
		System.out.println("�н�����:" + obj.password);
		System.out.println("��ȭ��ȣ:" + obj.phoneNo);
		System.out.println("�ּ�:" + obj.address);
		System.out.println();    //�� �ٲ� ���� ���
	}

}
