package com.ispan.projectX.entity.push;

import com.ispan.projectX.entity.Users;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "user_push_message")
public class UserPushMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "push_message_id")
    private Long pushMessageId;

    @ManyToOne
    @JoinColumn(name = "push_id", referencedColumnName = "push_id")
    private PushNotification pushNotification;

    @Column(name = "push_title")
    private String pushTitle;

    @Column(name = "push_sender_unit")
    private Integer pushSenderUnit;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private Users user;

    @Column(name = "message_read_time")
    private LocalDateTime messageReadTime;

    @Column(name = "message_end_time")
    private LocalDateTime messageEndTime;

    @Column(name = "message_received_time")
    private LocalDateTime messageReceivedTime;

    public UserPushMessage() {
    }

    public UserPushMessage(Long pushMessageId, PushNotification pushNotification, String pushTitle, Integer pushSenderUnit, Users user, LocalDateTime messageReadTime, LocalDateTime messageEndTime, LocalDateTime messageReceivedTime) {
        this.pushMessageId = pushMessageId;
        this.pushNotification = pushNotification;
        this.pushTitle = pushTitle;
        this.pushSenderUnit = pushSenderUnit;
        this.user = user;
        this.messageReadTime = messageReadTime;
        this.messageEndTime = messageEndTime;
        this.messageReceivedTime = messageReceivedTime;
    }

    public Long getPushMessageId() {
        return pushMessageId;
    }

    public void setPushMessageId(Long pushMessageId) {
        this.pushMessageId = pushMessageId;
    }

    public PushNotification getPushNotification() {
        return pushNotification;
    }

    public void setPushNotification(PushNotification pushNotification) {
        this.pushNotification = pushNotification;
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

    public LocalDateTime getMessageReadTime() {
        return messageReadTime;
    }

    public void setMessageReadTime(LocalDateTime messageReadTime) {
        this.messageReadTime = messageReadTime;
    }

    public LocalDateTime getMessageEndTime() {
        return messageEndTime;
    }

    public void setMessageEndTime(LocalDateTime messageEndTime) {
        this.messageEndTime = messageEndTime;
    }

    public LocalDateTime getMessageReceivedTime() {
        return messageReceivedTime;
    }

    public void setMessageReceivedTime(LocalDateTime messageReceivedTime) {
        this.messageReceivedTime = messageReceivedTime;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("UserPushMessage{");
        sb.append("pushMessageId=").append(pushMessageId);
        sb.append(", pushNotification=").append(pushNotification);
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
