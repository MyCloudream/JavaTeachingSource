package cn.ucai.day07.p2;

public class TestRel1 {
	public static void main(String[] args) {
		/*Person p = new Person();
		p.name = "奥巴马";
		
		
		Dog dog = new Dog("奥巴狗",2);
		
		p.dog = dog;
		
		// 输出奥巴马的狗的名字
		System.out.println(p.dog.name);
		System.out.println(p.dog.age);*/
		
		Person p = new Person();
		p.name = "汪涵";
		
		
		Person p1 = new Person();
		p1.name = "汪小涵";
		
		Person p2 = new Person();
		p2.name = "汪小小涵";
		
		p1.son = p2;
		
		p.son = p1;
		System.out.println(p.name);
		System.out.println(p.son.name);
		// 输出汪涵的孩子的孩子 的名字
		System.out.println(p.son.son.name);
	}
}
