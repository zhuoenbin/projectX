package com.ispan.projectX.entity.push;

import com.ispan.projectX.entity.Users;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "push_receiver_group_member")
public class PushReceiverGroupMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "group_id", referencedColumnName = "group_id")
    private PushReceiverGroup groupId;

    @ManyToOne
    @JoinColumn(name = "member_id", referencedColumnName = "user_id")
    private Users member;

    @Column(name = "member_joined_time")
    private LocalDateTime memberJoinedTime;

    public PushReceiverGroupMember() {
    }

    public PushReceiverGroupMember(Long id, PushReceiverGroup groupId, Users member, LocalDateTime memberJoinedTime) {
        this.id = id;
        this.groupId = groupId;
        this.member = member;
        this.memberJoinedTime = memberJoinedTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PushReceiverGroup getGroupId() {
        return groupId;
    }

    public void setGroupId(PushReceiverGroup groupId) {
        this.groupId = groupId;
    }

    public Users getMember() {
        return member;
    }

    public void setMember(Users member) {
        this.member = member;
    }

    public LocalDateTime getMemberJoinedTime() {
        return memberJoinedTime;
    }

    public void setMemberJoinedTime(LocalDateTime memberJoinedTime) {
        this.memberJoinedTime = memberJoinedTime;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PushReceiverGroupMember{");
        sb.append("id=").append(id);
        sb.append(", groupId=").append(groupId);
        sb.append(", member=").append(member);
        sb.append(", memberJoinedTime=").append(memberJoinedTime);
        sb.append('}');
        return sb.toString();
    }

}
