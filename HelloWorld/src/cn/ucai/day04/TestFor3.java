package cn.ucai.day04;

import cn.ucai.tools.InputTools;
/**
 * 敏感词过滤
 */
public class TestFor3 {
	public static void main(String[] args) {
		// 死循环
		// 死循环+break 可以用作不定次数的循环
		System.out.println("欢迎光临德玛西亚聊天室");
		System.out.println("请输入用户名");
		String name = InputTools.getInputString();
		for(;;){
			System.out.println("请输入聊天内容：");
			String msg = InputTools.getInputString();
			// 基本数据类型 比较使用==  对于String，使用equals
			if(msg.equals("bye")){
				System.out.println(name+"说："+msg);
				break;
			}else if(msg.equals("傻帽")||msg.equals("SB")){
				msg = "我要请大家吃饭";
//				System.out.println(name+"说："+msg);
//				continue;
			}
			System.out.println(name+"说："+msg);
		}
	}
}
