package cn.ucai.day10.inner;
/**
 * ����ľֲ��ڲ��ࣺ
 * �����ڲ���
 * new ����/���ӿ�(){}  ��������
 */
public class AnnoClass {
	public void method(A a){
		a.mA();
	}
	
	public void m(){
		method(new A(){// ���弴����
			@Override
			public void mA() {
				System.out.println("�����ڲ���");
			}
		});
	}
	
	public static void main(String[] args) {
		AnnoClass ac = new AnnoClass();
		ac.m();
	}
}

interface A{
	void mA();
}
