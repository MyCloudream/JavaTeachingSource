package cn.ucai.day04;

import cn.ucai.tools.InputTools;
/**
 * ���дʹ���
 */
public class TestFor3 {
	public static void main(String[] args) {
		// ��ѭ��
		// ��ѭ��+break ������������������ѭ��
		System.out.println("��ӭ���ٵ�������������");
		System.out.println("�������û���");
		String name = InputTools.getInputString();
		for(;;){
			System.out.println("�������������ݣ�");
			String msg = InputTools.getInputString();
			// ������������ �Ƚ�ʹ��==  ����String��ʹ��equals
			if(msg.equals("bye")){
				System.out.println(name+"˵��"+msg);
				break;
			}else if(msg.equals("ɵñ")||msg.equals("SB")){
				msg = "��Ҫ���ҳԷ�";
//				System.out.println(name+"˵��"+msg);
//				continue;
			}
			System.out.println(name+"˵��"+msg);
		}
	}
}
