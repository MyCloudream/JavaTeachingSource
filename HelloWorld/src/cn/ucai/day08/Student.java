package cn.ucai.day08;

/**
 * �̳У�ʹ��extends�ؼ���
 * ���A extends B ��BΪ���ࣨsuperclass�� ���� ����  A��֮Ϊ����(subclass)
 * 
 * a��һ�㷽�����̳�
 * b�����Ա��̳� ������private����
 * c�����췽��û�б��̳�
 * 
 * this���������
 * 1��ͨ��.�����ñ�������Ի򷽷�
 * 2�������() ��ʾ���ñ�����������췽��
 * 
 * super:�������
 * 1��ͨ��.�����ø�������Ի򷽷�
 * 2��super() ���ø���Ĺ��췽��
 * 
 * super:
 * ���췽����ĵ�һ�У�Ҫô��super() Ҫô��this() this���ջ��ǻ����super()
 * 
 * ֻ֧�ֵ��̳�
 * 
 */
public class Student extends Person{
	private String sno;
	
	public Student(){
		super();// new+���췽����ʱ��Ŵ�������
	}
	
	public Student(String sno){
		super();
		this.sno = sno;
	}
	
	public Student(String sno,String name,int age){
		super(name,age);
		this.sno = sno;
		/*super.setName(name);
		super.setAge(age);*/
	}
	
	public String getSno(){
		return this.sno;
	} 
	
	public void setSno(String sno){
		this.sno = sno;
	}
	
	public void desc(){
		System.out.println("name:"+this.getName()+" sno:"+this.sno);
	}
	/**
	 * ���أ��൱����ͬһ������
	 * 1��ͬ����ͬ�� ��������û��Ҫ��
	 * ��ͬ�Σ����������͡�˳��
	 * 
	 * ��д����д ����
	 * ͬ��ͬ��ͬ����
	 * �����ڸ�����֮��
	 */
	// ��д 
	@Override  // ��ע ע��  ֻ�����������÷�������д�����������Ǽ���﷨��
	public void learn(){
		System.out.println("ѧϰjava");
	}
	
	/*public void learn(){
		System.out.println("ѧϰ");
	}*/
	
	public void learn(String s){
		System.out.println("ѧϰ"+s);
	}
	
}
