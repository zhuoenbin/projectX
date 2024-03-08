package com.ispan.projectX.entity.coupon;

import com.ispan.projectX.entity.Seller;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "seller_coupon_list")
public class SellerCouponList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "list_id")
    private Long listId;

    @ManyToOne
    @JoinColumn(name = "list_owner", referencedColumnName = "seller_id")
    private Seller listOwner;

    @Column(name = "list_name")
    private String listName;

    @Column(name = "list_build_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date listBuildTime;

    @Column(name = "list_update_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date listUpdateTime;

    @Column(name = "list_status")
    private Integer listStatus;

    public SellerCouponList() {
    }

    public SellerCouponList(Long listId, Seller listOwner, String listName, Date listBuildTime, Date listUpdateTime, Integer listStatus) {
        this.listId = listId;
        this.listOwner = listOwner;
        this.listName = listName;
        this.listBuildTime = listBuildTime;
        this.listUpdateTime = listUpdateTime;
        this.listStatus = listStatus;
    }

    public Long getListId() {
        return listId;
    }

    public void setListId(Long listId) {
        this.listId = listId;
    }

    public Seller getListOwner() {
        return listOwner;
    }

    public void setListOwner(Seller listOwner) {
        this.listOwner = listOwner;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public Date getListBuildTime() {
        return listBuildTime;
    }

    public void setListBuildTime(Date listBuildTime) {
        this.listBuildTime = listBuildTime;
    }

    public Date getListUpdateTime() {
        return listUpdateTime;
    }

    public void setListUpdateTime(Date listUpdateTime) {
        this.listUpdateTime = listUpdateTime;
    }

    public Integer getListStatus() {
        return listStatus;
    }

    public void setListStatus(Integer listStatus) {
        this.listStatus = listStatus;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SellerCouponList{");
        sb.append("listId=").append(listId);
        sb.append(", listOwner=").append(listOwner);
        sb.append(", listName='").append(listName).append('\'');
        sb.append(", listBuildTime=").append(listBuildTime);
        sb.append(", listUpdateTime=").append(listUpdateTime);
        sb.append(", listStatus=").append(listStatus);
        sb.append('}');
        return sb.toString();
    }

}
