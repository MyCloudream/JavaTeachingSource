package cn.ucai.day06;
/**
 * public:Ȩ�����η�
 * 1�������� ͬ������������ ��ͬ��������  --�� �����Ե�
 * 
 * default:
 * ������ ͬ������������
 * 
 * private 
 * �����пɼ� �����Ķ�����
 * 
 * protected
 */
public class TestPublic {
	public static void main(String[] args) {
		m();
		m2();
		m3();
	}
	
	public static void m(){
		System.out.println("public method ");
	}
	
	static void m2(){
		System.out.println("default method ");
	}
	
	private static void m3(){
		System.out.println("private method");
	}
}
