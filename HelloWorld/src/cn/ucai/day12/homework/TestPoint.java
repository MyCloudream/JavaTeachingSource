package cn.ucai.day12.homework;

public class TestPoint {
	public static void main(String[] args) {
		Point p1 = new Point(2,3);
		Point p2 = new Point();
		p2.setX(4);
		p2.setY(6);
		
		int i = p2.getDis(p1);
		System.out.println("æ‡¿Î£∫"+i);
	}
}
