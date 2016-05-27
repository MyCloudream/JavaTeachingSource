package cn.ucai.day10.homework1;

/**
 *  开除员工
	计算员工年薪（包括技术人员的项目奖金，管理人员的分红）
 */
public class EmpUtil {
	
	public static void fireEmp(Emp emp){
		System.out.println(emp.getName()+"被开除");
	}
	
	public static double getTotalSal(Emp emp){
		double totalSal = emp.getTotalSal();
		return totalSal;
	}
	
	public static void main(String[] args) {
		Tech tech = new Tech();
		tech.setName("张三");
		tech.setSal(1);
		tech.setComm(2);
		// Emp emp = new Tech();
		
		A a = new A();
		double result = EmpUtil.getTotalSal(a);
		System.out.println(result);
	}
}
