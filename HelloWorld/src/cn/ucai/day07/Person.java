package cn.ucai.day07;

/**
 * ����һ�������������Ϣ
 */
public class Person {
	// �� ��̬������  ����
	String name;
	int age;
	int height;
	int weight;
	// ���ˣ����������
	// ������һ������ķ��������췽��
	// 1��û�з���ֵ�����ֺ�����һ��
	// 2��������������
	public Person(){
		
	}
	// ��̬��Ϊ ����
	void speak(){
		System.out.println("˵��");
	}
	
	void walk(){
		System.out.println("��·");
	}
	// ���ҽ���
	void desc(){
		System.out.println("�ҽ�"+name+"������"+age+"�꣬���"+height+"cm,����"+weight+"kg");
	}
	
	public static void main(String[] args) {
		// new + ���췽��()
		Person p = new Person();
		p.name = "����";
		p.age = 20;
		p.height = 200;
		p.weight = 200;
		p.desc();
		
		Person p1 = new Person();
		p1.name = "����";
	}
	
}
