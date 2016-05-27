package cn.ucai.day12;

import java.util.Arrays;

/**
 * 正则表达式：主要用于一些验证
 * String类中对正则表达式的支持
 */
public class TestRegex {
	public static void main(String[] args) {
		String s = "2";
		// [abc] :表示取a或b或c中的其中的任意1个
		System.out.println(s.matches("[a-zA-Z0-9]"));
		String str = "abc21def123mno315abc";
		String[] strArr = str.split("\\d+");
		System.out.println(Arrays.toString(strArr));
		
		String name = "____^___";
		// 用户名：数字字母下划线 出现6-8次
		if(name.matches("[0-9a-zA-Z_]{6,8}")){
			System.out.println("注册成功");
		}else{
			System.out.println("用户名不符合规则");
		}
		
		// 验证手机号码是否正确：
		// 11位 全是数字 1开头
		String pn = "28911010011";
		if(pn.matches("1{1}[0-9]{10}")){
			System.out.println("注册成功");
		}else{
			System.out.println("手机号码不符合规则");
		}
		
		// 练习：
		// 邮箱的验证：chenjun_123@ucai.cn
		// 数字字母下划线，长度5以上 @数字字母，长度为2以上  .  com或cn
		String email = "chenjun_123@ucai.cn";
//		String email = "cn";
		if(email.matches("\\w{5,}@{1}[0-9A-Za-z]{2,}\\.{1}(com|cn)")){
			System.out.println("邮箱验证成功");
		}
	}
}
