package cn.ucai.day07.p1;

/**
 * ���췽����
 * ���û�������ṩ�κι��췽�������Զ����ṩһ���޲ι��췽��
 * ����ṩ�˹��췽������Ĭ�ϵ��޲β����ṩ
 * 
 * ���췽�������أ�
 * ��������ͬ������������ͬ
 * 
 * ���췽�����໥����
 * ʹ��this(..)��ʾ�Ա����������췽���ĵ���
 * ע�������ѭ��
 * this:��ʾ�������
 * this. ���ñ����������
 */
public class Person {
	String name;
	int age;// ���� Ĭ�ϳ�ʼ��
	int height;
	int weight;
	// �޲ι���
	public Person(){
		
	}
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	// ȫ�ι���
	public Person(String name,int age,int height,int weight){
		this(name,age);
		this.height = height;
		this.weight = weight;
	}
	
	// ���ҽ���
	void desc(){
		System.out.println("�ҽ�"+name+"������"+age+"�꣬���"+height+"cm,����"+weight+"kg");
	}
	
	public static void main(String[] args) {
		Person p = new Person("�ս�",22,220,180);
		p.desc();
		
		Person p2 = new Person();
	}
	
}
