package cn.ucai.day09;
/**
 * ��װ��
 * 1������ȫ��˽��
 * 2���ṩ����ͳһ�Ķ�����ʵķ�ʽ
 * 3���ṩ�޲ι���
 * 
 * ����淶��
 * 1��������ȫСд   ��������д+��Ŀ��+ģ����
 * 2���������ӿ���   ���е�������ĸ��д��   ������ĸ_$  ���ֲ��ܿ�ͷ
 * 3����������������   ��һ����������ĸСд��������������ĸ��д
 * 4�����������ɱ�ı�������ȫ��д����ͬ����ʹ��_�ָ�
 * 
 * Java��Сд����
 */
public class Person {
	// ���� ����Ա���� ʵ��������
	// name age
	// Ȩ�����η���public protected  default private 
	private String name;
	private int age ;

	public Person(){
		
	}
	
	/*public Person(String name,int age){
		this.name = name;
		this.age = age;
	}*/
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
