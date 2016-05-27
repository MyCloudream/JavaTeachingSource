package cn.ucai.day08.p1;

public class TestStringBuilder {
	public static void main(String[] args) {
		String s1 = "zhangsan";
		String s2 = "20";
		String s3 = "zhangsan@ucai.cn";
		String s4 = "18911118776";
		// 
		String s5 = s1+s2+s3+s4;
		
//		StringBuilder/StringBuffer
		StringBuilder builder = new StringBuilder();
		builder.append(s1).append(s2).append(s3).append(s4);
		// 翻看API：insert reverse() 
		String s6 = builder.toString();
		System.out.println(s6);
		// StringBuffer 5.0之后  线程安全  应用于多线程场景
		// StringBuilder : 单线程情况
	}
}
