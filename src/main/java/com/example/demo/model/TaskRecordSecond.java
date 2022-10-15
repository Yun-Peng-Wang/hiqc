package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;

public class TaskRecordSecond implements Serializable {
    private Integer id;

    /**
     * 任务下的文档id
     *
     * @mbg.generated
     */
    private Integer taskDocumentId;

    /**
     * 存储路径
     *
     * @mbg.generated
     */
    private String path;

    /**
     * 重命名
     *
     * @mbg.generated
     */
    private String rename;

    /**
     * 上传时间
     *
     * @mbg.generated
     */
    private Date uploadTime;

    /**
     * 大小
     *
     * @mbg.generated
     */
    private Double size;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTaskDocumentId() {
        return taskDocumentId;
    }

    public void setTaskDocumentId(Integer taskDocumentId) {
        this.taskDocumentId = taskDocumentId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getRename() {
        return rename;
    }

    public void setRename(String rename) {
        this.rename = rename;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", taskDocumentId=").append(taskDocumentId);
        sb.append(", path=").append(path);
        sb.append(", rename=").append(rename);
        sb.append(", uploadTime=").append(uploadTime);
        sb.append(", size=").append(size);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}