package com.ispan.projectX.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "seller_activity_coupon")
public class SellerActivityCoupon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "coupon_id")
    private Long couponId;

    @ManyToOne
    @JoinColumn(name = "coupon_product_list_id", referencedColumnName = "list_id")
    private SellerCouponList sellerCouponList;

    @ManyToOne
    @JoinColumn(name = "seller_id", referencedColumnName = "seller_id")
    private Seller seller;

    @Column(name = "coupon_build_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date couponBuildTime;

    @Column(name = "cuopon_required_money")
    private Integer couponRequiredMoney;

    @Column(name = "coupon_type")
    private Integer couponType;

    @Column(name = "coupon_rule")
    private Integer couponRule;

    @Column(name = "coupon_start")
    @Temporal(TemporalType.TIMESTAMP)
    private Date couponStart;

    @Column(name = "coupon_end")
    @Temporal(TemporalType.TIMESTAMP)
    private Date couponEnd;

    @Column(name = "push_notification_time")
    private Integer pushNotificationTime;

    @Column(name = "coupon_title")
    private String couponTitle;

    @Column(name = "coupon_code")
    private String couponCode;

    @Column(name = "coupon_describe")
    private String couponDescribe;

    @Column(name = "coupon_img")
    private String couponImg;

    @Column(name = "coupon_img_public_id")
    private String couponImgPublicId;

    @Column(name = "coupon_status")
    private Integer couponStatus;

    @Column(name = "coupon_apply_time")
    private Integer couponApplyTime;

    @Column(name = "coupon_status_update_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date couponStatusUpdateTime;

    @Column(name = "coupon_usage_limit_count")
    private Integer couponUsageLimitCount;

    @Column(name = "coupon_get_count")
    private Integer couponGetCount;

    public SellerActivityCoupon() {
    }

    public SellerActivityCoupon(Long couponId, SellerCouponList sellerCouponList, Seller seller, Date couponBuildTime, Integer couponRequiredMoney, Integer couponType, Integer couponRule, Date couponStart, Date couponEnd, Integer pushNotificationTime, String couponTitle, String couponCode, String couponDescribe, String couponImg, String couponImgPublicId, Integer couponStatus, Integer couponApplyTime, Date couponStatusUpdateTime, Integer couponUsageLimitCount, Integer couponGetCount) {
        this.couponId = couponId;
        this.sellerCouponList = sellerCouponList;
        this.seller = seller;
        this.couponBuildTime = couponBuildTime;
        this.couponRequiredMoney = couponRequiredMoney;
        this.couponType = couponType;
        this.couponRule = couponRule;
        this.couponStart = couponStart;
        this.couponEnd = couponEnd;
        this.pushNotificationTime = pushNotificationTime;
        this.couponTitle = couponTitle;
        this.couponCode = couponCode;
        this.couponDescribe = couponDescribe;
        this.couponImg = couponImg;
        this.couponImgPublicId = couponImgPublicId;
        this.couponStatus = couponStatus;
        this.couponApplyTime = couponApplyTime;
        this.couponStatusUpdateTime = couponStatusUpdateTime;
        this.couponUsageLimitCount = couponUsageLimitCount;
        this.couponGetCount = couponGetCount;
    }

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public SellerCouponList getSellerCouponList() {
        return sellerCouponList;
    }

    public void setSellerCouponList(SellerCouponList sellerCouponList) {
        this.sellerCouponList = sellerCouponList;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Date getCouponBuildTime() {
        return couponBuildTime;
    }

    public void setCouponBuildTime(Date couponBuildTime) {
        this.couponBuildTime = couponBuildTime;
    }

    public Integer getCouponRequiredMoney() {
        return couponRequiredMoney;
    }

    public void setCouponRequiredMoney(Integer couponRequiredMoney) {
        this.couponRequiredMoney = couponRequiredMoney;
    }

    public Integer getCouponType() {
        return couponType;
    }

    public void setCouponType(Integer couponType) {
        this.couponType = couponType;
    }

    public Integer getCouponRule() {
        return couponRule;
    }

    public void setCouponRule(Integer couponRule) {
        this.couponRule = couponRule;
    }

    public Date getCouponStart() {
        return couponStart;
    }

    public void setCouponStart(Date couponStart) {
        this.couponStart = couponStart;
    }

    public Date getCouponEnd() {
        return couponEnd;
    }

    public void setCouponEnd(Date couponEnd) {
        this.couponEnd = couponEnd;
    }

    public Integer getPushNotificationTime() {
        return pushNotificationTime;
    }

    public void setPushNotificationTime(Integer pushNotificationTime) {
        this.pushNotificationTime = pushNotificationTime;
    }

    public String getCouponTitle() {
        return couponTitle;
    }

    public void setCouponTitle(String couponTitle) {
        this.couponTitle = couponTitle;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public String getCouponDescribe() {
        return couponDescribe;
    }

    public void setCouponDescribe(String couponDescribe) {
        this.couponDescribe = couponDescribe;
    }

    public String getCouponImg() {
        return couponImg;
    }

    public void setCouponImg(String couponImg) {
        this.couponImg = couponImg;
    }

    public String getCouponImgPublicId() {
        return couponImgPublicId;
    }

    public void setCouponImgPublicId(String couponImgPublicId) {
        this.couponImgPublicId = couponImgPublicId;
    }

    public Integer getCouponStatus() {
        return couponStatus;
    }

    public void setCouponStatus(Integer couponStatus) {
        this.couponStatus = couponStatus;
    }

    public Integer getCouponApplyTime() {
        return couponApplyTime;
    }

    public void setCouponApplyTime(Integer couponApplyTime) {
        this.couponApplyTime = couponApplyTime;
    }

    public Date getCouponStatusUpdateTime() {
        return couponStatusUpdateTime;
    }

    public void setCouponStatusUpdateTime(Date couponStatusUpdateTime) {
        this.couponStatusUpdateTime = couponStatusUpdateTime;
    }

    public Integer getCouponUsageLimitCount() {
        return couponUsageLimitCount;
    }

    public void setCouponUsageLimitCount(Integer couponUsageLimitCount) {
        this.couponUsageLimitCount = couponUsageLimitCount;
    }

    public Integer getCouponGetCount() {
        return couponGetCount;
    }

    public void setCouponGetCount(Integer couponGetCount) {
        this.couponGetCount = couponGetCount;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SellerActivityCoupon{");
        sb.append("couponId=").append(couponId);
        sb.append(", sellerCouponList=").append(sellerCouponList);
        sb.append(", seller=").append(seller);
        sb.append(", couponBuildTime=").append(couponBuildTime);
        sb.append(", couponRequiredMoney=").append(couponRequiredMoney);
        sb.append(", couponType=").append(couponType);
        sb.append(", couponRule=").append(couponRule);
        sb.append(", couponStart=").append(couponStart);
        sb.append(", couponEnd=").append(couponEnd);
        sb.append(", pushNotificationTime=").append(pushNotificationTime);
        sb.append(", couponTitle='").append(couponTitle).append('\'');
        sb.append(", couponCode='").append(couponCode).append('\'');
        sb.append(", couponDescribe='").append(couponDescribe).append('\'');
        sb.append(", couponImg='").append(couponImg).append('\'');
        sb.append(", couponImgPublicId='").append(couponImgPublicId).append('\'');
        sb.append(", couponStatus=").append(couponStatus);
        sb.append(", couponApplyTime=").append(couponApplyTime);
        sb.append(", couponStatusUpdateTime=").append(couponStatusUpdateTime);
        sb.append(", couponUsageLimitCount=").append(couponUsageLimitCount);
        sb.append(", couponGetCount=").append(couponGetCount);
        sb.append('}');
        return sb.toString();
    }

}