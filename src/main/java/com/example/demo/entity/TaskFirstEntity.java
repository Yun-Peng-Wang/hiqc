package com.example.demo.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "task_first", schema = "hiqc", catalog = "")
public class TaskFirstEntity {
    private int id;
    private int taskDocumentId;
    private Integer testDocumentNum;
    private Integer correctDocumentNum;
    private Integer errorDocumentNum;
    private Double score;
    private String contentFields;
    private String missingFields;
    private String documentText;

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
    @Column(name = "test_document_num")
    public Integer getTestDocumentNum() {
        return testDocumentNum;
    }

    public void setTestDocumentNum(Integer testDocumentNum) {
        this.testDocumentNum = testDocumentNum;
    }

    @Basic
    @Column(name = "correct_document_num")
    public Integer getCorrectDocumentNum() {
        return correctDocumentNum;
    }

    public void setCorrectDocumentNum(Integer correctDocumentNum) {
        this.correctDocumentNum = correctDocumentNum;
    }

    @Basic
    @Column(name = "error_document_num")
    public Integer getErrorDocumentNum() {
        return errorDocumentNum;
    }

    public void setErrorDocumentNum(Integer errorDocumentNum) {
        this.errorDocumentNum = errorDocumentNum;
    }

    @Basic
    @Column(name = "score")
    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Basic
    @Column(name = "content_fields")
    public String getContentFields() {
        return contentFields;
    }

    public void setContentFields(String contentFields) {
        this.contentFields = contentFields;
    }

    @Basic
    @Column(name = "missing_fields")
    public String getMissingFields() {
        return missingFields;
    }

    public void setMissingFields(String missingFields) {
        this.missingFields = missingFields;
    }

    @Basic
    @Column(name = "document_text")
    public String getDocumentText() {
        return documentText;
    }

    public void setDocumentText(String documentText) {
        this.documentText = documentText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaskFirstEntity that = (TaskFirstEntity) o;
        return id == that.id &&
                taskDocumentId == that.taskDocumentId &&
                Objects.equals(testDocumentNum, that.testDocumentNum) &&
                Objects.equals(correctDocumentNum, that.correctDocumentNum) &&
                Objects.equals(errorDocumentNum, that.errorDocumentNum) &&
                Objects.equals(score, that.score) &&
                Objects.equals(contentFields, that.contentFields) &&
                Objects.equals(missingFields, that.missingFields) &&
                Objects.equals(documentText, that.documentText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, taskDocumentId, testDocumentNum, correctDocumentNum, errorDocumentNum, score, contentFields, missingFields, documentText);
    }
}
