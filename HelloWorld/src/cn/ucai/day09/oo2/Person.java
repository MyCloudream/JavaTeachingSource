package cn.ucai.day09.oo2;

/**
 * static ��
 * 1�����ԡ�����
 * 2�����飺��̬����
 * 
 * final�����յ� ����
 * 1���������ԣ���ʾ�����Ա���Ҫ��ֵ ���ָ�ֵ��ʽ
 * 2��static finalͬʱ�������ԣ������ָ�ֵ��ʽ
 * 3��static final �����ɱ�ı�����������
 * 
 * ���η��� 
 * ����ĳ��������ʾ�÷������ܱ���д
 * �����ࣺ��ʾ���಻�ܱ��̳У����з������� ����д�ģ�
 * 
 */
public class Person {
	private static final int MAX_AGE = 10;
	private static final int b;
	static{
		b = 10;
	}
	/*private static final int c;
	public Person(int c){
		this.c = c;
	}*/
	public static void main(String[] args) {
		System.out.println(Math.PI);
	}
}
