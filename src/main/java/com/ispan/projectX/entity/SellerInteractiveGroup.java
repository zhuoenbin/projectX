package com.ispan.projectX.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "seller_interactive_group")
public class SellerInteractiveGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    private Seller owner;

    @Column(name = "group_type")
    private Integer groupType;

    @ManyToOne
    @JoinColumn(name = "buyer_id")
    private Users buyer;

    @Column(name = "interactive_joined_time")
    private LocalDateTime interactiveJoinedTime;

    public SellerInteractiveGroup() {
    }

    public SellerInteractiveGroup(Long id, Seller owner, Integer groupType, Users buyer, LocalDateTime interactiveJoinedTime) {
        this.id = id;
        this.owner = owner;
        this.groupType = groupType;
        this.buyer = buyer;
        this.interactiveJoinedTime = interactiveJoinedTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Seller getOwner() {
        return owner;
    }

    public void setOwner(Seller owner) {
        this.owner = owner;
    }

    public Integer getGroupType() {
        return groupType;
    }

    public void setGroupType(Integer groupType) {
        this.groupType = groupType;
    }

    public Users getBuyer() {
        return buyer;
    }

    public void setBuyer(Users buyer) {
        this.buyer = buyer;
    }

    public LocalDateTime getInteractiveJoinedTime() {
        return interactiveJoinedTime;
    }

    public void setInteractiveJoinedTime(LocalDateTime interactiveJoinedTime) {
        this.interactiveJoinedTime = interactiveJoinedTime;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SellerInteractiveGroup{");
        sb.append("id=").append(id);
        sb.append(", owner=").append(owner);
        sb.append(", groupType=").append(groupType);
        sb.append(", buyer=").append(buyer);
        sb.append(", interactiveJoinedTime=").append(interactiveJoinedTime);
        sb.append('}');
        return sb.toString();
    }

}
