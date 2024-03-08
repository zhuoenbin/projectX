package com.ispan.projectX.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "problem")
public class Problem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "problem_id")
    private Integer problemId;

    @Column(name = "problem_name", length = 30)
    private String problemName;

    public Problem() {
    }

    public Problem(Integer problemId, String problemName) {
        this.problemId = problemId;
        this.problemName = problemName;
    }

    public Integer getProblemId() {
        return problemId;
    }

    public void setProblemId(Integer problemId) {
        this.problemId = problemId;
    }

    public String getProblemName() {
        return problemName;
    }

    public void setProblemName(String problemName) {
        this.problemName = problemName;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Problem{");
        sb.append("problemId=").append(problemId);
        sb.append(", problemName='").append(problemName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
