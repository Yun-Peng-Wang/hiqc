package com.example.demo.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "task_result_second", schema = "hiqc", catalog = "")
public class TaskResultSecondEntity {
    private int id;
    private Double score;
    private int taskId;
    private int scoreId;
    private String missingIdetityPath;
    private String missingIdetityRename;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "task_id")
    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    @Basic
    @Column(name = "score_id")
    public int getScoreId() {
        return scoreId;
    }

    public void setScoreId(int scoreId) {
        this.scoreId = scoreId;
    }

    @Basic
    @Column(name = "missing_idetity_path")
    public String getMissingIdetityPath() {
        return missingIdetityPath;
    }

    public void setMissingIdetityPath(String missingIdetityPath) {
        this.missingIdetityPath = missingIdetityPath;
    }

    @Basic
    @Column(name = "missing_idetity_rename")
    public String getMissingIdetityRename() {
        return missingIdetityRename;
    }

    public void setMissingIdetityRename(String missingIdetityRename) {
        this.missingIdetityRename = missingIdetityRename;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaskResultSecondEntity that = (TaskResultSecondEntity) o;
        return id == that.id &&
                taskId == that.taskId &&
                scoreId == that.scoreId &&
                Objects.equals(score, that.score) &&
                Objects.equals(missingIdetityPath, that.missingIdetityPath) &&
                Objects.equals(missingIdetityRename, that.missingIdetityRename);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, score, taskId, scoreId, missingIdetityPath, missingIdetityRename);
    }
}
