/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.logging.Logger;

/**
 *
 * @author invitado
 */
public class Person {
    private int id;
    private String name;
    private String address;
    
     public Person (int id,String name){
         this.id=id;
         this.name=name;
         
     }

    public Person(String address) {
        this.address = address;
    }
    private static final Logger LOG = Logger.getLogger(Person.class.getName());

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
