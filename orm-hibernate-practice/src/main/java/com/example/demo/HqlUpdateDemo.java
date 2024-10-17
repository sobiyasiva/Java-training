
package com.example.demo;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class HqlUpdateDemo {
    public static void main(String[] args) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            String hqlUpdate = "update User set email = :newEmail where username = :username";
            Query<?> query = session.createQuery(hqlUpdate);
            query.setParameter("newEmail", "new_john@example.com");
            query.setParameter("username", "john_doe");
            int result = query.executeUpdate();
            System.out.println("Rows affected: " + result);
            tx.commit();
        } catch (Exception e) {
            printStackTrace(e);
        }
    }
    public static void printStackTrace(Throwable throwable) {
        System.err.println(throwable.toString()); 
        for (StackTraceElement element : throwable.getStackTrace()) {
            System.err.println("\tat " + element); 
        }
    }
}
