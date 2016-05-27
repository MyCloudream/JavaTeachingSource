package cn.ucai.day02;

// ctrl + shift + o : 导入（剔除）包
import cn.ucai.tools.InputTools;

// 引入 导入
// 除java.lang包和本包之外的其他的类，想要使用，就必须使用import引入
//import cn.ucai.tools.InputTools;// 包名.类名
// 关键字：全是小写 在Eclipse中变色
public class TestScanner {
	public static void main(String[] args) {
		System.out.println("请输入姓名：");
		String name = InputTools.getInputString();
		System.out.println("您输入的姓名为："+name);
		System.out.println("请输入您的年龄：");
		int age = InputTools.getInputInt();
		System.out.println("年龄为："+age);
	}
}
