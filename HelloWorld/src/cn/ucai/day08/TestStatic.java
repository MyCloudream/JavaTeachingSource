package cn.ucai.day08;

/**
 * static����̬�� ���  Ϊ���ж������ 
 * 1��static�������η���
 * 2����������
 * 3�����ξ�̬����
 * 4�������ڲ���
 * �������У�
 * ���������--����ص��ڴ���--����   ��ֻ����һ�Σ���̬��������һ�Σ� 
 * static ������ص�ʱ����ɳ�ʼ��
 * һ������Ժͷ�����������ʱ�����ɳ�ʼ��
 */
public class TestStatic {
	static int age;
	int age2;
	
	public static void main(String[] args) {
		System.out.println(age);
		m();
	}
	
	public static void m(){
		System.out.println("static method ");
	}
	
	public void m1(){
		System.out.println("static method ");
		System.out.println(age);
		System.out.println(age2);
	}
}
