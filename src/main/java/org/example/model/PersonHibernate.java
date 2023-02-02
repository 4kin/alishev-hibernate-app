package org.example.model;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "Person")
public class PersonHibernate {

    @Id
    @Column(name ="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    @Column(name = "name", length = 100)
    private String name;
    @Column(name = "age")
    private Integer age;

    @OneToMany(mappedBy = "person")
    private Set<ItemHibernate> items = new LinkedHashSet<>();

    public PersonHibernate(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public PersonHibernate() {
    }

    public Set<ItemHibernate> getItems() {
        return items;
    }


    public Integer getAge() {
        return age;
    }

    public void setItems(Set<ItemHibernate> items) {
        this.items = items;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
