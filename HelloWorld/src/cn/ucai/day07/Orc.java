package cn.ucai.day07;

import java.util.Random;

import cn.ucai.tools.InputTools;

public class Orc {
	String name;
	int hp;
	int lv;
	
	public Orc(){
		
	}
	
	public Orc(String name,int hp,int lv){
		this.name = name;
		this.hp = hp;
		this.lv = lv;
	}
	
	void desc(){
		System.out.println(name+":"+hp+":"+lv);
	}
	
	public static void main(String[] args) {
		Random random = new Random();
		Orc[] orcArr = new Orc[20];
		String[] orcName = {"������","���ܹ�","�����"};
		for(int i=0;i<20;i++){
			// 3�ֹ���  Ѫ����100-500�� �ȼ���1-5��
			int ran = random.nextInt(5)+1;
			int index = random.nextInt(3);
			orcArr[i] = new Orc(orcName[index],ran*100,ran);
			orcArr[i].desc();
		}
		System.out.println("����������лն��");
		int ni = InputTools.getInputInt();
		if(ni==1){
			for(int i=0;i<orcArr.length;i++){
				if(orcArr[i].hp<=300){
					System.out.println("�ȼ�Ϊ"+orcArr[i].lv+"��"+orcArr[i].name+"������");
				}else{
					orcArr[i].desc();
					orcArr[i].hp -= 300;
					orcArr[i].desc();
				}
			}
		}
	}
}
