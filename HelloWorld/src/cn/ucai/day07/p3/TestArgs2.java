package cn.ucai.day07.p3;

public class TestArgs2 {
	public static void main(String[] args) {
		// new Person(); new表示开辟堆内存空间 表示真实对象
		Person p = new Person("尚鹏",20);
		Person p1 = p;

		p1.name = "大宇";
		
		
//		m(p);
		System.out.println(p.name);
		System.out.println(p1.name);
	}
	
	public static void m(Person p1){
		p1.name = "大宇";
	}
}
