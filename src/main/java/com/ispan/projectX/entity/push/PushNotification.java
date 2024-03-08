package com.ispan.projectX.entity.push;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "push_notification")
public class PushNotification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "push_id")
    private Long pushId;

    @Column(name = "push_sender_unit")
    private Integer pushSenderUnit;

    @Column(name = "push_sender_id")
    private Integer pushSenderId;

    @Column(name = "push_category")
    private Integer pushCategory;

    @Column(name = "push_connect_activity_id")
    private Integer pushConnectActivityId;

    @Column(name = "push_connect_activity_url")
    private String pushConnectActivityUrl;

    @Column(name = "push_activity_rule")
    private Integer pushActivityRule;

    @Column(name = "push_title")
    private String pushTitle;

    @Column(name = "push_text")
    private String pushText;

    @Column(name = "push_img")
    private String pushImg;

    @Column(name = "push_created_time")
    private LocalDateTime pushCreatedTime;

    @Column(name = "push_send_time")
    private LocalDateTime pushSendTime;

    @ManyToOne
    @JoinColumn(name = "push_receiver_group_id", referencedColumnName = "group_id")
    private PushReceiverGroup pushReceiverGroup;

    @Column(name = "push_status")
    private Integer pushStatus;

    @Column(name = "push_update_time")
    private LocalDateTime pushUpdateTime;

    @Column(name = "push_apply_time")
    private Integer pushApplyTime;

    public PushNotification() {
    }

    public PushNotification(Long pushId, Integer pushSenderUnit, Integer pushSenderId, Integer pushCategory, Integer pushConnectActivityId, String pushConnectActivityUrl, Integer pushActivityRule, String pushTitle, String pushText, String pushImg, LocalDateTime pushCreatedTime, LocalDateTime pushSendTime, PushReceiverGroup pushReceiverGroup, Integer pushStatus, LocalDateTime pushUpdateTime, Integer pushApplyTime) {
        this.pushId = pushId;
        this.pushSenderUnit = pushSenderUnit;
        this.pushSenderId = pushSenderId;
        this.pushCategory = pushCategory;
        this.pushConnectActivityId = pushConnectActivityId;
        this.pushConnectActivityUrl = pushConnectActivityUrl;
        this.pushActivityRule = pushActivityRule;
        this.pushTitle = pushTitle;
        this.pushText = pushText;
        this.pushImg = pushImg;
        this.pushCreatedTime = pushCreatedTime;
        this.pushSendTime = pushSendTime;
        this.pushReceiverGroup = pushReceiverGroup;
        this.pushStatus = pushStatus;
        this.pushUpdateTime = pushUpdateTime;
        this.pushApplyTime = pushApplyTime;
    }

    public Long getPushId() {
        return pushId;
    }

    public void setPushId(Long pushId) {
        this.pushId = pushId;
    }

    public Integer getPushSenderUnit() {
        return pushSenderUnit;
    }

    public void setPushSenderUnit(Integer pushSenderUnit) {
        this.pushSenderUnit = pushSenderUnit;
    }

    public Integer getPushSenderId() {
        return pushSenderId;
    }

    public void setPushSenderId(Integer pushSenderId) {
        this.pushSenderId = pushSenderId;
    }

    public Integer getPushCategory() {
        return pushCategory;
    }

    public void setPushCategory(Integer pushCategory) {
        this.pushCategory = pushCategory;
    }

    public Integer getPushConnectActivityId() {
        return pushConnectActivityId;
    }

    public void setPushConnectActivityId(Integer pushConnectActivityId) {
        this.pushConnectActivityId = pushConnectActivityId;
    }

    public String getPushConnectActivityUrl() {
        return pushConnectActivityUrl;
    }

    public void setPushConnectActivityUrl(String pushConnectActivityUrl) {
        this.pushConnectActivityUrl = pushConnectActivityUrl;
    }

    public Integer getPushActivityRule() {
        return pushActivityRule;
    }

    public void setPushActivityRule(Integer pushActivityRule) {
        this.pushActivityRule = pushActivityRule;
    }

    public String getPushTitle() {
        return pushTitle;
    }

    public void setPushTitle(String pushTitle) {
        this.pushTitle = pushTitle;
    }

    public String getPushText() {
        return pushText;
    }

    public void setPushText(String pushText) {
        this.pushText = pushText;
    }

    public String getPushImg() {
        return pushImg;
    }

    public void setPushImg(String pushImg) {
        this.pushImg = pushImg;
    }

    public LocalDateTime getPushCreatedTime() {
        return pushCreatedTime;
    }

    public void setPushCreatedTime(LocalDateTime pushCreatedTime) {
        this.pushCreatedTime = pushCreatedTime;
    }

    public LocalDateTime getPushSendTime() {
        return pushSendTime;
    }

    public void setPushSendTime(LocalDateTime pushSendTime) {
        this.pushSendTime = pushSendTime;
    }

    public PushReceiverGroup getPushReceiverGroup() {
        return pushReceiverGroup;
    }

    public void setPushReceiverGroup(PushReceiverGroup pushReceiverGroup) {
        this.pushReceiverGroup = pushReceiverGroup;
    }

    public Integer getPushStatus() {
        return pushStatus;
    }

    public void setPushStatus(Integer pushStatus) {
        this.pushStatus = pushStatus;
    }

    public LocalDateTime getPushUpdateTime() {
        return pushUpdateTime;
    }

    public void setPushUpdateTime(LocalDateTime pushUpdateTime) {
        this.pushUpdateTime = pushUpdateTime;
    }

    public Integer getPushApplyTime() {
        return pushApplyTime;
    }

    public void setPushApplyTime(Integer pushApplyTime) {
        this.pushApplyTime = pushApplyTime;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PushNotification{");
        sb.append("pushId=").append(pushId);
        sb.append(", pushSenderUnit=").append(pushSenderUnit);
        sb.append(", pushSenderId=").append(pushSenderId);
        sb.append(", pushCategory=").append(pushCategory);
        sb.append(", pushConnectActivityId=").append(pushConnectActivityId);
        sb.append(", pushConnectActivityUrl='").append(pushConnectActivityUrl).append('\'');
        sb.append(", pushActivityRule=").append(pushActivityRule);
        sb.append(", pushTitle='").append(pushTitle).append('\'');
        sb.append(", pushText='").append(pushText).append('\'');
        sb.append(", pushImg='").append(pushImg).append('\'');
        sb.append(", pushCreatedTime=").append(pushCreatedTime);
        sb.append(", pushSendTime=").append(pushSendTime);
        sb.append(", pushReceiverGroup=").append(pushReceiverGroup);
        sb.append(", pushStatus=").append(pushStatus);
        sb.append(", pushUpdateTime=").append(pushUpdateTime);
        sb.append(", pushApplyTime=").append(pushApplyTime);
        sb.append('}');
        return sb.toString();
    }

}

