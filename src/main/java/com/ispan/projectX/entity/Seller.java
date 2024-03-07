package com.ispan.projectX.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "seller")
public class Seller {

    @Id
    @Column(name = "seller_id")
    private Integer sellerId;

    @Column(name = "seller_name")
    private Integer sellerName;

    @Column(name = "seller_image")
    private String sellerImage;

    @Column(name = "seller_image_public_id")
    private String sellerImagePublicId;

    @Column(name = "seller_introduce")
    private String sellerIntroduce;

    @Column(name = "join_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date joinTime;

    @Column(name = "last_login_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastLoginTime;

    @Column(name = "seller_violation_count")
    private Integer sellerViolationCount;

    @Column(name = "bank_id_account1")
    private String bankIdAccount1;

    @Column(name = "bank_account1")
    private String bankAccount1;

    @Column(name = "bank_id_account2")
    private String bankIdAccount2;

    @Column(name = "bank_account2")
    private String bankAccount2;

    @Column(name = "bank_id_account3")
    private String bankIdAccount3;

    @Column(name = "bank_account3")
    private String bankAccount3;

    @OneToOne
    @JoinColumn(name = "seller_id", referencedColumnName = "user_id")
    private Users user;

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public Integer getSellerName() {
        return sellerName;
    }

    public void setSellerName(Integer sellerName) {
        this.sellerName = sellerName;
    }

    public String getSellerImage() {
        return sellerImage;
    }

    public void setSellerImage(String sellerImage) {
        this.sellerImage = sellerImage;
    }

    public String getSellerImagePublicId() {
        return sellerImagePublicId;
    }

    public void setSellerImagePublicId(String sellerImagePublicId) {
        this.sellerImagePublicId = sellerImagePublicId;
    }

    public String getSellerIntroduce() {
        return sellerIntroduce;
    }

    public void setSellerIntroduce(String sellerIntroduce) {
        this.sellerIntroduce = sellerIntroduce;
    }

    public Date getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(Date joinTime) {
        this.joinTime = joinTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Integer getSellerViolationCount() {
        return sellerViolationCount;
    }

    public void setSellerViolationCount(Integer sellerViolationCount) {
        this.sellerViolationCount = sellerViolationCount;
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

    public String getBankIdAccount2() {
        return bankIdAccount2;
    }

    public void setBankIdAccount2(String bankIdAccount2) {
        this.bankIdAccount2 = bankIdAccount2;
    }

    public String getBankAccount2() {
        return bankAccount2;
    }

    public void setBankAccount2(String bankAccount2) {
        this.bankAccount2 = bankAccount2;
    }

    public String getBankIdAccount3() {
        return bankIdAccount3;
    }

    public void setBankIdAccount3(String bankIdAccount3) {
        this.bankIdAccount3 = bankIdAccount3;
    }

    public String getBankAccount3() {
        return bankAccount3;
    }

    public void setBankAccount3(String bankAccount3) {
        this.bankAccount3 = bankAccount3;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
