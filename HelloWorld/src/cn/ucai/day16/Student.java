package cn.ucai.day16;

import java.io.Serializable;
/**
 * Serializable:���л��ӿڣ�
 * ʵ�ָýӿ�����ʵ���κη�����û�У� ֻ����������������Ա����л��ˡ�
 * Throwable Serializable Comparable Iterable
 * static : ���ε����Բ��� �����л�
 * transient:���ε����Բ��ܱ����л�
 */
public class Student implements Serializable{
	private static final long serialVersionUID = 1L;
	//	private static String name;
	private static String name;
	private String className;
	private transient int age;
	private Address address;
	public Student() {
		super();
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Student(String name, int age,Address address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
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
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
}
