package cn.ucai.day09.oo4;

/**
 * ClassCastException ��̬
 * ��̬�Ĺ���
 * 1�����������̬��ֻ�ܵ��ø���ķ��������ܵ�������ķ���
 * 2��������̬ʱ�����������д�˸���ķ����������������д֮��ĸ÷���
 * 
 * 3����̬����û�ж�̬
 */
public class Test {
	
	public Animal2 eatWhat(Animal2 animal){
		return new Dog();
	}
	

	public static void main(String[] args) {
		// ���������ָ������Ķ��󣨶�̬��
		// ������Ϊ������  �͹۴��ڣ����ʣ�
		// ������javac ������java
		Animal2 animal = new Cat();
		animal.eat();
		animal.methodAnimal();
//		animal.methodDog();
		
		Dog dog = new Dog();
		dog.dogMethod();
		
		if(animal instanceof Dog){
			Dog dog2 = (Dog)animal;
			dog2.dogMethod();
		}
	}
}
