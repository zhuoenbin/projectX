//package com.ispan.projectX.entity;
//
//import jakarta.persistence.*;
//import java.util.Date;
//
//@Entity
//@Table(name = "seller_coupon_list_product")
//public class SellerCouponListProduct {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;
//
//    @ManyToOne
//    @JoinColumn(name = "list_id", referencedColumnName = "list_id")
//    private SellerCouponList sellerCouponList;
//
//    @ManyToOne
//    @JoinColumn(name = "product_id", referencedColumnName = "product_id")
//    private Product product;
//
//    @Column(name = "product_join_time")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date productJoinTime;
//
//    public SellerCouponListProduct() {
//    }
//
//    public SellerCouponListProduct(Long id, SellerCouponList sellerCouponList, Product product, Date productJoinTime) {
//        this.id = id;
//        this.sellerCouponList = sellerCouponList;
//        this.product = product;
//        this.productJoinTime = productJoinTime;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public SellerCouponList getSellerCouponList() {
//        return sellerCouponList;
//    }
//
//    public void setSellerCouponList(SellerCouponList sellerCouponList) {
//        this.sellerCouponList = sellerCouponList;
//    }
//
//    public Product getProduct() {
//        return product;
//    }
//
//    public void setProduct(Product product) {
//        this.product = product;
//    }
//
//    public Date getProductJoinTime() {
//        return productJoinTime;
//    }
//
//    public void setProductJoinTime(Date productJoinTime) {
//        this.productJoinTime = productJoinTime;
//    }
//
//    @Override
//    public String toString() {
//        final StringBuffer sb = new StringBuffer("SellerCouponListProduct{");
//        sb.append("id=").append(id);
//        sb.append(", sellerCouponList=").append(sellerCouponList);
//        sb.append(", product=").append(product);
//        sb.append(", productJoinTime=").append(productJoinTime);
//        sb.append('}');
//        return sb.toString();
//    }
//}
//
