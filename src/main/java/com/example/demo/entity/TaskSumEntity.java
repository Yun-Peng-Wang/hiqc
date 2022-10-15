package com.example.demo.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "task_sum", schema = "hiqc", catalog = "")
public class TaskSumEntity {
    private int id;
    private int userId;
    private Timestamp createTime;
    private Integer institutionId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "institution_id")
    public Integer getInstitutionId() {
        return institutionId;
    }

    public void setInstitutionId(Integer institutionId) {
        this.institutionId = institutionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaskSumEntity that = (TaskSumEntity) o;
        return id == that.id &&
                userId == that.userId &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(institutionId, that.institutionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, createTime, institutionId);
    }
}
