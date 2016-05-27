package com.cloudream.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	private static SessionFactory sessionFactory;

	/**
	 * @return 获取会话工厂
	 */
	public static SessionFactory getSessionFactory() {
		// hibernate的入口，用于将配置文件的信息加载到内存中
		// 第一步:读取Hibernate的配置文件 hibernamte.cfg.xml文件
		Configuration con = new Configuration().configure();
//		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(con.getProperties())
//				.build();
		// 第二步:创建会话工厂  所有持久化的操作，使用SessionFactory来完成
		// 创建SessionFactory对象，con将加载的配置信息加载到SessionFactory的内存中
		SessionFactory sessionFactory = con.buildSessionFactory(/*serviceRegistry*/);
		return sessionFactory;
	}

	/**
	 * @return 获取会话对象
	 */
	public static Session getSession() {
		return getSessionFactory().openSession();
	}
}