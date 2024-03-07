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

    @Column(name = "complainant_id")
    private Integer complainantId;

    @Column(name = "classification")
    private Integer classification;

    @Column(name = "respondent_id")
    private Integer respondentId;

    @Column(name = "problem_id")
    private Integer problemId;

    @Column(name = "problem_detail")
    private String problemDetail;

    @Column(name = "complaint_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date complaintTime;

    @Column(name = "finish_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date finishTime;

    @Column(name = "employee_id")
    private Integer employeeId;

    @Column(name = "problem_status")
    private String problemStatus;

    @Column(name = "status_detail")
    private String statusDetail;

    @ManyToOne
    @JoinColumn(name = "complainant_id", referencedColumnName = "user_id")
    private Users complainant;

    @ManyToOne
    @JoinColumn(name = "problem_id", referencedColumnName = "problem_id")
    private Problem problem;

    @ManyToOne
    @JoinColumn(name = "employee_id", referencedColumnName = "employee_id")
    private Employee employee;

    public Complaint() {
    }

    public Complaint(Integer complaintId, Integer complainantId, Integer classification, Integer respondentId, Integer problemId, String problemDetail, Date complaintTime, Date finishTime, Integer employeeId, String problemStatus, String statusDetail, Users complainant, Problem problem, Employee employee) {
        this.complaintId = complaintId;
        this.complainantId = complainantId;
        this.classification = classification;
        this.respondentId = respondentId;
        this.problemId = problemId;
        this.problemDetail = problemDetail;
        this.complaintTime = complaintTime;
        this.finishTime = finishTime;
        this.employeeId = employeeId;
        this.problemStatus = problemStatus;
        this.statusDetail = statusDetail;
        this.complainant = complainant;
        this.problem = problem;
        this.employee = employee;
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

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
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

    public Users getComplainant() {
        return complainant;
    }

    public void setComplainant(Users complainant) {
        this.complainant = complainant;
    }

    public Problem getProblem() {
        return problem;
    }

    public void setProblem(Problem problem) {
        this.problem = problem;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
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
        sb.append(", employeeId=").append(employeeId);
        sb.append(", problemStatus='").append(problemStatus).append('\'');
        sb.append(", statusDetail='").append(statusDetail).append('\'');
        sb.append(", complainant=").append(complainant);
        sb.append(", problem=").append(problem);
        sb.append(", employee=").append(employee);
        sb.append('}');
        return sb.toString();
    }
}
