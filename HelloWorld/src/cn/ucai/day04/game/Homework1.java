package cn.ucai.day04.game;

/**
1������һ���ַ��������硰�����и�Ů���Ѱ���,��ӡ�����ַ�ͼ��
�ں����и�Ů���Ѱ�
�ڿں����и�Ů���Ѱ�
�ڿڿں����и�Ů���Ѱ�
 */
public class Homework1 {
	public static void main(String[] args) {
		String str = "�����и�Ů���Ѱ�";
		int len = str.length();
		for(int i=0;i<str.length();i++){
			for(int j=0;j<i;j++){
				System.out.print("    ");
			}
			System.out.println(str.substring(i));
		}
		
		for(int i=0;i<len;i++){
			str = "��"+str;
			System.out.println(str.substring(1, len+1));
		}
	}
}
