package com.example.demo.Criteria;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeProjections {

    private static SessionFactory factory;

    static {
        try {
            factory = new Configuration().configure().buildSessionFactory();
        } catch (HibernateException ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static void main(String[] args) {
        EmployeeProjections ep = new EmployeeProjections();
        ep.getEmployeeNamesAndSalaries();
    }

    public void getEmployeeNamesAndSalaries() {
        Transaction tx = null;

        try (Session session = factory.openSession()) {
            tx = session.beginTransaction();

            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Object[]> query = builder.createQuery(Object[].class);
            Root<Employee> root = query.from(Employee.class);
            query.multiselect(root.get("firstName"), root.get("salary"));

            List<Object[]> results = session.createQuery(query).getResultList();

            for (Object[] row : results) {
                String firstName = (String) row[0];
                int salary = (Integer) row[1];
                System.out.println("First Name: " + firstName + ", Salary: " + salary);
            }

            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            System.err.println("Error while retrieving employee names and salaries: " + e.getMessage());
        }
    }
}
