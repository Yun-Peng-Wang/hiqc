package com.example.demo.model;

import java.io.Serializable;

public class Institution implements Serializable {
    private Integer id;

    /**
     * 机构名
     *
     * @mbg.generated
     */
    private String institutionName;

    /**
     * 机构代码
     *
     * @mbg.generated
     */
    private String institutionCode;

    /**
     * 地址
     *
     * @mbg.generated
     */
    private String address;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public String getInstitutionCode() {
        return institutionCode;
    }

    public void setInstitutionCode(String institutionCode) {
        this.institutionCode = institutionCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", institutionName=").append(institutionName);
        sb.append(", institutionCode=").append(institutionCode);
        sb.append(", address=").append(address);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}