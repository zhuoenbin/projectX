package com.ispan.projectX.entity.pushmsg;

import com.ispan.projectX.entity.Seller;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "push_receiver_group")
public class PushReceiverGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "group_id")
    private Integer groupId;

    @Column(name = "group_name")
    private String groupName;


    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "group_owner")
    private Seller seller;


    @Column(name = "group_build_time")
    private Date groupBuildTime;

    @Column(name = "group_update_time")
    private Date groupUpdateTime;

    public PushReceiverGroup() {
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Date getGroupBuildTime() {
        return groupBuildTime;
    }

    public void setGroupBuildTime(Date groupBuildTime) {
        this.groupBuildTime = groupBuildTime;
    }

    public Date getGroupUpdateTime() {
        return groupUpdateTime;
    }

    public void setGroupUpdateTime(Date groupUpdateTime) {
        this.groupUpdateTime = groupUpdateTime;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PushReceiverGroup{");
        sb.append("groupId=").append(groupId);
        sb.append(", groupName='").append(groupName).append('\'');
        sb.append(", seller=").append(seller);
        sb.append(", groupBuildTime=").append(groupBuildTime);
        sb.append(", groupUpdateTime=").append(groupUpdateTime);
        sb.append('}');
        return sb.toString();
    }
}