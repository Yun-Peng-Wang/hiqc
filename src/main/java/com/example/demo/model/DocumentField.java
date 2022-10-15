package com.example.demo.model;

import java.io.Serializable;

public class DocumentField implements Serializable {
    private Integer id;

    /**
     * 文档id
     *
     * @mbg.generated
     */
    private Integer documentId;

    /**
     * 列名
     *
     * @mbg.generated
     */
    private String fieldName;

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

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", documentId=").append(documentId);
        sb.append(", fieldName=").append(fieldName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}