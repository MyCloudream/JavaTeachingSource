package cn.ucai.day07.p3;

public class TestArgs2 {
	public static void main(String[] args) {
		// new Person(); new��ʾ���ٶ��ڴ�ռ� ��ʾ��ʵ����
		Person p = new Person("����",20);
		Person p1 = p;

		p1.name = "����";
		
		
//		m(p);
		System.out.println(p.name);
		System.out.println(p1.name);
	}
	
	public static void m(Person p1){
		p1.name = "����";
	}
}
