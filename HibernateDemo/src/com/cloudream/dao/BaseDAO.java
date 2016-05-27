package com.cloudream.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.cloudream.utils.HibernateUtil;

public class BaseDAO {
	/**
	 * @param obj
	 *            �������
	 * @return
	 */
	public static boolean add(Object obj) {
		Session session = null;
		Transaction tran = null;
		boolean result = false;
		try {
			session = HibernateUtil.getSession();
			tran = session.beginTransaction();
			session.save(obj);
			tran.commit();
			result = true;
		} catch (Exception e) {
			if (tran != null) {
				// ����ع�
				tran.rollback();
			}
		} finally {
			if (session != null) {
				// �ر�session
				session.close();
			}
		}
		return result;
	}

	/**
	 * @return �������� ����Ϊ�޸ĵ�����id����
	 */
	public static boolean update(Object object) {
		Session session = null;
		Transaction tran = null;
		boolean result = false;
		try {
			session = HibernateUtil.getSession();
			tran = session.beginTransaction();
			session.update(object);
			tran.commit();
			result = true;
		} catch (Exception e) {
			if (tran != null) {
				// ����ع�
				tran.rollback();
			}
		} finally {
			if (session != null) {
				// �ر�session
				session.close();
			}
		}
		return result;
	}

	/**
	 * @param c
	 * @param id
	 *            ��ѯһ�����ݸ���������id��
	 * @return
	 */
	public static <T> T get(Class c, int id) {
		Session session = null;
		T t = null;
		try {
			session = HibernateUtil.getSession();
			t = (T) session.get(c, id);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				// �ر�session
				session.close();
			}
		}
		return t;
	}

	/**
	 * @param obj
	 * @return ɾ������
	 */
	public static boolean delete(Object obj) {
		Session session = null;
		Transaction tran = null;
		boolean result = false;
		try {
			session = HibernateUtil.getSession();
			tran = session.beginTransaction();
			session.delete(obj);
			tran.commit();
			result = true;
		} catch (Exception e) {
			if (tran != null) {
				// ����ع�
				tran.rollback();
			}
		} finally {
			if (session != null) {
				// �ر�session
				session.close();
			}
		}
		return result;
	}

	/**
	 * @param <T>
	 *            ��ѯ������¼
	 * @param sql
	 *            sql���
	 * @param param
	 *            ��������
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> List<T> query(String sql, String[] param) {
		List<T> list = new ArrayList<T>();
		Session session = null;
		try {
			session = HibernateUtil.getSession();
			Query query = session.createQuery(sql);
			if (param != null) {
				for (int i = 0; i < param.length; i++) {
					query.setString(i, param[i]);
				}
			}
			list = query.list();
		} catch (Exception e) {
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return list;
	}

	/**
	 * @param sql
	 * @param param
	 *            ��ѯ������¼
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> T queryOne(String sql, String[] param) {
		T t = null;
		Session session = null;
		try {
			session = HibernateUtil.getSession();
			Query query = session.createQuery(sql);
			if (param != null) {
				for (int i = 0; i < param.length; i++) {
					query.setString(i, param[i]);
				}
				t = (T) query.uniqueResult();
			}
		} catch (Exception e) {
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return t;
	}

	/**
	 * @param <T>
	 * @param sql
	 * @param param
	 * @param page
	 * @param size
	 * @return ʵ�ַ�ҳ��ѯ
	 */
	@SuppressWarnings("unchecked")
	public static <T> List<T> queryByPage(String sql, String[] param, int page, int size) {
		List<T> list = new ArrayList<T>();
		Session session = null;
		try {
			session = HibernateUtil.getSession();
			Query query = session.createQuery(sql);
			if (param != null) {
				for (int i = 0; i < param.length; i++) {
					query.setString(i, param[i]);
				}
			}
			// ɸѡ����
			query.setFirstResult((page - 1) * size);
			query.setMaxResults(size);
			list = query.list();
		} catch (Exception e) {
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return list;
	}

	/**
	 * @param hql
	 * @param pras
	 * @return�������ݸ���
	 */
	public static int getCount(String hql, String[] pras) {
		int resu = 0;
		Session s = null;
		try {
			s = HibernateUtil.getSession();
			Query q = s.createQuery(hql);
			if (pras != null) {
				for (int i = 0; i < pras.length; i++) {
					q.setString(i, pras[i]);
				}
			}
			Iterator it = q.iterate();
			while (it.hasNext()) {
				System.out.println("-----------------" + it.next());
			}
			// resu = Integer.valueOf(q.iterate().next().toString());
			resu = 1;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (s != null)
				s.close();
		}
		return resu;
	}
}