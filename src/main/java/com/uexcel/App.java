package com.uexcel;

import com.uexcel.DataSourceManager.EntityManagement;
import com.uexcel.entity.Student;
import com.uexcel.entity.User;
import com.uexcel.entity.keys.Studentakay;
import com.uexcel.entity.keys.UserKey;

import jakarta.persistence.EntityManager;

public class App {
    public static void main(String[] args) {
        EntityManager entityManager = EntityManagement.getEntityManager();
        try {
            entityManager.getTransaction().begin();

            // User user = new User();
            // user.setName("Uexcel");
            // user.setProjectCode("E90");
            // user.setWorkCode("089");
            // entityManager.persist(user);

            // Studentakay id = new Studentakay();
            // id.setNumber("0220");
            // id.setCode("HR098");

            // Student st = new Student();
            // st.setName("Uexcel");
            // st.setId(id);

            // entityManager.persist(st);

            // UserKey id = new UserKey("089", "E90");
            // User user1 = entityManager.find(User.class, id);
            // System.out.println(user1);

            Studentakay id = new Studentakay("HR098", "0220");

            Student st = entityManager.find(Student.class, id);
            System.out.println(st);

            entityManager.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
    }
}
