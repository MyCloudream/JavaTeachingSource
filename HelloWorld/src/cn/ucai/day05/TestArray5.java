package cn.ucai.day05;

public class TestArray5 {
	public static void main(String[] args) {
		String[] stuNameArr = { "������", "����", "��˫", "������", "������", "����", "������", "��ΰΰ", "������", "ť��", "����", "��С��", "������",
				"����ï", "�Ϻ�", "�ܹ���", "����", "�ս�", "��԰", "������" };
		int a = 0,b = 0;
		for(int i=0;i<stuNameArr.length;i++){
			if(stuNameArr[i].charAt(0)%2==0){
				System.out.println("һ�M��"+stuNameArr[i]);
				a ++ ;
			}else{
				System.out.println("���M��"+stuNameArr[i]);
				b ++ ;
			}
		}
		System.out.println(a+":"+b);
	}
}
