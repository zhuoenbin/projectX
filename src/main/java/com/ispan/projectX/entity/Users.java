package com.ispan.projectX.entity;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "user")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "user_email")
    private String userEmail;

    @Column(name = "user_password")
    private String userPassword;

    @Column(name = "user_gender")
    private String userGender;

    @Column(name = "birth_date")
    private Date birthDate;

    @Column(name = "buyer_violation_count")
    private String buyerViolationCount;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss EE")
    @Column(name = "last_login_time")
    private Date lastLoginTime;

    @Column(name = "seller_qualified")
    private Integer sellerQualified;

    @Column(name = "user_status")
    private String userStatus;

    @Column(name = "bank_id_account1")
    private String bankIdAccount1;

    @Column(name = "bank_account1")
    private String bankAccount1;

    
}
