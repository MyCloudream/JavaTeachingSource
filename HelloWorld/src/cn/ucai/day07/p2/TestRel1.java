package cn.ucai.day07.p2;

public class TestRel1 {
	public static void main(String[] args) {
		/*Person p = new Person();
		p.name = "�°���";
		
		
		Dog dog = new Dog("�°͹�",2);
		
		p.dog = dog;
		
		// ����°���Ĺ�������
		System.out.println(p.dog.name);
		System.out.println(p.dog.age);*/
		
		Person p = new Person();
		p.name = "����";
		
		
		Person p1 = new Person();
		p1.name = "��С��";
		
		Person p2 = new Person();
		p2.name = "��СС��";
		
		p1.son = p2;
		
		p.son = p1;
		System.out.println(p.name);
		System.out.println(p.son.name);
		// ��������ĺ��ӵĺ��� ������
		System.out.println(p.son.son.name);
	}
}
