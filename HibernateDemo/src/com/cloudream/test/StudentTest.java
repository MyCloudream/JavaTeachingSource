package com.cloudream.test;

import java.util.EnumSet;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.hibernate.tool.schema.TargetType;
import org.hibernate.type.StandardBasicTypes;

import com.cloudream.dao.BaseDAO;
import com.cloudream.entity.Student;
import com.cloudream.utils.HibernateUtil;

public class StudentTest {
	public static void createTable() {
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
		Metadata metadata = new MetadataSources(serviceRegistry).buildMetadata();
		SchemaExport schemaExport = new SchemaExport();
		schemaExport.create(EnumSet.of(TargetType.DATABASE), metadata);
	}
	public static void main(String[] args) {
		Session session = HibernateUtil.getSession();
		String sql = "select c.username from customer c,orders o where c.id = o.customer_id and c.id = '1'";
		Query query = session.createSQLQuery(sql).addScalar("username",StandardBasicTypes.STRING);
		System.out.println(query.list());
	}
	
	public static void getCount(){
		int count = BaseDAO.getCount("from Student where age = ?", new String[]{"22"});
		System.out.println(count);
	}
	public static void queryByPage(){
		List<Student> list = BaseDAO.queryByPage("from Student",null,2,2);
		for(Student stu : list){
			System.out.println(stu.getId());
		}
	}
	public static void queryBySql(){
		Student stu = BaseDAO.queryOne("from Student where id = ?",new String[]{"4"});
		System.out.println(stu);
	}
	
	public static void getBySql(){
		List<Student> list = BaseDAO.query("from Student where id in(?,?)",new String[]{"3","4"});
		System.out.println(list);
	}
	
	public static void getId(){
		System.out.println(BaseDAO.get(Student.class, 7));
	}
	
	public static void selectStudent(){
		Student s = new Student();
		s.setName("陈赛涛陈赛涛陈赛涛陈赛涛陈赛涛");
		s.setAge(30);
		BaseDAO.add(s);
	}
	public static void updateStudent(){
		Student s = new Student();
		s.setName("赛涛赛涛赛涛赛涛赛涛");
		s.setAge(20);
		s.setId(2);
		BaseDAO.update(s);
	}
	public static void deleteStudent(){
		Student s = new Student();
		s.setName("赛涛");
		s.setAge(20);
		s.setId(2);
		BaseDAO.delete(s);
	}
}
