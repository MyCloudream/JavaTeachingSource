package cn.ucai.day05;

public class TestArray5 {
	public static void main(String[] args) {
		String[] stuNameArr = { "梁超杰", "张亮", "李双", "栗振艳", "丁国庆", "尚朋", "王大宇", "胡伟伟", "邓义鹏", "钮鹏", "刘炼", "杨小龙", "赖亚文",
				"胡邦茂", "严豪", "周国庆", "黄玺", "苏江", "陈园", "冯鑫林" };
		int a = 0,b = 0;
		for(int i=0;i<stuNameArr.length;i++){
			if(stuNameArr[i].charAt(0)%2==0){
				System.out.println("一組："+stuNameArr[i]);
				a ++ ;
			}else{
				System.out.println("二組："+stuNameArr[i]);
				b ++ ;
			}
		}
		System.out.println(a+":"+b);
	}
}
