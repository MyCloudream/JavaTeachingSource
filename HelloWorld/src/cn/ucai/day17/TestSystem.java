package cn.ucai.day17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ����ض���
 * System�е�in��out,err
 * 
 * json�������parse
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
		// JDK5.0֮ǰ�����뷽ʽ
		// ֮��ʹ��Scanner
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�����룺");
		String str = br.readLine();// ��������
		System.out.println(str);
		
		System.out.println("������һ��int��");
		int ni = Integer.parseInt(br.readLine());
		System.out.println("ni:"+(ni+1));
		
		br.close();*/
		
		System.err.println("hello");
	}
}
