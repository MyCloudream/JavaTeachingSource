package cn.ucai.day12.homework;

public class TestCircle {
	public static void main(String[] args) {
		Circle circle = new Circle();
		Point point = new Point(2,3);
		circle.setR(2);
		circle.setP(point);
		System.out.println("�ܳ���"+circle.getS());
		System.out.println("�����"+circle.getV());
		
		System.out.println(circle.getP().getX());
	}
}
