package cn.ucai.day03;

/**
 * ���������÷�Χ�����ڵĴ�����
 * @author sks
 *
 */
public class TestVar {
	public static void main(String[] args) {
		System.out.println("hello world !");
		String name = "����";
		{// ����
			System.out.println("hello world 2 ");
			System.out.println(name);
			System.out.println("3");
		}
		System.out.println(name);
	}
}
