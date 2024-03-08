package com.ispan.projectX.entity.discount;

import com.ispan.projectX.entity.Seller;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "seller_activity_discount")
public class SellerActivityDiscount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "discount_id")
    private Long discountId;

    @ManyToOne
    @JoinColumn(name = "discount_product_list_id", referencedColumnName = "list_id")
    private SellerDiscountList discountProductList;

    @ManyToOne
    @JoinColumn(name = "seller_id", referencedColumnName = "seller_id")
    private Seller seller;

    @Column(name = "discount_build_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date discountBuildTime;

    @Column(name = "discount_type")
    private Integer discountType;

    @Column(name = "discount_rule")
    private Integer discountRule;

    @Column(name = "discount_start")
    @Temporal(TemporalType.TIMESTAMP)
    private Date discountStart;

    @Column(name = "discount_end")
    @Temporal(TemporalType.TIMESTAMP)
    private Date discountEnd;

    @Column(name = "push_notification_time")
    private Integer pushNotificationTime;

    @Column(name = "discount_title")
    private String discountTitle;

    @Column(name = "discount_describe")
    private String discountDescribe;

    @Column(name = "discount_img")
    private String discountImg;

    @Column(name = "discount_img_public_id")
    private String discountImgPublicId;

    @Column(name = "discount_status")
    private Integer discountStatus;

    @Column(name = "discount_apply_time")
    private Integer discountApplyTime;

    @Column(name = "discount_status_update_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date discountStatusUpdateTime;

    public SellerActivityDiscount() {
    }

    public SellerActivityDiscount(Long discountId, SellerDiscountList discountProductList, Seller seller, Date discountBuildTime, Integer discountType, Integer discountRule, Date discountStart, Date discountEnd, Integer pushNotificationTime, String discountTitle, String discountDescribe, String discountImg, String discountImgPublicId, Integer discountStatus, Integer discountApplyTime, Date discountStatusUpdateTime) {
        this.discountId = discountId;
        this.discountProductList = discountProductList;
        this.seller = seller;
        this.discountBuildTime = discountBuildTime;
        this.discountType = discountType;
        this.discountRule = discountRule;
        this.discountStart = discountStart;
        this.discountEnd = discountEnd;
        this.pushNotificationTime = pushNotificationTime;
        this.discountTitle = discountTitle;
        this.discountDescribe = discountDescribe;
        this.discountImg = discountImg;
        this.discountImgPublicId = discountImgPublicId;
        this.discountStatus = discountStatus;
        this.discountApplyTime = discountApplyTime;
        this.discountStatusUpdateTime = discountStatusUpdateTime;
    }

    public Long getDiscountId() {
        return discountId;
    }

    public void setDiscountId(Long discountId) {
        this.discountId = discountId;
    }

    public SellerDiscountList getDiscountProductList() {
        return discountProductList;
    }

    public void setDiscountProductList(SellerDiscountList discountProductList) {
        this.discountProductList = discountProductList;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Date getDiscountBuildTime() {
        return discountBuildTime;
    }

    public void setDiscountBuildTime(Date discountBuildTime) {
        this.discountBuildTime = discountBuildTime;
    }

    public Integer getDiscountType() {
        return discountType;
    }

    public void setDiscountType(Integer discountType) {
        this.discountType = discountType;
    }

    public Integer getDiscountRule() {
        return discountRule;
    }

    public void setDiscountRule(Integer discountRule) {
        this.discountRule = discountRule;
    }

    public Date getDiscountStart() {
        return discountStart;
    }

    public void setDiscountStart(Date discountStart) {
        this.discountStart = discountStart;
    }

    public Date getDiscountEnd() {
        return discountEnd;
    }

    public void setDiscountEnd(Date discountEnd) {
        this.discountEnd = discountEnd;
    }

    public Integer getPushNotificationTime() {
        return pushNotificationTime;
    }

    public void setPushNotificationTime(Integer pushNotificationTime) {
        this.pushNotificationTime = pushNotificationTime;
    }

    public String getDiscountTitle() {
        return discountTitle;
    }

    public void setDiscountTitle(String discountTitle) {
        this.discountTitle = discountTitle;
    }

    public String getDiscountDescribe() {
        return discountDescribe;
    }

    public void setDiscountDescribe(String discountDescribe) {
        this.discountDescribe = discountDescribe;
    }

    public String getDiscountImg() {
        return discountImg;
    }

    public void setDiscountImg(String discountImg) {
        this.discountImg = discountImg;
    }

    public String getDiscountImgPublicId() {
        return discountImgPublicId;
    }

    public void setDiscountImgPublicId(String discountImgPublicId) {
        this.discountImgPublicId = discountImgPublicId;
    }

    public Integer getDiscountStatus() {
        return discountStatus;
    }

    public void setDiscountStatus(Integer discountStatus) {
        this.discountStatus = discountStatus;
    }

    public Integer getDiscountApplyTime() {
        return discountApplyTime;
    }

    public void setDiscountApplyTime(Integer discountApplyTime) {
        this.discountApplyTime = discountApplyTime;
    }

    public Date getDiscountStatusUpdateTime() {
        return discountStatusUpdateTime;
    }

    public void setDiscountStatusUpdateTime(Date discountStatusUpdateTime) {
        this.discountStatusUpdateTime = discountStatusUpdateTime;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SellerActivityDiscount{");
        sb.append("discountId=").append(discountId);
        sb.append(", discountProductList=").append(discountProductList);
        sb.append(", seller=").append(seller);
        sb.append(", discountBuildTime=").append(discountBuildTime);
        sb.append(", discountType=").append(discountType);
        sb.append(", discountRule=").append(discountRule);
        sb.append(", discountStart=").append(discountStart);
        sb.append(", discountEnd=").append(discountEnd);
        sb.append(", pushNotificationTime=").append(pushNotificationTime);
        sb.append(", discountTitle='").append(discountTitle).append('\'');
        sb.append(", discountDescribe='").append(discountDescribe).append('\'');
        sb.append(", discountImg='").append(discountImg).append('\'');
        sb.append(", discountImgPublicId='").append(discountImgPublicId).append('\'');
        sb.append(", discountStatus=").append(discountStatus);
        sb.append(", discountApplyTime=").append(discountApplyTime);
        sb.append(", discountStatusUpdateTime=").append(discountStatusUpdateTime);
        sb.append('}');
        return sb.toString();
    }
}
