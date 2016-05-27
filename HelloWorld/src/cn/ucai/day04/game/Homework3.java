package cn.ucai.day04.game;

/**
 * 3、已知字符串："this is a test of java". 统计该字符串中字母s出现的次数。
 */
public class Homework3 {
	public static void main(String[] args) {
		String s = "this is a test of java";
		int count = 0;
		for(int i=0;i<s.length();i++){
			char ch = s.charAt(i);
			String strCh = ch + "";
			if(ch=='s' || strCh.equalsIgnoreCase("s")){
				count ++ ;
			}
		}
		System.out.println("s出现的次数："+count);
	}
}
