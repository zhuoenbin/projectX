package com.ispan.projectX.entity.push;

import com.ispan.projectX.entity.order.OrderTable;
import com.ispan.projectX.entity.Users;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "user_delivery_message")
public class UserDeliveryMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "message_id")
    private Long messageId;

    @Column(name = "message_type_id")
    private Integer messageTypeId;

    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "order_id")
    private OrderTable order;

    @ManyToOne
    @JoinColumn(name = "buyer_id", referencedColumnName = "user_id")
    private Users buyer;

    @Column(name = "message_read_time")
    private LocalDateTime messageReadTime;

    @Column(name = "message_end_time")
    private LocalDateTime messageEndTime;

    @Column(name = "message_received_time")
    private LocalDateTime messageReceivedTime;

    public UserDeliveryMessage() {
    }

    public UserDeliveryMessage(Long messageId, Integer messageTypeId, OrderTable order, Users buyer, LocalDateTime messageReadTime, LocalDateTime messageEndTime, LocalDateTime messageReceivedTime) {
        this.messageId = messageId;
        this.messageTypeId = messageTypeId;
        this.order = order;
        this.buyer = buyer;
        this.messageReadTime = messageReadTime;
        this.messageEndTime = messageEndTime;
        this.messageReceivedTime = messageReceivedTime;
    }

    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    public Integer getMessageTypeId() {
        return messageTypeId;
    }

    public void setMessageTypeId(Integer messageTypeId) {
        this.messageTypeId = messageTypeId;
    }

    public OrderTable getOrder() {
        return order;
    }

    public void setOrder(OrderTable order) {
        this.order = order;
    }

    public Users getBuyer() {
        return buyer;
    }

    public void setBuyer(Users buyer) {
        this.buyer = buyer;
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
        final StringBuffer sb = new StringBuffer("UserDeliveryMessage{");
        sb.append("messageId=").append(messageId);
        sb.append(", messageTypeId=").append(messageTypeId);
        sb.append(", order=").append(order);
        sb.append(", buyer=").append(buyer);
        sb.append(", messageReadTime=").append(messageReadTime);
        sb.append(", messageEndTime=").append(messageEndTime);
        sb.append(", messageReceivedTime=").append(messageReceivedTime);
        sb.append('}');
        return sb.toString();
    }
}
