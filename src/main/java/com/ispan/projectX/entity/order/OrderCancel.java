//package com.ispan.projectX.entity.order;
//
//import com.ispan.projectX.entity.Seller;
//import com.ispan.projectX.entity.Users;
//import jakarta.persistence.*;
//
//import java.time.LocalDateTime;
//
//@Entity
//@Table(name = "order_cancel")
//public class OrderCancel {
//
//    @Id
//    @Column(name = "order_id")
//    private Long orderId;
//
//    @ManyToOne
//    @JoinColumn(name = "order_id", referencedColumnName = "order_id", insertable = false, updatable = false)
//    private OrderDetail orderDetail;
//
//    @ManyToOne
//    @JoinColumn(name = "buyer_id", referencedColumnName = "user_id")
//    private Users buyer;
//
//    @ManyToOne
//    @JoinColumn(name = "seller_id", referencedColumnName = "seller_id")
//    private Seller seller;
//
//    @Column(name = "cancel_person")
//    private Integer cancelPerson;
//
//    @Column(name = "cancel_reason")
//    private String cancelReason;
//
//    @Column(name = "buyer_time")
//    private LocalDateTime buyerTime;
//
//    @Column(name = "seller_time")
//    private LocalDateTime sellerTime;
//
//    public OrderCancel() {
//    }
//
//    public OrderCancel(Long orderId, OrderDetail orderDetail, Users buyer, Seller seller, Integer cancelPerson, String cancelReason, LocalDateTime buyerTime, LocalDateTime sellerTime) {
//        this.orderId = orderId;
//        this.orderDetail = orderDetail;
//        this.buyer = buyer;
//        this.seller = seller;
//        this.cancelPerson = cancelPerson;
//        this.cancelReason = cancelReason;
//        this.buyerTime = buyerTime;
//        this.sellerTime = sellerTime;
//    }
//
//    public Long getOrderId() {
//        return orderId;
//    }
//
//    public void setOrderId(Long orderId) {
//        this.orderId = orderId;
//    }
//
//    public OrderDetail getOrderDetail() {
//        return orderDetail;
//    }
//
//    public void setOrderDetail(OrderDetail orderDetail) {
//        this.orderDetail = orderDetail;
//    }
//
//    public Users getBuyer() {
//        return buyer;
//    }
//
//    public void setBuyer(Users buyer) {
//        this.buyer = buyer;
//    }
//
//    public Seller getSeller() {
//        return seller;
//    }
//
//    public void setSeller(Seller seller) {
//        this.seller = seller;
//    }
//
//    public Integer getCancelPerson() {
//        return cancelPerson;
//    }
//
//    public void setCancelPerson(Integer cancelPerson) {
//        this.cancelPerson = cancelPerson;
//    }
//
//    public String getCancelReason() {
//        return cancelReason;
//    }
//
//    public void setCancelReason(String cancelReason) {
//        this.cancelReason = cancelReason;
//    }
//
//    public LocalDateTime getBuyerTime() {
//        return buyerTime;
//    }
//
//    public void setBuyerTime(LocalDateTime buyerTime) {
//        this.buyerTime = buyerTime;
//    }
//
//    public LocalDateTime getSellerTime() {
//        return sellerTime;
//    }
//
//    public void setSellerTime(LocalDateTime sellerTime) {
//        this.sellerTime = sellerTime;
//    }
//
//    @Override
//    public String toString() {
//        final StringBuffer sb = new StringBuffer("OrderCancel{");
//        sb.append("orderId=").append(orderId);
//        sb.append(", orderDetail=").append(orderDetail);
//        sb.append(", buyer=").append(buyer);
//        sb.append(", seller=").append(seller);
//        sb.append(", cancelPerson=").append(cancelPerson);
//        sb.append(", cancelReason='").append(cancelReason).append('\'');
//        sb.append(", buyerTime=").append(buyerTime);
//        sb.append(", sellerTime=").append(sellerTime);
//        sb.append('}');
//        return sb.toString();
//    }
//
//}
//
