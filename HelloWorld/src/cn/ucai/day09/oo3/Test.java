package cn.ucai.day09.oo3;
/**
 * 基本数据类型之间比较用==
 * 引用数据类型使用==比较的时候，比较的是内存地址
 * 使用Object的equals比较，相当于使用==
 */
public class Test {
	public static void main(String[] args) {
		
		Person p1 = new Person("尚鹏",20);
		
		Person p2 = new Person("尚鹏",20);
		
		Person p3 = new Person("大宇",20);
		
		System.out.println(p1.equals(p2));
		
	}
}
