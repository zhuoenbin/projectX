package com.ispan.projectX.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "user_push_message")
public class UserPushMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "push_message_id")
    private Integer pushMessageId;

    @Column(name = "push_id")
    private Integer pushId;

    @Column(name = "push_title")
    private String pushTitle;

    @Column(name = "push_sender_unit")
    private Integer pushSenderUnit;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "user_id")
    private Users user;


    @Column(name = "message_read_time")
    private Date messageReadTime;

    @Column(name = "message_end_time")
    private Date messageEndTime;

    @Column(name = "message_received_time")
    private Date messageReceivedTime;

    public UserPushMessage() {
    }

    public Integer getPushMessageId() {
        return pushMessageId;
    }

    public void setPushMessageId(Integer pushMessageId) {
        this.pushMessageId = pushMessageId;
    }

    public Integer getPushId() {
        return pushId;
    }

    public void setPushId(Integer pushId) {
        this.pushId = pushId;
    }

    public String getPushTitle() {
        return pushTitle;
    }

    public void setPushTitle(String pushTitle) {
        this.pushTitle = pushTitle;
    }

    public Integer getPushSenderUnit() {
        return pushSenderUnit;
    }

    public void setPushSenderUnit(Integer pushSenderUnit) {
        this.pushSenderUnit = pushSenderUnit;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Date getMessageReadTime() {
        return messageReadTime;
    }

    public void setMessageReadTime(Date messageReadTime) {
        this.messageReadTime = messageReadTime;
    }

    public Date getMessageEndTime() {
        return messageEndTime;
    }

    public void setMessageEndTime(Date messageEndTime) {
        this.messageEndTime = messageEndTime;
    }

    public Date getMessageReceivedTime() {
        return messageReceivedTime;
    }

    public void setMessageReceivedTime(Date messageReceivedTime) {
        this.messageReceivedTime = messageReceivedTime;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("UserPushMessage{");
        sb.append("pushMessageId=").append(pushMessageId);
        sb.append(", pushId=").append(pushId);
        sb.append(", pushTitle='").append(pushTitle).append('\'');
        sb.append(", pushSenderUnit=").append(pushSenderUnit);
        sb.append(", user=").append(user);
        sb.append(", messageReadTime=").append(messageReadTime);
        sb.append(", messageEndTime=").append(messageEndTime);
        sb.append(", messageReceivedTime=").append(messageReceivedTime);
        sb.append('}');
        return sb.toString();
    }
}
