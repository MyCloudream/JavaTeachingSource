package cn.ucai.day07.p5;

public class Test {
	public static void main(String[] args) {
		/*Dog dog = new Dog("°Â°Í¹·",2);
		Person p = new Person("°Â°ÍÂí",50,dog);
		
		System.out.println(p.getDog().getName());*/
		
		Person p = new Person();
		p.setName("Íôº­");
		
		Person per = new Person();
		per.setName("Ð¡º­");

		p.setPer(per);
		
		System.out.println(p.getPer().getName());
	}
}
