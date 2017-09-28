package fr.bsi.spring.examples;

import javax.persistence.*;

/**
 * Created by habib on 28/09/2017.
 */
@Entity
@Table(name = "PERSON")
public class Person {

    private Long id;
    private String name;
    private String fullname;

    public Person(){

    }

    @Column(name = "ID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "FULL_NAME")
    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }


}
