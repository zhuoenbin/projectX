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

    // Constructors, getters, and setters
}
