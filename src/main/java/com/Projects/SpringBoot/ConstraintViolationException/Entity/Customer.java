package com.Projects.SpringBoot.ConstraintViolationException.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import org.aspectj.lang.annotation.control.CodeGenerationHint;

@Entity
@Table(name = "Customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    int id;
    @Column(name = "Name",nullable = false)
    String name;
    @Column(name = "AccountNo",nullable = false)
    @Pattern(regexp = "^[0-9]{9,16}$",message = "Please Enter An Valid Account No")
    String accNo;
    @Column(name = "Phone No")
    @Pattern(regexp = "^[6-9]{1}[0-9]{9}$",message = "Please Enter An Valid Phone No")
    String phone;

    public Customer(int id, String name, String accNo, String phone) {
        this.id = id;
        this.name = name;
        this.accNo = accNo;
        this.phone = phone;
    }

    public Customer() {
    }

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

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
