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

public class EmployeeOrderBy {

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
        EmployeeOrderBy eob = new EmployeeOrderBy();
        eob.getEmployeesOrderedBySalary();
    }

    public void getEmployeesOrderedBySalary() {
        Transaction tx = null;

        try (Session session = factory.openSession()) {
            tx = session.beginTransaction();

            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Employee> query = builder.createQuery(Employee.class);
            Root<Employee> root = query.from(Employee.class);
            query.select(root).orderBy(builder.desc(root.get("salary")));

            List<Employee> employees = session.createQuery(query).getResultList();

            System.out.println("Employees ordered by salary (descending):");
            for (Employee emp : employees) {
                System.out.println(emp.getFirstName() + " " + emp.getLastName() + ", Salary: " + emp.getSalary());
            }

            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            System.err.println("Error while retrieving employees ordered by salary: " + e.getMessage());
        }
    }
}
