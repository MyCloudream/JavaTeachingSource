package cn.ucai.day04.game;

public class TestWhile2 {
	public static void main(String[] args) {
		int count = 0;
		while(count<100){
			count++;
			if(count<=20){
				System.out.println("�����Գ�"+count+"��");
			}else if(count<100){
				System.out.println("������꣬����"+count+"��");
			}else{
				System.out.println("��������"+count);
			}
		}
	}
}
