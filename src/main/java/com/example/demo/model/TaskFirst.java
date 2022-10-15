package com.example.demo.model;

import java.io.Serializable;

public class TaskFirst implements Serializable {
    private Integer id;

    /**
     * 任务下的文档id
     *
     * @mbg.generated
     */
    private Integer taskDocumentId;

    /**
     * 测试文档数
     *
     * @mbg.generated
     */
    private Integer testDocumentNum;

    /**
     * 正确文档数
     *
     * @mbg.generated
     */
    private Integer correctDocumentNum;

    /**
     * 错误文档数
     *
     * @mbg.generated
     */
    private Integer errorDocumentNum;

    /**
     * 分数
     *
     * @mbg.generated
     */
    private Double score;

    /**
     * 文档包含的列名
     *
     * @mbg.generated
     */
    private String contentFields;

    /**
     * 缺失的列名
     *
     * @mbg.generated
     */
    private String missingFields;

    /**
     * 文档内容
     *
     * @mbg.generated
     */
    private String documentText;

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

    public Integer getTestDocumentNum() {
        return testDocumentNum;
    }

    public void setTestDocumentNum(Integer testDocumentNum) {
        this.testDocumentNum = testDocumentNum;
    }

    public Integer getCorrectDocumentNum() {
        return correctDocumentNum;
    }

    public void setCorrectDocumentNum(Integer correctDocumentNum) {
        this.correctDocumentNum = correctDocumentNum;
    }

    public Integer getErrorDocumentNum() {
        return errorDocumentNum;
    }

    public void setErrorDocumentNum(Integer errorDocumentNum) {
        this.errorDocumentNum = errorDocumentNum;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getContentFields() {
        return contentFields;
    }

    public void setContentFields(String contentFields) {
        this.contentFields = contentFields;
    }

    public String getMissingFields() {
        return missingFields;
    }

    public void setMissingFields(String missingFields) {
        this.missingFields = missingFields;
    }

    public String getDocumentText() {
        return documentText;
    }

    public void setDocumentText(String documentText) {
        this.documentText = documentText;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", taskDocumentId=").append(taskDocumentId);
        sb.append(", testDocumentNum=").append(testDocumentNum);
        sb.append(", correctDocumentNum=").append(correctDocumentNum);
        sb.append(", errorDocumentNum=").append(errorDocumentNum);
        sb.append(", score=").append(score);
        sb.append(", contentFields=").append(contentFields);
        sb.append(", missingFields=").append(missingFields);
        sb.append(", documentText=").append(documentText);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}