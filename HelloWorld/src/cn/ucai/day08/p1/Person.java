package cn.ucai.day08.p1;

public class Person/* extends Object*/{
	private String name;
	private int age;

	public Person() {

	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return this.age;
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
	public String toString() {
		return "Person [name:" + name + ", age==" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {
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
	}
	
	/*@Override // ���� ��������ͬ���·���true
	public boolean equals(Object obj){
		if(obj instanceof Person){// �ж���ߵ������ǲ����ұߵ�����
			Person p2 = (Person) obj;
			if(this.getAge()==p2.getAge()&&this.getName().equals(p2.getName())){
				return true;
			}
		}
		return false;
	}*/
	
	
	

	/*// ��дObject���toString����
	@Override
	public String toString(){
		return "name:"+name+",age:"+age;
	}*/
	
	
}
