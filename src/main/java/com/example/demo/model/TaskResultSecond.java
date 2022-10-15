package com.example.demo.model;

import java.io.Serializable;

public class TaskResultSecond implements Serializable {
    private Integer id;

    /**
     * 指标分数
     *
     * @mbg.generated
     */
    private Double score;

    /**
     * 任务id
     *
     * @mbg.generated
     */
    private Integer taskId;

    /**
     * 指标id
     *
     * @mbg.generated
     */
    private Integer scoreId;

    /**
     * 缺失身份证的路径
     *
     * @mbg.generated
     */
    private String missingIdetityPath;

    /**
     * 缺失身份证的重命名
     *
     * @mbg.generated
     */
    private String missingIdetityRename;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Integer getScoreId() {
        return scoreId;
    }

    public void setScoreId(Integer scoreId) {
        this.scoreId = scoreId;
    }

    public String getMissingIdetityPath() {
        return missingIdetityPath;
    }

    public void setMissingIdetityPath(String missingIdetityPath) {
        this.missingIdetityPath = missingIdetityPath;
    }

    public String getMissingIdetityRename() {
        return missingIdetityRename;
    }

    public void setMissingIdetityRename(String missingIdetityRename) {
        this.missingIdetityRename = missingIdetityRename;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", score=").append(score);
        sb.append(", taskId=").append(taskId);
        sb.append(", scoreId=").append(scoreId);
        sb.append(", missingIdetityPath=").append(missingIdetityPath);
        sb.append(", missingIdetityRename=").append(missingIdetityRename);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}