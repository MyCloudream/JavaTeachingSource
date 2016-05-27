package cn.ucai.day06;

import cn.ucai.tools.InputTools;

public class TestRoleSelect {
	public static void main(String[] args) {
		// 静态初始化
		// 血量 普通攻击 魔法攻击 防御
		int[][] niAttr = {
				{100,7,2,3},
				{120,6,7,4},
				{90,7,5,4},
				{150,7,4,7}
		};
		
		String[][] strSkills = {
				{"冰霜射击","全神贯注","万箭齐发","鹰击长空","魔法水晶箭"},
				{"伶俐斗士","淘气打击","海石三叉戟","古灵精怪","巨鲨强袭"},
				{"艾欧尼亚热诚","利刃冲击","飞天姿态","均衡打击","至尊锋刃"},
				{"风暴的抉择","滚滚雷霆","狂野怒意","至尊咆哮","雷霆怒爪"}
		};
		
		String[] nameArr = {"寒冰射手","潮汐海灵","刀锋意志","雷霆之怒"};
		String[] skillAttr = {"血量","普通攻击","魔法攻击","防御"};
		System.out.println("请输入角色名称：");
		String name = InputTools.getInputString();
		for(int i=0;i<nameArr.length;i++){
			if(name.equals(nameArr[i])){
				for(int j=0;j<niAttr[i].length;j++){
					System.out.println(name+"的"+skillAttr[j]+"为："+niAttr[i][j]);
				}
				for(int j=0;j<strSkills[i].length;j++){
					System.out.println(name+"的第"+(j+1)+"个技能为："+strSkills[i][j]);
				}
			}
		}
	}
}
