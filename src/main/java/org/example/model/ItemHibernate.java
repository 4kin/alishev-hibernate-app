package org.example.model;

import jakarta.persistence.*;

@Entity
@Table(name = "item")
public class ItemHibernate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_id")
    private PersonHibernate person;

    @Column(name = "item_name", nullable = false, length = 100)
    private String itemName;


    public ItemHibernate() {
    }

    public ItemHibernate(PersonHibernate person, String itemName) {
        this.person = person;
        this.itemName = itemName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PersonHibernate getPerson() {
        return person;
    }

    public void setPerson(PersonHibernate person) {
        this.person = person;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public String toString() {
        return "ItemHibernate{" +
                "id=" + id +
                ", person=" + person +
                ", itemName='" + itemName + '\'' +
                '}';
    }
}