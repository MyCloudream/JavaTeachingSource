package cn.ucai.day13;

public class Person implements Comparable<Person>{
	private int age;
	private String name;
	public Person() {
		super();
	}
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	// java 官方规定：equals相等的两个对象，hashcode()必须相等
	// hashcode()相等 则equals不一定相等
	@Override
	public int hashCode() {
		System.out.println("hashcode:"+this.name);
		final int prime = 37;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
//		return 1;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals:"+this.name);
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
//		return true;
	}
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Person o) {
		System.out.println(this.getName()+":"+o.getName());
		if(this.getAge()==o.getAge()){
			return this.getName().compareTo(o.getName());
		}
		return this.getAge()-o.getAge();
	}
	
	
}
