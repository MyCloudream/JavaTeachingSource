package cn.ucai.day04.game;

import cn.ucai.tools.InputTools;
import cn.ucai.tools.RandomTools;
/**
 * 砍一刀，HP-1;
 * HP = 500;
 * 
 * 1、百步穿杨   一次能砍倒一棵树   8次   -6
 * 2、 血战八方  一次能砍8棵     3次    50 
 */
public class CutTrees {
	public static void main(String[] args) {
		int treeHP = 1000;
		/** 已经砍的树的数量 **/
		int treeCut = 0;
		int myHP = 500;
		int skill2Times = 8;
		int skill3Times = 3;
		int maxTrees = Integer.MAX_VALUE;
		System.out.println("欢迎来到ucai森林");
		System.out.println("千里冰封、万里雪飘，你需要生一把火");
		System.out.println("在你面向有"+Integer.MAX_VALUE+"棵树,挥舞你的斧头砍树吧");
		System.out.println("请输入数字1砍树");
		for(;;){
			int ni = InputTools.getInputInt();
			if(ni==1){
				// [80-120]
				int hurt = RandomTools.getRandomInt(41)+80;
				// 暴击
				if(hurt==88 || hurt==99 || hurt==111){
					hurt *= 3;
				}else if(hurt==100){
					hurt *= 10;
				}
				treeHP -= hurt;
				if(treeHP<0){
					treeHP = 0;
				}
				myHP--;
				System.out.println("你使用了狂战之怒，对树造成了"+hurt+"点伤害,该树还剩"+treeHP+"点生命，你当前的生命值为："+myHP+",加油！");
				if(myHP==0){
					System.out.println("你已被冻死，请重新开始游戏");
					break;
				}
				if(treeHP<=0){
					treeCut ++; 
					System.out.println("恭喜，你砍到了"+treeCut+"棵树,剩余"+maxTrees--+"棵树");
					treeHP = 1000;
				}
			}else if(ni==2){
				if(skill2Times<=0){
					System.out.println("技能已用尽");
					continue;
				}
				skill2Times -- ;
				myHP -= 6;
				treeCut ++;
				System.out.println("你使用了百步穿杨，砍倒了1棵树，你当前的生命值为："+myHP+",加油！");
			}else if(ni==3){
				if(skill3Times<=0){
					System.out.println("技能已用尽");
					continue;
				}
				skill3Times -- ;
				myHP -= 50;
				treeCut += 8;
				System.out.println("你使用了血战八方，砍倒了8棵树，你当前的生命值为："+myHP+",加油！");
			}else{
				System.out.println("请输入数字1进行砍树");
				continue;
			}
			
			// 生火
			if(treeCut>=10){
				System.out.println("恭喜，可以去生火了（请输入数字0生火）");
				int ni0 = InputTools.getInputInt();
				if(ni0==0){
					int ran = RandomTools.getRandomInt(5);
					if(ran==2){
						System.out.println("恭喜，生火成功！！");
						break;
					}else{
						System.out.println("生火失败,请重新砍树");
						treeCut -= 10;
					}
				}
			}
		}
	}
}
