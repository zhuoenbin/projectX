package com.ispan.projectX.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "seller_coupon_holder_list")
public class SellerCouponHolderList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "list_id")
    private Long listId;

    @ManyToOne
    @JoinColumn(name = "seller_id", referencedColumnName = "seller_id")
    private Seller seller;

    @ManyToOne
    @JoinColumn(name = "seller_coupon_id", referencedColumnName = "coupon_id")
    private SellerActivityCoupon sellerActivityCoupon;

    @Column(name = "seller_coupon_holder_id")
    private Integer sellerCouponHolderId;

    @Column(name = "seller_coupon_used_status", columnDefinition = "INT DEFAULT 2")
    private Integer sellerCouponUsedStatus;

    public SellerCouponHolderList() {
    }

    public SellerCouponHolderList(Long listId, Seller seller, SellerActivityCoupon sellerActivityCoupon, Integer sellerCouponHolderId, Integer sellerCouponUsedStatus) {
        this.listId = listId;
        this.seller = seller;
        this.sellerActivityCoupon = sellerActivityCoupon;
        this.sellerCouponHolderId = sellerCouponHolderId;
        this.sellerCouponUsedStatus = sellerCouponUsedStatus;
    }

    public Long getListId() {
        return listId;
    }

    public void setListId(Long listId) {
        this.listId = listId;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public SellerActivityCoupon getSellerActivityCoupon() {
        return sellerActivityCoupon;
    }

    public void setSellerActivityCoupon(SellerActivityCoupon sellerActivityCoupon) {
        this.sellerActivityCoupon = sellerActivityCoupon;
    }

    public Integer getSellerCouponHolderId() {
        return sellerCouponHolderId;
    }

    public void setSellerCouponHolderId(Integer sellerCouponHolderId) {
        this.sellerCouponHolderId = sellerCouponHolderId;
    }

    public Integer getSellerCouponUsedStatus() {
        return sellerCouponUsedStatus;
    }

    public void setSellerCouponUsedStatus(Integer sellerCouponUsedStatus) {
        this.sellerCouponUsedStatus = sellerCouponUsedStatus;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SellerCouponHolderList{");
        sb.append("listId=").append(listId);
        sb.append(", seller=").append(seller);
        sb.append(", sellerActivityCoupon=").append(sellerActivityCoupon);
        sb.append(", sellerCouponHolderId=").append(sellerCouponHolderId);
        sb.append(", sellerCouponUsedStatus=").append(sellerCouponUsedStatus);
        sb.append('}');
        return sb.toString();
    }

}
