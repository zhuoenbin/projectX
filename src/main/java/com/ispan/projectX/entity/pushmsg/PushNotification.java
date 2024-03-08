package com.ispan.projectX.entity.pushmsg;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "push_notification")
public class PushNotification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "push_id")
    private int pushId;

    @Column(name = "push_sender_unit")
    private int pushSenderUnit;

    @Column(name = "push_sender_id")
    private int pushSenderId;

    @Column(name = "push_category")
    private int pushCategory;

    @Column(name = "push_connect_activity_id")
    private int pushConnectActivityId;

    @Column(name = "push_connect_activity_url")
    private String pushConnectActivityUrl;

    @Column(name = "push_activity_rule")
    private int pushActivityRule;

    @Column(name = "push_title")
    private String pushTitle;

    @Column(name = "push_text")
    private String pushText;

    @Column(name = "push_img")
    private String pushImg;

    @Column(name = "push_created_time")
    private Date pushCreatedTime;

    @Column(name = "push_send_time")
    private Date pushSendTime;

    @Column(name = "push_receiver_group_id")
    private int pushReceiverGroupId;

    @Column(name = "push_status")
    private int pushStatus;

    @Column(name = "push_update_time")
    private Date pushUpdateTime;

    @Column(name = "push_apply_time")
    private int pushApplyTime;

    // Getters and setters
}