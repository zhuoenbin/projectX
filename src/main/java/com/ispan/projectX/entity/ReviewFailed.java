//package com.ispan.projectX.entity;
//
//import jakarta.persistence.*;
//
//@Entity
//@Table(name = "review_failed")
//public class ReviewFailed {
//
//    @Id
//    @Column(name = "product_id")
//    private Long productId;
//
//    @Column(name = "failed_reason")
//    private String failedReason;
//
//    @OneToOne
//    @JoinColumn(name = "product_id", referencedColumnName = "product_id", insertable = false, updatable = false)
//    private Product product;
//
//    public ReviewFailed() {
//    }
//
//    public ReviewFailed(Long productId, String failedReason, Product product) {
//        this.productId = productId;
//        this.failedReason = failedReason;
//        this.product = product;
//    }
//
//    public Long getProductId() {
//        return productId;
//    }
//
//    public void setProductId(Long productId) {
//        this.productId = productId;
//    }
//
//    public String getFailedReason() {
//        return failedReason;
//    }
//
//    public void setFailedReason(String failedReason) {
//        this.failedReason = failedReason;
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
//    @Override
//    public String toString() {
//        final StringBuffer sb = new StringBuffer("ReviewFailed{");
//        sb.append("productId=").append(productId);
//        sb.append(", failedReason='").append(failedReason).append('\'');
//        sb.append(", product=").append(product);
//        sb.append('}');
//        return sb.toString();
//    }
//}
