package com.qa.estates.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.List;


@Entity
public class BuyerDomain {


    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = full_name, nullable = false)
    private String Fname;
    private String Surname;
    private int age;
    private String Email;
    private Double Telephone;


    public BuyerDomain(String Fname, String Surname, int age, String Email, Double Telephone){
        this.Fname = Fname;
        this.Surname = Surname;
        this.age = age;
        this.Email = Email;
        this.Telephone = Telephone;
    }


    //Getter and Setters
    //Getters

    public String getFname() {
        return Fname;
    }
    public String getSurname(){ return Surname;}
    public int getAge(){ return age;}
    public String getEmail(){ return Email;}
    public Double getTelephone(){ return Telephone;}

    public Integer getId() {return id;}


    //Setters

    public void setFname(String Fname){
        this.Fname = Fname;
    }
    public void setSurname(String Surname){
        this.Surname = Surname;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setEmail(String Email){
        this.Email = Email;
    }
    public void setTelephone(Double Telephone){
        this.Telephone = Telephone;
    }

    public void setId(Integer Id){
        this.id = id;
    }
}
