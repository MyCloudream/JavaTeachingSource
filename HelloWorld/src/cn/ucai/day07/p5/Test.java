package cn.ucai.day07.p5;

public class Test {
	public static void main(String[] args) {
		/*Dog dog = new Dog("�°͹�",2);
		Person p = new Person("�°���",50,dog);
		
		System.out.println(p.getDog().getName());*/
		
		Person p = new Person();
		p.setName("����");
		
		Person per = new Person();
		per.setName("С��");

		p.setPer(per);
		
		System.out.println(p.getPer().getName());
	}
}
