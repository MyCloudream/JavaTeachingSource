package cn.ucai.day10.homework1;

/**
 *  ����Ա��
	����Ա����н������������Ա����Ŀ���𣬹�����Ա�ķֺ죩
 */
public class EmpUtil {
	
	public static void fireEmp(Emp emp){
		System.out.println(emp.getName()+"������");
	}
	
	public static double getTotalSal(Emp emp){
		double totalSal = emp.getTotalSal();
		return totalSal;
	}
	
	public static void main(String[] args) {
		Tech tech = new Tech();
		tech.setName("����");
		tech.setSal(1);
		tech.setComm(2);
		// Emp emp = new Tech();
		
		A a = new A();
		double result = EmpUtil.getTotalSal(a);
		System.out.println(result);
	}
}
