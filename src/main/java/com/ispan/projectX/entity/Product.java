package com.ispan.projectX.entity;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name="product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="product_id")
    private Integer productId;

    @Column(name="product_name", nullable = false)
    private String productName;

    @Column(name="seller_id")
    private Integer sellerId;

    @Column(name="employee_id")
    private Integer employeeId;

    @Column(name="unit_price")
    private Integer unitPrice;

    @Column(name="category_id")
    private Integer categoryId;

    @Column(name="stock")
    private Integer stock;

    @Column(name="reserved_quantity")
    private Integer reservedQuantity;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    @Column(name="listing_date")
    private Date listingDate;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    @Column(name="modified_date")
    private Date modifiedDate;

    @Column(name="description", columnDefinition = "TEXT")
    private String description;

    @Column(name="product_status", length = 20)
    private String productStatus;

    @Column(name="promotion_id")
    private Integer promotionId;

    @Column(name="official_discount_id")
    private Integer officialDiscountId;

    @Column(name="seller_discount_id")
    private Integer sellerDiscountId;

    @ManyToOne
    @JoinColumn(name = "official_discount_id", referencedColumnName = "discount_id", insertable = false, updatable = false)
    private OfficialActivityDiscount officialActivityDiscount;

    @ManyToOne
    @JoinColumn(name = "seller_discount_id", referencedColumnName = "discount_id", insertable = false, updatable = false)
    private SellerActivityDiscount sellerActivityDiscount;

    @ManyToOne
    @JoinColumn(name = "seller_id", referencedColumnName = "seller_id", insertable = false, updatable = false)
    private Seller seller;

    // Getters and setters

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getReservedQuantity() {
        return reservedQuantity;
    }

    public void setReservedQuantity(Integer reservedQuantity) {
        this.reservedQuantity = reservedQuantity;
    }

    public Date getListingDate() {
        return listingDate;
    }

    public void setListingDate(Date listingDate) {
        this.listingDate = listingDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    public Integer getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(Integer promotionId) {
        this.promotionId = promotionId;
    }

    public Integer getOfficialDiscountId() {
        return officialDiscountId;
    }

    public void setOfficialDiscountId(Integer officialDiscountId) {
        this.officialDiscountId = officialDiscountId;
    }

    public Integer getSellerDiscountId() {
        return sellerDiscountId;
    }

    public void setSellerDiscountId(Integer sellerDiscountId) {
        this.sellerDiscountId = sellerDiscountId;
    }

    public OfficialActivityDiscount getOfficialActivityDiscount() {
        return officialActivityDiscount;
    }

    public void setOfficialActivityDiscount(OfficialActivityDiscount officialActivityDiscount) {
        this.officialActivityDiscount = officialActivityDiscount;
    }

    public SellerActivityDiscount getSellerActivityDiscount() {
        return sellerActivityDiscount;
    }

    public void setSellerActivityDiscount(SellerActivityDiscount sellerActivityDiscount) {
        this.sellerActivityDiscount = sellerActivityDiscount;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }
}
