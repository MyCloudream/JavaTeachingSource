package cn.ucai.day08;

public class TestStaticBlock {
	private static int age;
	static{// һ��ȫ������
		System.out.println("��̬ȫ������");
	}
	
	public TestStaticBlock(){
		System.out.println("�޲ι���");
	}
	
	public static void main(String[] args) {
		TestStaticBlock tsb1 = new TestStaticBlock();
		TestStaticBlock tsb2 = new TestStaticBlock();
		TestStaticBlock tsb3 = new TestStaticBlock();
		TestStaticBlock tsb4 = new TestStaticBlock();
	}

	public static int getAge() {
		return age;
	}

	public static void setAge(int age) {
		TestStaticBlock.age = age;
	}
	
}
