package cn.ucai.day09.oo4;
/**
 * 
 * interface :�ӿڣ�
 * ���Կ�����һ������ĳ�����
 * 1�����еķ���ȫ������public abstract ���ε�
 * �����дpublic abstract Ĭ��Ҳ����
 * 2�����е�����ȫ������public static final ���εĳ���
 * 3��û�й��췽��
 * 4��û��main���� ���ܶ�������
 */
public interface Animal {
	
	public static final int A = 2 ;
	void a();
	void b();
	
	
}

interface D{
	
}
interface E{
	
}
interface F extends D,E{
	// 
}
// implements���Կ�����һ������ļ̳�
class C implements Animal,D{

	// ʵ�֣���д����������еĳ��󷽷�
	@Override
	public void a() {
		
	}

	@Override
	public void b() {
		
	}
}
