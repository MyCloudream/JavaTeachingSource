package cn.ucai.day06;
/**
 * static ����̬��
 * 1�����η���
 * �ھ�̬�����У�ֻ��ֱ�ӵ��þ�̬����
 * ��һ�㷽���У��ܵ���һ�㷽����Ҳ�ܵ��þ�̬����
 * 2������ȫ�ֱ���
 * ��һ�㷽���У��ܵ���static���ε�ȫ�ֱ�����Ҳ�ܵ���һ�����
 * �ھ�̬�����У�ֻ�ܵ���static���ε�ȫ�ֱ���
 */
public class TestStatic {
	static int a = 2;
	public static void main(String[] args) {
		method();
		System.out.println(a);
//		method2();
	}
	
	public static void method(){
		System.out.println("static method ");
//		method3();
	}
	
	public void method2(){
		System.out.println("!static method ");
		method3();
		method();
	}
	
	public void method3(){
		System.out.println(a);
		System.out.println("!static method ");
	}
	
}
