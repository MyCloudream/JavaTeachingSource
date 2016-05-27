package cn.ucai.day17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 输出重定向
 * System中的in和out,err
 * 
 * json及其解析parse
 */
public class TestSystem {
	public static void main(String[] args) throws IOException{
		/*System.out.println("hello world !");
		// Logging(apache) log for java log4j   pinyin4j 
		File file = new File("E:/test/a.txt");
		PrintStream ps = new PrintStream(file);
		System.setOut(ps);
		System.out.println("hello java !");
		ps.close();*/
		// JDK5.0之前的输入方式
		// 之后使用Scanner
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("请输入：");
		String str = br.readLine();// 阻塞操作
		System.out.println(str);
		
		System.out.println("请输入一个int：");
		int ni = Integer.parseInt(br.readLine());
		System.out.println("ni:"+(ni+1));
		
		br.close();*/
		
		System.err.println("hello");
	}
}
