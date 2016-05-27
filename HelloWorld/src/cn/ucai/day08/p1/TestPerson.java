package cn.ucai.day08.p1;
/**
 * 1、基本数据类型比较用==
 * 2、引用数据类型 
 * 		如果使用==，比较的是内存中的地址
 * 		如果使用Object的equals比较，相当于==
 * 		重写equals，自定义比较规则，实现逻辑上的相等
 * 3、引用数据类型和null比较 使用== 或 !=
 */	
public class TestPerson {
	public static void main(String[] args) {
		Person p1 = new Person("尚鹏",20);
		Person p2 = new Person("尚鹏2",20);
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
		
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		
		String s3 = new String("abc");
		String s4 = new String("abc");
		System.out.println(s3==s4);
		
		// 创建了几个对象
		String s5 = new String("abc");
		String s6 = new String("abc");
		
	}
}
