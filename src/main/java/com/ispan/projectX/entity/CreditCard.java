package com.ispan.projectX.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="credit_card")
public class CreditCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "credit_id")
    private Integer creditId;

    @Column(name = "user_id",nullable = false)
    private Integer userId;

    @Column(name = "card_number")
    private String cardNumber;

    @Column(name = "card_CVC_code")
    private String cardCVCCode;

    @Column(name = "card_expiry_year")
    private Integer cardExpiryYear;

    @Column(name = "card_expiry_month")
    private Integer cardExpiryMonth;

    @Column(name = "card_holder_name")
    private String cardHolderName;

    @Column(name = "city")
    private String city;

    @Column(name = "district")
    private String district;

    @Column(name = "address")
    private String address;

    public Integer getCreditId() {
        return creditId;
    }

    public CreditCard(){}

    public CreditCard(Integer creditId, Integer userId, String cardNumber, String cardCVCCode, Integer cardExpiryYear, Integer cardExpiryMonth, String cardHolderName, String city, String district, String address) {
        this.creditId = creditId;
        this.userId = userId;
        this.cardNumber = cardNumber;
        this.cardCVCCode = cardCVCCode;
        this.cardExpiryYear = cardExpiryYear;
        this.cardExpiryMonth = cardExpiryMonth;
        this.cardHolderName = cardHolderName;
        this.city = city;
        this.district = district;
        this.address = address;
    }

    public void setCreditId(Integer creditId) {
        this.creditId = creditId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardCVCCode() {
        return cardCVCCode;
    }

    public void setCardCVCCode(String cardCVCCode) {
        this.cardCVCCode = cardCVCCode;
    }

    public Integer getCardExpiryYear() {
        return cardExpiryYear;
    }

    public void setCardExpiryYear(Integer cardExpiryYear) {
        this.cardExpiryYear = cardExpiryYear;
    }

    public Integer getCardExpiryMonth() {
        return cardExpiryMonth;
    }

    public void setCardExpiryMonth(Integer cardExpiryMonth) {
        this.cardExpiryMonth = cardExpiryMonth;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CreditCard{");
        sb.append("creditId=").append(creditId);
        sb.append(", userId=").append(userId);
        sb.append(", cardNumber='").append(cardNumber).append('\'');
        sb.append(", cardCVCCode='").append(cardCVCCode).append('\'');
        sb.append(", cardExpiryYear=").append(cardExpiryYear);
        sb.append(", cardExpiryMonth=").append(cardExpiryMonth);
        sb.append(", cardHolderName='").append(cardHolderName).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", district='").append(district).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append('}');
        return sb.toString();
    }
}