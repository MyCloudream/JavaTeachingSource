package cn.ucai.day04.game;

/**
 * 4�������������ַ������͵ļ۸�ת��Ϊint���ͣ�Ȼ�������������
	String currencyPrie1="��288";
	String currencyPrie2="��38";
 */
public class Homework4 {
	public static void main(String[] args) {
		String s1="��288";
		String s2="��38";
		String s3 = "��38888";
		// 
		String price1 = s1.substring(1,4);
		System.out.println(price1);
		String price2 = s2.substring(1,3);
		System.out.println(price2);
		
		String strPrice1 = s1.substring(1);
		String strPrice2 = s2.substring(1);
		
		int niPrice1 = Integer.parseInt(strPrice1);
		int niPrice2 = Integer.parseInt(strPrice2);
		System.out.println("��ӵĽ��Ϊ��"+(niPrice1+niPrice2));
	}
}
