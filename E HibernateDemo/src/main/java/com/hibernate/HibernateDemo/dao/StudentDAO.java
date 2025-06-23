package com.hibernate.HibernateDemo.dao;

import com.hibernate.HibernateDemo.entity.Student;
//import com.hibernate.HibernateDemo.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.hibernate.SessionFactory;

//1.
public class StudentDAO {	
	//with Hibernate Util class 
//	 public StudentDAO() {
//		 this.sessionFactory = HibernateUtil.getSessionFactory();
//	    }
//	 
//	 @Autowired
//    private SessionFactory sessionFactory;
//
//    public StudentDAO(SessionFactory sessionFactory) {
//        this.sessionFactory = sessionFactory;
//    }
//
//    public void saveStudent(Student student) {
//        Transaction tx = null;
//        try (Session session = sessionFactory.openSession()) {
//            tx = session.beginTransaction();
//            session.persist(student);
//            tx.commit();
//        } catch (Exception e) {
//            if (tx != null) tx.rollback();
//            e.printStackTrace();
//        }
//    }
	
	
	//without Hibernate Util class
	@Autowired
	private SessionFactory sessionfactory;
	
	public StudentDAO() {
		sessionfactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
	}
	
	public void saveStudent(Student student) {
		Session session = sessionfactory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.persist(student);
		tx.commit();
	    session.close();
	}
	
	
	public void updateStudent(int id, String newName, String newEmail) {
		Transaction tx= null;
		try (Session session = sessionfactory.openSession())
		{
			tx = session.beginTransaction();
			Student student = session.get(Student.class,id);
			if(student != null) {
				student.setEmail(newEmail);
				student.setId(id);
				student.setName(newName);
				tx.commit();
				System.out.println("Student updated..!");
			}else
			{
				System.out.println("Student not found with id :"+id);
			}
		}catch(Exception e) {
			if(tx !=null) {
				tx.rollback();
				e.printStackTrace();
			}
		}
	}
	
	
	 // DELETE
    public void deleteStudent(int id) {
        Transaction tx = null;
        try (Session session = sessionfactory.openSession()) {
            tx = session.beginTransaction();
            Student student = session.get(Student.class, id);
            if (student != null) {
                session.remove(student); // or session.delete(student);
                tx.commit();
                System.out.println("Student deleted!");
            } else {
                System.out.println("Student not found with ID: " + id);
            }
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }
    }
	
}
