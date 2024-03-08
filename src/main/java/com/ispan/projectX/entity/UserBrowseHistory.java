//package com.ispan.projectX.entity;
//
//
//import jakarta.persistence.*;
//
//import java.time.LocalDateTime;
//
//@Entity
//@Table(name = "user_browse_history")
//public class UserBrowseHistory {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;
//
//    @ManyToOne
//    @JoinColumn(name = "user_id", nullable = false)
//    private Users user;
//
//    @ManyToOne
//    @JoinColumn(name = "product_id", nullable = false)
//    private Product product;
//
//    @Column(name = "category_id")
//    private Long categoryId;
//
//    @Column(name = "url", length = 255)
//    private String url;
//
//    @Column(name = "title", length = 255)
//    private String title;
//
//    @Column(name = "visited_date")
//    private LocalDateTime visitedDate;
//
//    public UserBrowseHistory() {
//    }
//
//    public UserBrowseHistory(Long id, Users user, Product product, Long categoryId, String url, String title, LocalDateTime visitedDate) {
//        this.id = id;
//        this.user = user;
//        this.product = product;
//        this.categoryId = categoryId;
//        this.url = url;
//        this.title = title;
//        this.visitedDate = visitedDate;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Users getUser() {
//        return user;
//    }
//
//    public void setUser(Users user) {
//        this.user = user;
//    }
//
//    public Product getProduct() {
//        return product;
//    }
//
//    public void setProduct(Product product) {
//        this.product = product;
//    }
//
//    public Long getCategoryId() {
//        return categoryId;
//    }
//
//    public void setCategoryId(Long categoryId) {
//        this.categoryId = categoryId;
//    }
//
//    public String getUrl() {
//        return url;
//    }
//
//    public void setUrl(String url) {
//        this.url = url;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public LocalDateTime getVisitedDate() {
//        return visitedDate;
//    }
//
//    public void setVisitedDate(LocalDateTime visitedDate) {
//        this.visitedDate = visitedDate;
//    }
//
//    @Override
//    public String toString() {
//        final StringBuffer sb = new StringBuffer("UserBrowseHistory{");
//        sb.append("id=").append(id);
//        sb.append(", user=").append(user);
//        sb.append(", product=").append(product);
//        sb.append(", categoryId=").append(categoryId);
//        sb.append(", url='").append(url).append('\'');
//        sb.append(", title='").append(title).append('\'');
//        sb.append(", visitedDate=").append(visitedDate);
//        sb.append('}');
//        return sb.toString();
//    }
//
//
//}
