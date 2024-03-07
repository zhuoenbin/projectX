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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getBuyerViolationCount() {
        return buyerViolationCount;
    }

    public void setBuyerViolationCount(String buyerViolationCount) {
        this.buyerViolationCount = buyerViolationCount;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Integer getSellerQualified() {
        return sellerQualified;
    }

    public void setSellerQualified(Integer sellerQualified) {
        this.sellerQualified = sellerQualified;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public String getBankIdAccount1() {
        return bankIdAccount1;
    }

    public void setBankIdAccount1(String bankIdAccount1) {
        this.bankIdAccount1 = bankIdAccount1;
    }

    public String getBankAccount1() {
        return bankAccount1;
    }

    public void setBankAccount1(String bankAccount1) {
        this.bankAccount1 = bankAccount1;
    }
}
