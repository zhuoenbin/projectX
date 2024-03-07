package com.ispan.projectX.entity;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

//@Entity
//@Table(name="product")
//public class Product {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name="product_id")
//    private Integer productId;
//
//    @Column(name="product_name", nullable = false)
//    private String productName;
//
//    @Column(name="seller_id")
//    private Integer sellerId;
//
//    @Column(name="employee_id")
//    private Integer employeeId;
//
//    @Column(name="unit_price")
//    private Integer unitPrice;
//
//    @Column(name="category_id")
//    private Integer categoryId;
//
//    @Column(name="stock")
//    private Integer stock;
//
//    @Column(name="reserved_quantity")
//    private Integer reservedQuantity;
//
//    @Temporal(TemporalType.TIMESTAMP)
//    @DateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss")
//    @Column(name="listing_date")
//    private Date listingDate;
//
//    @Temporal(TemporalType.TIMESTAMP)
//    @DateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss")
//    @Column(name="modified_date")
//    private Date modifiedDate;
//
//    @Column(name="description", columnDefinition = "TEXT")
//    private String description;
//
//    @Column(name="product_status", length = 20)
//    private String productStatus;
//
//    @Column(name="promotion_id")
//    private Integer promotionId;
//
//    @Column(name="official_discount_id")
//    private Integer officialDiscountId;
//
//    @Column(name="seller_discount_id")
//    private Integer sellerDiscountId;
//
//    @ManyToOne
//    @JoinColumn(name = "official_discount_id", referencedColumnName = "discount_id", insertable = false, updatable = false)
//    private OfficialActivityDiscount officialActivityDiscount;
//
//    @ManyToOne
//    @JoinColumn(name = "seller_discount_id", referencedColumnName = "discount_id", insertable = false, updatable = false)
//    private SellerActivityDiscount sellerActivityDiscount;
//
//    @ManyToOne
//    @JoinColumn(name = "seller_id", referencedColumnName = "seller_id", insertable = false, updatable = false)
//    private Seller seller;
