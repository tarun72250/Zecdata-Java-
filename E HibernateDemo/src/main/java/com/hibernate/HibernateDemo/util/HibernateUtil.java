//package com.hibernate.HibernateDemo.util;
//
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//
//import com.hibernate.HibernateDemo.entity.Student;
//
//public class HibernateUtil {
//    private static SessionFactory factory;
//
//    static {
//        try {
//        	System.out.println("Loaded class: " + Student.class.getName());
//        	System.out.println("Class type: " + Student.class);
//
//            factory = new Configuration()
//                    .configure("hibernate.cfg.xml")
//                    .addAnnotatedClass(Student.class)
//                    .buildSessionFactory();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static SessionFactory getSessionFactory() {
//        return factory;
//    }
//}
