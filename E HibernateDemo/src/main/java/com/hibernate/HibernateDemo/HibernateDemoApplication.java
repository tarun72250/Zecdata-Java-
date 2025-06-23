package com.hibernate.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.hibernate.HibernateDemo.dao.StudentDAO;
import com.hibernate.HibernateDemo.entity.Student;
import jakarta.transaction.HeuristicMixedException;
import jakarta.transaction.HeuristicRollbackException;
import jakarta.transaction.RollbackException;
import jakarta.transaction.SystemException;

@SpringBootApplication
public class HibernateDemoApplication {

	public static void main(String[] args) {
		// Create DAO object
		StudentDAO studentDAO = new StudentDAO();

        // Create a student object
        //Student student = new Student("Sanjana chouksey", "sanjana@123example.com");

        // Save student using DAO
//        studentDAO.saveStudent(student);
//        System.out.println("Student saved!");
        
        // Save student
//        Student student1 = new Student("Shagun Dubey", "shagun@example.com");
//        studentDAO.saveStudent(student1);

        // Update student
//        studentDAO.updateStudent(1, "Jane Smith", "jane@example.com");

        // Delete student
//        studentDAO.deleteStudent(1);
     
      
        
        
        
        //Not working due to internet checking remainging
//    	SessionFactory sessionfactory = null;
//        Session session = sessionfactory.openSession();
//        Student student = new Student("Rahul chouksey", "rahul@123example.com");
// 
//        Transaction tr = session.beginTransaction();
//        session.save(student);
//        tr.commit();
//        session.close();
//        sessionfactory.close();
        
        
    }
}
