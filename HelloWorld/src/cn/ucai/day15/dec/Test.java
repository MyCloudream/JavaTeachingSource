package cn.ucai.day15.dec;

/**
 * 24/1
 * 包装设计模式
 * 装饰设计模式
 * ：子类多、有重复需求（功能）
 */
public class Test {
	public static void main(String[] args) {
		// 想得到Java 笑话的老师
		JavaTeacher javaTeacher = new JavaTeacher();// 基本流 节点流
		DecTeacher decTeacher = new DecTeacher(javaTeacher);// 包装流 扩展流
		decTeacher.teach();
//		
//		MathTeacher mathTeacher = new MathTeacher();
//		DecTeacher decTeacher2 = new DecTeacher(mathTeacher);
//		decTeacher2.teach();
		
		// 唱歌 java
		JavaTeacher javaTeacher3 = new JavaTeacher();
		SingTeacher singTeacher3 = new SingTeacher(javaTeacher3);
		DecTeacher decTeacher3 = new DecTeacher(singTeacher3);
		decTeacher3.teach();
	}
}
