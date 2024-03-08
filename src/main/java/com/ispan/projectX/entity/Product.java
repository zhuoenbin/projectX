//package com.ispan.projectX.entity;
//
//import jakarta.persistence.*;
//import org.springframework.format.annotation.DateTimeFormat;
//
//import java.util.Date;
//
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
//
//    public Product() {
//    }
//
//    public Product(Integer productId, String productName, Integer sellerId, Integer employeeId, Integer unitPrice, Integer categoryId, Integer stock, Integer reservedQuantity, Date listingDate, Date modifiedDate, String description, String productStatus, Integer promotionId, Integer officialDiscountId, Integer sellerDiscountId, OfficialActivityDiscount officialActivityDiscount, SellerActivityDiscount sellerActivityDiscount, Seller seller) {
//        this.productId = productId;
//        this.productName = productName;
//        this.sellerId = sellerId;
//        this.employeeId = employeeId;
//        this.unitPrice = unitPrice;
//        this.categoryId = categoryId;
//        this.stock = stock;
//        this.reservedQuantity = reservedQuantity;
//        this.listingDate = listingDate;
//        this.modifiedDate = modifiedDate;
//        this.description = description;
//        this.productStatus = productStatus;
//        this.promotionId = promotionId;
//        this.officialDiscountId = officialDiscountId;
//        this.sellerDiscountId = sellerDiscountId;
//        this.officialActivityDiscount = officialActivityDiscount;
//        this.sellerActivityDiscount = sellerActivityDiscount;
//        this.seller = seller;
//    }
//
//    public Integer getProductId() {
//        return productId;
//    }
//
//    public void setProductId(Integer productId) {
//        this.productId = productId;
//    }
//
//    public String getProductName() {
//        return productName;
//    }
//
//    public void setProductName(String productName) {
//        this.productName = productName;
//    }
//
//    public Integer getSellerId() {
//        return sellerId;
//    }
//
//    public void setSellerId(Integer sellerId) {
//        this.sellerId = sellerId;
//    }
//
//    public Integer getEmployeeId() {
//        return employeeId;
//    }
//
//    public void setEmployeeId(Integer employeeId) {
//        this.employeeId = employeeId;
//    }
//
//    public Integer getUnitPrice() {
//        return unitPrice;
//    }
//
//    public void setUnitPrice(Integer unitPrice) {
//        this.unitPrice = unitPrice;
//    }
//
//    public Integer getCategoryId() {
//        return categoryId;
//    }
//
//    public void setCategoryId(Integer categoryId) {
//        this.categoryId = categoryId;
//    }
//
//    public Integer getStock() {
//        return stock;
//    }
//
//    public void setStock(Integer stock) {
//        this.stock = stock;
//    }
//
//    public Integer getReservedQuantity() {
//        return reservedQuantity;
//    }
//
//    public void setReservedQuantity(Integer reservedQuantity) {
//        this.reservedQuantity = reservedQuantity;
//    }
//
//    public Date getListingDate() {
//        return listingDate;
//    }
//
//    public void setListingDate(Date listingDate) {
//        this.listingDate = listingDate;
//    }
//
//    public Date getModifiedDate() {
//        return modifiedDate;
//    }
//
//    public void setModifiedDate(Date modifiedDate) {
//        this.modifiedDate = modifiedDate;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public String getProductStatus() {
//        return productStatus;
//    }
//
//    public void setProductStatus(String productStatus) {
//        this.productStatus = productStatus;
//    }
//
//    public Integer getPromotionId() {
//        return promotionId;
//    }
//
//    public void setPromotionId(Integer promotionId) {
//        this.promotionId = promotionId;
//    }
//
//    public Integer getOfficialDiscountId() {
//        return officialDiscountId;
//    }
//
//    public void setOfficialDiscountId(Integer officialDiscountId) {
//        this.officialDiscountId = officialDiscountId;
//    }
//
//    public Integer getSellerDiscountId() {
//        return sellerDiscountId;
//    }
//
//    public void setSellerDiscountId(Integer sellerDiscountId) {
//        this.sellerDiscountId = sellerDiscountId;
//    }
//
//    public OfficialActivityDiscount getOfficialActivityDiscount() {
//        return officialActivityDiscount;
//    }
//
//    public void setOfficialActivityDiscount(OfficialActivityDiscount officialActivityDiscount) {
//        this.officialActivityDiscount = officialActivityDiscount;
//    }
//
//    public SellerActivityDiscount getSellerActivityDiscount() {
//        return sellerActivityDiscount;
//    }
//
//    public void setSellerActivityDiscount(SellerActivityDiscount sellerActivityDiscount) {
//        this.sellerActivityDiscount = sellerActivityDiscount;
//    }
//
//    public Seller getSeller() {
//        return seller;
//    }
//
//    public void setSeller(Seller seller) {
//        this.seller = seller;
//    }
//
//    @Override
//    public String toString() {
//        final StringBuffer sb = new StringBuffer("Product{");
//        sb.append("productId=").append(productId);
//        sb.append(", productName='").append(productName).append('\'');
//        sb.append(", sellerId=").append(sellerId);
//        sb.append(", employeeId=").append(employeeId);
//        sb.append(", unitPrice=").append(unitPrice);
//        sb.append(", categoryId=").append(categoryId);
//        sb.append(", stock=").append(stock);
//        sb.append(", reservedQuantity=").append(reservedQuantity);
//        sb.append(", listingDate=").append(listingDate);
//        sb.append(", modifiedDate=").append(modifiedDate);
//        sb.append(", description='").append(description).append('\'');
//        sb.append(", productStatus='").append(productStatus).append('\'');
//        sb.append(", promotionId=").append(promotionId);
//        sb.append(", officialDiscountId=").append(officialDiscountId);
//        sb.append(", sellerDiscountId=").append(sellerDiscountId);
//        sb.append(", officialActivityDiscount=").append(officialActivi
//
//        sb.append('}');
//        return sb.toString();
//    }INSERT INTO `user` (
//    `last_name`,
//    `first_name`,
//    `user_email`,
//    `user_password`,
//    `user_gender`,
//    `birth_date`,
//    `buyer_violation_count`,
//    `last_login_time`,
//    `seller_qualified`,
//    `user_status`,
//    `bank_id_account1`,
//    `bank_account1`
//) VALUES
//('Doe', 'John', 'john.doe@example.com', 'password123', 'Male', '1990-01-01', 0, '2024-03-05 12:00:00', 0, 'Active', '001', '1234567890'),
//('Doe', 'Jane', 'jane.doe@example.com', 'password456', 'Female', '1992-02-02', 1, '2024-03-06 13:00:00', 1, 'Inactive', '004', '9876543210'),
//('Smith', 'Bob', 'bob.smith@example.com', 'password789', 'Male', '1985-03-03', 0, '2024-03-07 14:00:00', 2, 'Active', '007', '1111222233'),
//('Johnson', 'Alice', 'alice.johnson@example.com', 'passwordabc', 'Female', '1988-04-04', 2, '2024-03-08 15:00:00', 1, 'Inactive', '010', '9999888877'),
//('Brown', 'Charlie', 'charlie.brown@example.com', 'passwordxyz', 'Male', '1995-05-05', 0, '2024-03-09 16:00:00', 2, 'Active', '013', '3333444455');
//
//
//INSERT INTO `seller` (
//    `seller_id`,
//    `seller_name`,
//    `seller_image`,
//    `seller_image_public_id`,
//    `seller_introduce`,
//    `join_time`,
//    `last_login_time`,
//    `seller_violation_count`,
//    `bank_id_account1`,
//    `bank_account1`,
//    `bank_id_account2`,
//    `bank_account2`,
//    `bank_id_account3`,
//    `bank_account3`
//) VALUES
//(1, 2, 'image_url_1.jpg', 'public_id_123_1', 'Introduction 1', '2024-03-05 12:00:00', '2024-03-05 12:30:00', 0, '001', '1234567890', '002', '9876543210', '003', '5555555555'),
//(2, 5, 'image_url_2.jpg', 'public_id_123_2', 'Introduction 2', '2024-03-06 13:00:00', '2024-03-06 13:30:00', 1, '004', '9876543210', '005', '1234567890', '006', '5555555555'),
//(3, 7, 'image_url_3.jpg', 'public_id_123_3', 'Introduction 3', '2024-03-07 14:00:00', '2024-03-07 14:30:00', 0, '007', '1111222233', '008', '4444555566', '009', '7777888899'),
//(4, 10, 'image_url_4.jpg', 'public_id_123_4', 'Introduction 4', '2024-03-08 15:00:00', '2024-03-08 15:30:00', 2, '010', '9999888877', '011', '1111222233', '012', '4444555566');
//}
