package cn.ucai.day09.oo4;
/**
 * ���һ�������г��󷽷�����������Ҳ����Ϊ������
 * �й��췽�� ���ǲ��ܴ�������
 * ��main����
 * abstract ����private static final ��ͬ����
 */
public abstract class Animal2 {
	public Animal2(){// �й��췽��
		super();
	}
	
	public abstract void eat();
	
	public void methodAnimal(){
		System.out.println("methodAnimal");
		eat();
	}
	
	public static void main(String[] args) {
		Animal2 a = new Dog();
		a.eat();
	}
}
