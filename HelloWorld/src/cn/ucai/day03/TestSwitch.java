package cn.ucai.day03;

import cn.ucai.tools.InputTools;

/**
 * 分支语句
 * switch:选择 开关
 */
public class TestSwitch {
	public static void main(String[] args) {
		System.out.println("请输入您的成绩：");
		int score = InputTools.getInputInt();
		switch (score) {// score数据类型    byte short char int 枚举（5.0） String（7.0） 
		case 5:
			System.out.println("优秀");// switch的穿透现象
			break;
		case 4:
			System.out.println("良好");
			break;
		case 3:
			System.out.println("及格");
			break;
		case 2:
			System.out.println("不及格");
			break;
		case 1:
			System.out.println("不及格");
			break;
		case 0:
			System.out.println("不及格");
			break;
		default:
			System.out.println("输入不合法");
			break;
		}// switch的结尾
	}
}
