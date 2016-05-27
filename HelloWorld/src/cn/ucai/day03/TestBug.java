package cn.ucai.day03;

/**
 * debug过程：
 * 1、设置断点  （双击添加或取消）
 * 2、切换到debug模式
 * 3、debug as -- java application 
 * 4、F6 单步执行
 * 
 * 快捷键：
 * 1、ctrl+d : 删除光标所在行
 * 2、shift+enter : 快速换行
 * 3、ctrl+alt+↑↓：复制光标选中行到上或者下面
 * 4、alt+↑↓：移动光标选中行到上或下面
 */
public class TestBug {
	public static void main(String[] args) {
		System.out.println();
		System.out.println("hello world ");
		System.out.println("hello world ");
		System.out.println("hello world ");
		System.out.println("abc");
	}
}
