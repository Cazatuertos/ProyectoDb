package com.example.demo.Entity;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class UserDb {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surname;
}