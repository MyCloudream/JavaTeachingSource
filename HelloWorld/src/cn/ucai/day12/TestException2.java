package cn.ucai.day12;
/**
 * ��ϰ��
 * ��дһ��Person�࣬�ṩname,age���ԣ�Ҫ����ȫ��װ
 * ��setAge�У�����
 * 	���age<0 �׳��Զ����AgeException�쳣
 * ��TestPerson�У���setAge�������ã���ɶ�Person�����age�ĸ�ֵ������
 */
public class TestException2 {
	public static void main(String[] args) {
		/*try {
			m(2,0);
		} catch (MyException e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}*/
		m(2,0);
		System.out.println("else");
	}
	
	public static void m(int a,int b)/* throws MyException*/{
		if(b==0){
			throw new MyException("��0��");
		}
	}
}
/**
 * �̳���Exception RuntimeException
 * �Զ����쳣��ʹ�ã�throw
 * throw + �쳣�������ڽ����쳣�����׳�
 * 
 * �Զ����쳣��
 * 1���̳���Exception/RuntimeException
 * 2���ṩһ��String�������Ĺ��죺���е�String����ʾ�Ը��쳣��Ϣ������
 * 3��ʹ�õ�ʱ��throw + �쳣�������ڽ����쳣�����׳�
 */
class MyException extends RuntimeException{
	public MyException(){}
	public MyException(String msg){
		super(msg);
	}
}

