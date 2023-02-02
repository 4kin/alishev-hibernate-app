package org.example;

import org.example.model.ItemHibernate;
import org.example.model.PersonHibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AppOneToMany {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(PersonHibernate.class);
        configuration.addAnnotatedClass(ItemHibernate.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();


        try (sessionFactory) {
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();

            PersonHibernate personHibernate = session.get(PersonHibernate.class, 6);
            System.out.println(personHibernate);

            personHibernate.getItems().forEach(System.out::println);

            System.out.println("------------ обратно -----------------");
//            -----------------
            ItemHibernate itemHibernate = session.get(ItemHibernate.class,2);
            System.out.println(itemHibernate);

            PersonHibernate ownerPersonHibernate = itemHibernate.getPerson();
            System.out.println(ownerPersonHibernate);


        }
    }
}
