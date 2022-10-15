package com.example.demo.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "score_second", schema = "hiqc", catalog = "")
public class ScoreSecondEntity {
    private int id;
    private String scoreName;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "score_name")
    public String getScoreName() {
        return scoreName;
    }

    public void setScoreName(String scoreName) {
        this.scoreName = scoreName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ScoreSecondEntity that = (ScoreSecondEntity) o;
        return id == that.id &&
                Objects.equals(scoreName, that.scoreName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, scoreName);
    }
}
