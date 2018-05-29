package com.ourmind.model;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "user")
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")  
    private int id;  
  
  
  
    @Column(name = "first_name")  
    private String firstName;  
  
  
    @Column(name = "last_name")  
    private String lastName;  
  
  
    @Column(name = "gender")  
    private String gender;  
  
  
  
    @Column(name = "city")  
    private String City;  
  
  
    public int getId() {  
        return id;  
    }  
  
  
    public void setId(int id) {  
        this.id = id;  
  
    }  
  
  
    public String getFirstName() {  
        return firstName;  
  
    }  
  
  
    public void setFirstName(String firstName) {  
        this.firstName = firstName;  
  
    }  
  
  
    public String getLastName() {  
        return lastName;  
  
    }  
  
  
    public void setLastName(String lastName) {  
        this.lastName = lastName;  
    }  
  
  
    public String getGender() {  
        return gender;  
  
    }  
  
  
    public void setGender(String gender) {  
        this.gender = gender;  
  
    }  
  
  
    public String getCity() {  
        return City;  
    }  
  
  
    public void setCity(String city) {  
        City = city;  
    }  
}  