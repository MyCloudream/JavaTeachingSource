package com.cloudream.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	private static SessionFactory sessionFactory;

	/**
	 * @return ��ȡ�Ự����
	 */
	public static SessionFactory getSessionFactory() {
		// hibernate����ڣ����ڽ������ļ�����Ϣ���ص��ڴ���
		// ��һ��:��ȡHibernate�������ļ� hibernamte.cfg.xml�ļ�
		Configuration con = new Configuration().configure();
//		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(con.getProperties())
//				.build();
		// �ڶ���:�����Ự����  ���г־û��Ĳ�����ʹ��SessionFactory�����
		// ����SessionFactory����con�����ص�������Ϣ���ص�SessionFactory���ڴ���
		SessionFactory sessionFactory = con.buildSessionFactory(/*serviceRegistry*/);
		return sessionFactory;
	}

	/**
	 * @return ��ȡ�Ự����
	 */
	public static Session getSession() {
		return getSessionFactory().openSession();
	}
}