package cn.ucai.day07.p4;

/**
 * javabean  ʵ����
 * ��ȫ��װ
 */
public class Person {
	private String name;
	private int age;
	private int height;
	private int weight;
	public Person(){
		
	}
	
	public Person(String name,int age,int height,int weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	// ���ҽ���
	void desc(){
		System.out.println("�ҽ�"+name+"������"+age+"�꣬���"+height+"cm,����"+weight+"kg");
	}
	
	public static void main(String[] args) {
		Person p = new Person();
		p.setAge(-10);
		System.out.println(p.getAge());
	}
	// get set����

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	// alt+shift+s
}
