//package com.ispan.projectX.entity;
//
//import jakarta.persistence.*;
//import java.time.LocalDateTime;
//
//@Entity
//@Table(name = "seller_discount_list_product")
//public class SellerDiscountListProduct {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;
//
//    @ManyToOne
//    @JoinColumn(name = "list_id", referencedColumnName = "list_id")
//    private SellerDiscountList sellerDiscountList;
//
//    @ManyToOne
//    @JoinColumn(name = "product_id", referencedColumnName = "product_id")
//    private Product product;
//
//    @Column(name = "product_join_time")
//    private LocalDateTime productJoinTime;
//
//    public SellerDiscountListProduct() {
//    }
//
//    public SellerDiscountListProduct(SellerDiscountList sellerDiscountList, Product product, LocalDateTime productJoinTime) {
//        this.sellerDiscountList = sellerDiscountList;
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
//    public SellerDiscountList getSellerDiscountList() {
//        return sellerDiscountList;
//    }
//
//    public void setSellerDiscountList(SellerDiscountList sellerDiscountList) {
//        this.sellerDiscountList = sellerDiscountList;
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
//    public LocalDateTime getProductJoinTime() {
//        return productJoinTime;
//    }
//
//    public void setProductJoinTime(LocalDateTime productJoinTime) {
//        this.productJoinTime = productJoinTime;
//    }
//
//    @Override
//    public String toString() {
//        final StringBuffer sb = new StringBuffer("SellerDiscountListProduct{");
//        sb.append("id=").append(id);
//        sb.append(", sellerDiscountList=").append(sellerDiscountList);
//        sb.append(", product=").append(product);
//        sb.append(", productJoinTime=").append(productJoinTime);
//        sb.append('}');
//        return sb.toString();
//    }
//}