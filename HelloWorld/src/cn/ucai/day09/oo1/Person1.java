package cn.ucai.day09.oo1;
/**
 * ��̬��һ������/�������ù���
 * ��̬����ֻ�ܵ��þ�̬���Ի򷽷�
 * һ�㷽������Ա������ �ܵ���һ�㷽����Ҳ�ܵ��þ�̬����
 * 
 * ����JVM--���ص��ڴ��У�����أ�--��������
 * static ������ص�ʱ��ȷ��
 */
public class Person1 {
	static int a;// �����������  ���ж������
 	int age;// һ�����ԣ�ÿһ������ӵ���Լ��ĸ�����
	public Person1(){
		a++;
		age++;
	}
	public static void main(String[] args) {
		Person1 p1 = new Person1();
		System.out.println(p1.a);// 1
		System.out.println(p1.age);// 1
		Person1 p2 = new Person1();
		System.out.println(p2.a);// 2
		System.out.println(p1.a);// 2
		System.out.println(p2.age);// 1
		
		Person1 p3 = new Person1();
		System.out.println(p3.age);// 1
		System.out.println(p3.a);// 3
	}
}
