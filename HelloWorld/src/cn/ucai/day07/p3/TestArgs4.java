package cn.ucai.day07.p3;

public class TestArgs4 {
	public static void main(String[] args) {
		
		Person p1 = new Person("����",20);
		
		Person p2 = p1;
		
		System.out.println(p1.name);
		System.out.println(p2.name);
		
		p2 = new Person("����",18);
		System.out.println(p1.name);
		System.out.println(p2.name);
		
		/*Person p1 = new Person("����",20);
		
		Person p2 = p1;
		
		System.out.println(p1.name);
		System.out.println(p2.name);
		
		
		p2.name = "����";
		System.out.println(p1.name);
		System.out.println(p2.name);*/
		
		
		
	}
}
