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
<<<<<<< HEAD
    private String lastname;
    
     public Person (int id,String name,String lastname){

    private String address;
    
     public Person (int id,String name){
        this.id=id;
         this.name=name;
         
         
     }


    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Person(String lastname) {
        this.lastname = lastname;
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

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + '}';
    }
    
}
