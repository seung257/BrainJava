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
	
	//매개변수 없는 생성자
	public Circle() {
		this.radius = 1;
		this.name = "";
		//name = "";
	}
	
	//매개변수를 가진 생성자
	public Circle(int radius, String name) {
		this.radius = radius;
		name = name;
	}
	
	//메소드
	public double getArea() {
		return 3.14 * radius * radius;
	}
	
	//메인메소드
	
	public static void main(String[] args) {
		Circle pizza=new Circle(10, "자바피자");

	}

}
