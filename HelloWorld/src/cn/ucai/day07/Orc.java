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
		String[] orcName = {"尚鹏怪","超杰怪","大宇怪"};
		for(int i=0;i<20;i++){
			// 3种怪物  血量（100-500） 等级（1-5）
			int ran = random.nextInt(5)+1;
			int index = random.nextInt(3);
			orcArr[i] = new Orc(orcName[index],ran*100,ran);
			orcArr[i].desc();
		}
		System.out.println("发出良辰重谢斩！");
		int ni = InputTools.getInputInt();
		if(ni==1){
			for(int i=0;i<orcArr.length;i++){
				if(orcArr[i].hp<=300){
					System.out.println("等级为"+orcArr[i].lv+"的"+orcArr[i].name+"被秒了");
				}else{
					orcArr[i].desc();
					orcArr[i].hp -= 300;
					orcArr[i].desc();
				}
			}
		}
	}
}
