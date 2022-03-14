package com.spring.studnrt.studentsystem.Model;

import com.spring.studnrt.studentsystem.Model.enums.Gender;
import jdk.jfr.Timestamp;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;


@Entity(name = "stu dent")
public class Student {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String Name;

    @Column(name = "Gender")
    private Gender gender;

    @Column(name = "age")
    private String Age ;

    @Column(name = "phone")
    private String Phone ;

    @Column(name = "address")
    private String Address;

    @CreationTimestamp
    @Column(name = "created")
    private Date CreatedDate;

    @UpdateTimestamp
    @Column(name = "updated")
    private Date  updatedDate;



}
