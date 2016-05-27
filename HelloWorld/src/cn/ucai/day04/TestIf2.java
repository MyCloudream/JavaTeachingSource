package cn.ucai.day04;

import cn.ucai.tools.InputTools;

public class TestIf2 {
	public static void main(String[] args) {
		System.out.println("请输入语文成绩：");
		int scoreChi = InputTools.getInputInt();
		System.out.println("请输入数学成绩：");
		int scoreMath = InputTools.getInputInt();
		/*if(scoreChi>=90){// 语文>=90
			if(scoreMath>=90){
				System.out.println("优秀");
			}else if(scoreMath<60){
				System.out.println("偏科");
			}
		}else if(scoreChi<60){// 语文<90      语文<60 数学>=90
			if(scoreMath>=90){
				System.out.println("偏科");
			}
		}*/
		// 9 99 
		if(scoreChi>=90 && scoreMath>=90){
			System.out.println("优秀");
		}else if((scoreChi>=90&&scoreMath<60)||(scoreChi<60&&scoreMath>=90)){
			System.out.println("偏科");
		}
	}
}
