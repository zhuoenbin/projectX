package com.ispan.projectX.entity;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "buyer_interactive_group")
public class BuyerInteractiveGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    private Users owner;

    @Column(name = "group_type")
    private Integer groupType;

    @ManyToOne
    @JoinColumn(name = "seller_id")
    private Seller seller;

    @Column(name = "interactive_joined_time")
    private LocalDateTime interactiveJoinedTime;

    public BuyerInteractiveGroup() {
    }

    public BuyerInteractiveGroup(Long id, Users owner, Integer groupType, Seller seller, LocalDateTime interactiveJoinedTime) {
        this.id = id;
        this.owner = owner;
        this.groupType = groupType;
        this.seller = seller;
        this.interactiveJoinedTime = interactiveJoinedTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Users getOwner() {
        return owner;
    }

    public void setOwner(Users owner) {
        this.owner = owner;
    }

    public Integer getGroupType() {
        return groupType;
    }

    public void setGroupType(Integer groupType) {
        this.groupType = groupType;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public LocalDateTime getInteractiveJoinedTime() {
        return interactiveJoinedTime;
    }

    public void setInteractiveJoinedTime(LocalDateTime interactiveJoinedTime) {
        this.interactiveJoinedTime = interactiveJoinedTime;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("BuyerInteractiveGroup{");
        sb.append("id=").append(id);
        sb.append(", owner=").append(owner);
        sb.append(", groupType=").append(groupType);
        sb.append(", seller=").append(seller);
        sb.append(", interactiveJoinedTime=").append(interactiveJoinedTime);
        sb.append('}');
        return sb.toString();
    }

}
