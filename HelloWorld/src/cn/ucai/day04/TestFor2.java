package cn.ucai.day04;

public class TestFor2 {
	public static void main(String[] args) {
		// i �Ǽ�������
		for(int i=0;i<35;i++){
			if(i*2+(35-i)*4==94){
				System.out.println("����������"+i);
				System.out.println("���ӵ�����:"+(35-i));
				break;// ���ڽ���switch��ѭ��
			}
		}
	}
}
