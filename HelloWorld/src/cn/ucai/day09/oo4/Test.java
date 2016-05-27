package cn.ucai.day09.oo4;

/**
 * ClassCastException 多态
 * 多态的规则：
 * 1、如果发生多态，只能调用父类的方法，不能调用子类的方法
 * 2、发生多态时，如果子类重写了父类的方法，则调用子类重写之后的该方法
 * 
 * 3、静态方法没有多态
 */
public class Test {
	
	public Animal2 eatWhat(Animal2 animal){
		return new Dog();
	}
	

	public static void main(String[] args) {
		// 父类的引用指向子类的对象（多态）
		// 主观认为（现象）  客观存在（本质）
		// 编译器javac 运行器java
		Animal2 animal = new Cat();
		animal.eat();
		animal.methodAnimal();
//		animal.methodDog();
		
		Dog dog = new Dog();
		dog.dogMethod();
		
		if(animal instanceof Dog){
			Dog dog2 = (Dog)animal;
			dog2.dogMethod();
		}
	}
}
