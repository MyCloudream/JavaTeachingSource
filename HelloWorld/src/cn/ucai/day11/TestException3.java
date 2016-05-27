package cn.ucai.day11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 处理机制：
 * try-catch-finally
 * 
 * RuntimeException：运行时异常：可以处理可以不处理
 * 非运行时异常、检查时异常、编译时异常：必须处理
 */
public class TestException3 {
	public static void main(String[] args) {
		try {
			FileInputStream fis1 = new FileInputStream(new File("E:/a.txt"));
			FileInputStream fis2 = new FileInputStream(new File("E:/a.txt"));
			Thread.sleep(1000);
		} catch (FileNotFoundException e) {
			e.printStackTrace();// 打印异常堆栈跟踪信息
		} catch(IOException e){
			e.printStackTrace();
		} catch(InterruptedException e){
			e.printStackTrace();
		} finally {// 无论如何，肯定会执行的代码
			
		}
		
		System.out.println("后面代码");
	}
}
