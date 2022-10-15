package com.example.demo.entity;

import javax.persistence.Basic;
import javax.persistence.Entity;

@Entity
@javax.persistence.Table(name = "document_sum", schema = "hiqc", catalog = "")
public class DocumentSumEntity {
    private int id;

    @javax.persistence.Id
    @javax.persistence.Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String documentName;

    @javax.persistence.Basic
    @javax.persistence.Column(name = "document_name")
    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    private int operationIndex;

    @javax.persistence.Basic
    @javax.persistence.Column(name = "operation_index")
    public int getOperationIndex() {
        return operationIndex;
    }

    public void setOperationIndex(int operationIndex) {
        this.operationIndex = operationIndex;
    }
}
