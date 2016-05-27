package cn.ucai.day09;
/**
 * 封装：
 * 1、属性全部私有
 * 2、提供公开统一的对外访问的方式
 * 3、提供无参构造
 * 
 * 编码规范：
 * 1、包名：全小写   域名倒着写+项目名+模块名
 * 2、类名、接口名   所有单词首字母大写！   数字字母_$  数字不能开头
 * 3、变量名、方法名   第一个单词首字母小写，其他单词首字母大写
 * 4、常量（不可变的变量）：全大写，不同单词使用_分隔
 * 
 * Java大小写敏感
 */
public class Person {
	// 属性 （成员变量 实例变量）
	// name age
	// 权限修饰符：public protected  default private 
	private String name;
	private int age ;

	public Person(){
		
	}
	
	/*public Person(String name,int age){
		this.name = name;
		this.age = age;
	}*/
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
