package cn.ucai.day09.oo1;
/**
 * �̳У�
 * extends
 * 1������ ��private���Բ���ֱ�ӷ��ʣ�
 * 2��һ�㷽��
 * 3����̬������(���ǲ��ܱ���д��
 * �̳еĺô���
 * 1������ĸ���
 * 2����̬
 * 
 * ��д����д ����
 * 1�������ڸ�������
 * 2��ͬ��ͬ��ͬ����
 * 
 * B is a A : B ����   A������
 * 
 */
public class Dog extends Animal{
	
	@Override  // ��ע ע��
	public void eat(){
		System.out.println("�Թ�ͷ");
	}
	
}
