/**
 * 2018. 5. 3. Dev By Lee.S.J
 * 
 * BrainJava
 */

/**
 * @author lee
 *
 */
public class Circle {
	public int radius;
	public String name;
	
	//�Ű����� ���� ������
	public Circle() {
		this.radius = 1;
		this.name = "";
		//name = "";
	}
	
	//�Ű������� ���� ������
	public Circle(int radius, String name) {
		this.radius = radius;
		name = name;
	}
	
	//�޼ҵ�
	public double getArea() {
		return 3.14 * radius * radius;
	}
	
	//���θ޼ҵ�
	
	public static void main(String[] args) {
		Circle pizza=new Circle(10, "�ڹ�����");

	}

}
