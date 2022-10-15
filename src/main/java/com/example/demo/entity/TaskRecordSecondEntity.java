package com.example.demo.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "task_record_second", schema = "hiqc", catalog = "")
public class TaskRecordSecondEntity {
    private int id;
    private int taskDocumentId;
    private String path;
    private String rename;
    private Timestamp uploadTime;
    private Double size;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "task_document_id")
    public int getTaskDocumentId() {
        return taskDocumentId;
    }

    public void setTaskDocumentId(int taskDocumentId) {
        this.taskDocumentId = taskDocumentId;
    }

    @Basic
    @Column(name = "path")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Basic
    @Column(name = "rename")
    public String getRename() {
        return rename;
    }

    public void setRename(String rename) {
        this.rename = rename;
    }

    @Basic
    @Column(name = "upload_time")
    public Timestamp getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Timestamp uploadTime) {
        this.uploadTime = uploadTime;
    }

    @Basic
    @Column(name = "size")
    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaskRecordSecondEntity that = (TaskRecordSecondEntity) o;
        return id == that.id &&
                taskDocumentId == that.taskDocumentId &&
                Objects.equals(path, that.path) &&
                Objects.equals(rename, that.rename) &&
                Objects.equals(uploadTime, that.uploadTime) &&
                Objects.equals(size, that.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, taskDocumentId, path, rename, uploadTime, size);
    }
}
