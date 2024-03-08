package com.ispan.projectX.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "complaint")
public class Complaint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "complaint_id")
    private Integer complaintId;

    @Column(name = "complainant_id", nullable = false)
    private Integer complainantId;

    @Column(name = "classification", nullable = false)
    private Integer classification;

    @Column(name = "Respondent_id", nullable = false)
    private Integer respondentId;

    @Column(name = "problem_id", nullable = false)
    private Integer problemId;

    @Column(name = "problem_detail", nullable = false)
    private String problemDetail;

    @Column(name = "complaint_time")
    private Date complaintTime;

    @Column(name = "finish_time")
    private Date finishTime;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @Column(name = "problem_status")
    private String problemStatus;

    @Column(name = "status_detail")
    private String statusDetail;

    public Complaint() {
    }

    public Integer getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(Integer complaintId) {
        this.complaintId = complaintId;
    }

    public Integer getComplainantId() {
        return complainantId;
    }

    public void setComplainantId(Integer complainantId) {
        this.complainantId = complainantId;
    }

    public Integer getClassification() {
        return classification;
    }

    public void setClassification(Integer classification) {
        this.classification = classification;
    }

    public Integer getRespondentId() {
        return respondentId;
    }

    public void setRespondentId(Integer respondentId) {
        this.respondentId = respondentId;
    }

    public Integer getProblemId() {
        return problemId;
    }

    public void setProblemId(Integer problemId) {
        this.problemId = problemId;
    }

    public String getProblemDetail() {
        return problemDetail;
    }

    public void setProblemDetail(String problemDetail) {
        this.problemDetail = problemDetail;
    }

    public Date getComplaintTime() {
        return complaintTime;
    }

    public void setComplaintTime(Date complaintTime) {
        this.complaintTime = complaintTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getProblemStatus() {
        return problemStatus;
    }

    public void setProblemStatus(String problemStatus) {
        this.problemStatus = problemStatus;
    }

    public String getStatusDetail() {
        return statusDetail;
    }

    public void setStatusDetail(String statusDetail) {
        this.statusDetail = statusDetail;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Complaint{");
        sb.append("complaintId=").append(complaintId);
        sb.append(", complainantId=").append(complainantId);
        sb.append(", classification=").append(classification);
        sb.append(", respondentId=").append(respondentId);
        sb.append(", problemId=").append(problemId);
        sb.append(", problemDetail='").append(problemDetail).append('\'');
        sb.append(", complaintTime=").append(complaintTime);
        sb.append(", finishTime=").append(finishTime);
        sb.append(", employee=").append(employee);
        sb.append(", problemStatus='").append(problemStatus).append('\'');
        sb.append(", statusDetail='").append(statusDetail).append('\'');
        sb.append('}');
        return sb.toString();
    }
}