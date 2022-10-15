package com.example.demo.model;

import java.io.Serializable;

public class DocumentSum implements Serializable {
    private Integer id;

    /**
     * 文档名
     *
     * @mbg.generated
     */
    private String documentName;

    /**
     * 业务:1 or 2
     *
     * @mbg.generated
     */
    private Integer operationIndex;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public Integer getOperationIndex() {
        return operationIndex;
    }

    public void setOperationIndex(Integer operationIndex) {
        this.operationIndex = operationIndex;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", documentName=").append(documentName);
        sb.append(", operationIndex=").append(operationIndex);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}