package com.ispan.projectX.entity.push;

import com.ispan.projectX.entity.Seller;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "push_receiver_group")
public class PushReceiverGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "group_id")
    private Long groupId;

    @Column(name = "group_name", length = 30)
    private String groupName;

    @ManyToOne
    @JoinColumn(name = "group_owner", referencedColumnName = "seller_id")
    private Seller groupOwner;

    @Column(name = "group_build_time")
    private LocalDateTime groupBuildTime;

    @Column(name = "group_update_time")
    private LocalDateTime groupUpdateTime;

    public PushReceiverGroup() {
    }

    public PushReceiverGroup(Long groupId, String groupName, Seller groupOwner, LocalDateTime groupBuildTime, LocalDateTime groupUpdateTime) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.groupOwner = groupOwner;
        this.groupBuildTime = groupBuildTime;
        this.groupUpdateTime = groupUpdateTime;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Seller getGroupOwner() {
        return groupOwner;
    }

    public void setGroupOwner(Seller groupOwner) {
        this.groupOwner = groupOwner;
    }

    public LocalDateTime getGroupBuildTime() {
        return groupBuildTime;
    }

    public void setGroupBuildTime(LocalDateTime groupBuildTime) {
        this.groupBuildTime = groupBuildTime;
    }

    public LocalDateTime getGroupUpdateTime() {
        return groupUpdateTime;
    }

    public void setGroupUpdateTime(LocalDateTime groupUpdateTime) {
        this.groupUpdateTime = groupUpdateTime;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PushReceiverGroup{");
        sb.append("groupId=").append(groupId);
        sb.append(", groupName='").append(groupName).append('\'');
        sb.append(", groupOwner=").append(groupOwner);
        sb.append(", groupBuildTime=").append(groupBuildTime);
        sb.append(", groupUpdateTime=").append(groupUpdateTime);
        sb.append('}');
        return sb.toString();
    }
}

