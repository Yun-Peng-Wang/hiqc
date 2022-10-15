package com.example.demo.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "user_record", schema = "hiqc", catalog = "")
public class UserRecordEntity {
    private int id;
    private int userId;
    private Integer status;
    private Timestamp accessTime;

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
    @Column(name = "status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "access_time")
    public Timestamp getAccessTime() {
        return accessTime;
    }

    public void setAccessTime(Timestamp accessTime) {
        this.accessTime = accessTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserRecordEntity that = (UserRecordEntity) o;
        return id == that.id &&
                userId == that.userId &&
                Objects.equals(status, that.status) &&
                Objects.equals(accessTime, that.accessTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, status, accessTime);
    }
}
