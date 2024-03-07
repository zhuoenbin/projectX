package com.ispan.projectX.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "seller_discount_list")
public class SellerDiscountList {

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
    private LocalDateTime listBuildTime;

    @Column(name = "list_update_time")
    private LocalDateTime listUpdateTime;

    @Column(name = "list_status")
    private Integer listStatus;

    public SellerDiscountList() {
    }

    public SellerDiscountList(Seller listOwner, String listName, LocalDateTime listBuildTime, LocalDateTime listUpdateTime, Integer listStatus) {
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

    public LocalDateTime getListBuildTime() {
        return listBuildTime;
    }

    public void setListBuildTime(LocalDateTime listBuildTime) {
        this.listBuildTime = listBuildTime;
    }

    public LocalDateTime getListUpdateTime() {
        return listUpdateTime;
    }

    public void setListUpdateTime(LocalDateTime listUpdateTime) {
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
        final StringBuffer sb = new StringBuffer("SellerDiscountList{");
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
