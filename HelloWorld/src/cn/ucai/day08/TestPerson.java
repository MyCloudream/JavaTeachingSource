package cn.ucai.day08;

public class TestPerson {
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("����");
		System.out.println(s.getName());
		
		
		Student stu1 = new Student("16001","����",20);
		stu1.desc();
		stu1.learn();
		
		stu1.a();
	}
}
