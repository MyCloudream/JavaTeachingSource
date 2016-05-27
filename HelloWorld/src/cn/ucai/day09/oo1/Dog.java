package cn.ucai.day09.oo1;
/**
 * 继承：
 * extends
 * 1、属性 （private属性不能直接访问）
 * 2、一般方法
 * 3、静态方法：(但是不能被重写）
 * 继承的好处：
 * 1、代码的复用
 * 2、多态
 * 
 * 重写：覆写 覆盖
 * 1、发生在父子类中
 * 2、同名同参同返回
 * 
 * B is a A : B 子类   A：父类
 * 
 */
public class Dog extends Animal{
	
	@Override  // 标注 注解
	public void eat(){
		System.out.println("吃骨头");
	}
	
}
