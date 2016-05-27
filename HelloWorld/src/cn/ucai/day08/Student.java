package cn.ucai.day08;

/**
 * 继承：使用extends关键字
 * 如果A extends B 则B为父类（superclass） 超类 基类  A称之为子类(subclass)
 * 
 * a、一般方法被继承
 * b、属性被继承 但是受private限制
 * c、构造方法没有被继承
 * 
 * this：本类对象
 * 1、通过.来调用本类的属性或方法
 * 2、后面跟() 表示调用本类的其他构造方法
 * 
 * super:父类对象
 * 1、通过.来调用父类的属性或方法
 * 2、super() 调用父类的构造方法
 * 
 * super:
 * 构造方法里的第一行，要么是super() 要么是this() this最终还是会调用super()
 * 
 * 只支持单继承
 * 
 */
public class Student extends Person{
	private String sno;
	
	public Student(){
		super();// new+构造方法的时候才创建对象
	}
	
	public Student(String sno){
		super();
		this.sno = sno;
	}
	
	public Student(String sno,String name,int age){
		super(name,age);
		this.sno = sno;
		/*super.setName(name);
		super.setAge(age);*/
	}
	
	public String getSno(){
		return this.sno;
	} 
	
	public void setSno(String sno){
		this.sno = sno;
	}
	
	public void desc(){
		System.out.println("name:"+this.getName()+" sno:"+this.sno);
	}
	/**
	 * 重载：相当于在同一个类中
	 * 1、同名不同参 返回类型没有要求
	 * 不同参：个数、类型、顺序
	 * 
	 * 重写、覆写 覆盖
	 * 同名同参同返回
	 * 发生在父子类之间
	 */
	// 重写 
	@Override  // 标注 注解  只是用来标明该方法是重写方法（帮我们检测语法）
	public void learn(){
		System.out.println("学习java");
	}
	
	/*public void learn(){
		System.out.println("学习");
	}*/
	
	public void learn(String s){
		System.out.println("学习"+s);
	}
	
}
