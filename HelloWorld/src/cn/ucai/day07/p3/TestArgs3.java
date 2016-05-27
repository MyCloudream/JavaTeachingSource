package cn.ucai.day07.p3;

public class TestArgs3 {
	public static void main(String[] args) {
		Person p = new Person("…–≈Ù",20);
		Person p1 = p;
		p1 = new Person("¥Û”Ó",18);
//		m(p);
		System.out.println(p.name);
		System.out.println(p1.name);
	}
	
	public static void m(Person p1){
		p1 = new Person("¥Û”Ó",18);
	}
}
