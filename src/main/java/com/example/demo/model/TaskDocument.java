package com.example.demo.model;

import java.io.Serializable;

public class TaskDocument implements Serializable {
    private Integer id;

    /**
     * 文档id
     *
     * @mbg.generated
     */
    private Integer documentId;

    /**
     * 任务id
     *
     * @mbg.generated
     */
    private Integer taskId;

    /**
     * 提交的文件名
     *
     * @mbg.generated
     */
    private String fileName;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Integer documentId) {
        this.documentId = documentId;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", documentId=").append(documentId);
        sb.append(", taskId=").append(taskId);
        sb.append(", fileName=").append(fileName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}