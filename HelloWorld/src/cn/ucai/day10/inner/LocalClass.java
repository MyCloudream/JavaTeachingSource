package cn.ucai.day10.inner;
/**
 * �ֲ��ڲ���
 * �ֲ��ڲ���ֻ��ʹ���ⲿ������Ի�final���εľֲ�����
 * ����ľֲ��ڲ��ࣺ
 * �����ڲ���
 */
public class LocalClass {
	private int age;
	public void method(){
		final int a = 2;
		class Local{
			public void m(){
				System.out.println("���Ǿֲ��ڲ���");
				System.out.println(age);
			}
		}
		
		Local local = new Local();
		local.m();
		
	}
	
	public static void main(String[] args) {
		LocalClass lc = new LocalClass();
		lc.method();
	}
}
