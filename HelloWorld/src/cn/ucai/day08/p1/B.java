package cn.ucai.day08.p1;
/**
 * ��̬�����У�����ʹ��this��super�ؼ���
 */
public class B extends A{
	private int age;
	// ��̬�������̳��ˡ�
	public static void main(String[] args) {
		B.m();
	}
	
	// ���ܹ�����д
	// ����������о�̬���� �����ж�����ͬ���ַ���ʱ��ֻ�ܶ���Ϊ��̬��
	// "hide"
	public static void m(){
		System.out.println("static method A");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public static void main(String[] args) {
//		B.method2();
		B b = null;
		// The static method method2() from the type B should be accessed in a static way
		b.method2();// B.method2();
		
		B b1 = new B();
		b1.method1();
	}
	
	public void method1(){
		
	}
	
	public static void method2(){
		System.out.println("ok");
	}*/
}
