package cn.ucai.day02;

public class TestVar {
	public static void main(String[] args) {
		//JAVA_HOME C:\Program Files\Java\jdk1.7.0_79
		// path: C:\Program Files\Java\jdk1.7.0_79\bin
		// %JAVA_HOME%\bin
		// ת���ַ�\  \t \r \n \\ \" \' 
//		System.out.print("hello \n wor\'ld");
		// ����   ����1
		// ����������������ʹ��
		// �������������� ������ 
		// ��ʼ�� ֮�����ʹ��
		// = ������ѧ�е��ж�    ��ֵ����� ����˳�򣺴�������
		// �ȼ��� String a = "C:\\Program Files\\Java\\jdk1.9.0_23";
		String a ;
		a = "C:\\Program Files\\Java\\jdk1.7.0_79";
		System.out.println("����path������Ҫ��JAVA_HOME:"+a);
		System.out.println("����tomcat����Ҳ��Ҫ��JAVA_HOME:"+a);
		System.out.println("����Eclipse����Ҳ��Ҫ��JAVA_HOME:"+a);
		System.out.println("����oracle����Ҳ��Ҫ��JAVA_HOME:"+a);
		
		// ((sqrt(20)+sqrt(10))/(sqrt(20)-sqrt(10))
		System.out.println(Math.sqrt(20)+Math.sqrt(10)/(Math.sqrt(20)-Math.sqrt(10)));
		double d1 = Math.sqrt(20);
		double d2 = Math.sqrt(10);
		double d3 = (d1+d2)/(d1-d2);
		System.out.println(d3);
		// ���� 
		
	}
}
