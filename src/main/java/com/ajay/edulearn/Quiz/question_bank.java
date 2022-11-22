package com.ajay.edulearn.Quiz;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "question_bank")
public class question_bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private long byuserid;

    @Column(nullable = false)
    private String answer;

    @Column(nullable = false)
    private String difficulty;

    @Column(nullable = false)
    private String hint;

    @Column(nullable = false)
    private String language;

    @Column(nullable = false)
    private String question;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public long getByuserid() {
        return byuserid;
    }

    public void setByuserid(long byuserid) {
        this.byuserid = byuserid;
    }
}
