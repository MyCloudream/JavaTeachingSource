package cn.ucai.day10.inner;
/**
 * �ڲ��ࣺ
 * 1����Ա�ڲ���
 * 2����̬�ڲ���
 */
public class MemClass {
	// ���� ��Ա����  ʵ������
	private static int age;
	public MemClass(){
		Mem mem = new Mem();
		mem.m();
	}
	// ��Ա����
	public static void method(){
		Mem mem = new Mem();
		mem.m();
	}
	
	public static void main(String[] args) {
		MemClass mc = new MemClass();
		// ������
		Mem mem = new Mem();
		mem.m();
	}
	
	public static class Mem{
		public void m(){
			System.out.println("���Ǿ�̬�ڲ���");
		}
	}
}