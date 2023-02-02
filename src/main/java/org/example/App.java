package org.example;

import org.example.model.PersonHibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        // подцепляем класс Person
        configuration.addAnnotatedClass(PersonHibernate.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        try (sessionFactory) {
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();

            PersonHibernate person1 = new PersonHibernate("Test1", 31);
            PersonHibernate person2 = new PersonHibernate("Test2", 32);
            PersonHibernate person3 = new PersonHibernate("Test3", 33);
            PersonHibernate person4 = new PersonHibernate("Test4", 34);

            System.out.println("----------------- добавляем человека из базы -----------------");
            session.persist(person1);
            session.persist(person2);
            session.persist(person3);
            session.persist(person4);

            System.out.println(person1);
            System.out.println(person2);
            System.out.println(person3);
            System.out.println(person4);

            PersonHibernate person = session.get(PersonHibernate.class, person3.getId());

            System.out.println("----------------- удаляем человека из базы -----------------");
            PersonHibernate person5 = session.get(PersonHibernate.class, person.getId());
            session.remove(person5);


            System.out.println("----------------- выводим людей из базы язык HQL -----------------");

            List<PersonHibernate> peoples = session.createQuery("FROM PersonHibernate WHERE age>31 AND name LIKE '%3'").getResultList();
            peoples.forEach(System.out::println);
            System.out.println("----------------- обновляем людей из базы язык HQL -----------------");
            int updatePeoples = session.createQuery("update PersonHibernate set name='Test updated' WHERE age>31 AND name LIKE '%3'").executeUpdate();
            System.out.println(updatePeoples);
            System.out.println("----------------- удаляем людей из базы язык HQL -----------------");
            int deletePeoples = session.createQuery("delete PersonHibernate WHERE age>32 ").executeUpdate();
            System.out.println(deletePeoples);

            session.getTransaction().commit();
        }


    }
}
