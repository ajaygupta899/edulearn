package com.ajay.edulearn.Quiz;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "result")
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String exam_date;

    @Column(nullable = false)
    private String result_score;

    @Column(nullable = false)
    private  String total_marks;

    @Column(nullable = false)
    private String total_question;

    @Column(nullable = false)
    private long user_email;

    @Column(nullable = false)
    private long exam_id;

    @Column(nullable = false)
    private String exam_name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getExam_date() {
        return exam_date;
    }

    public void setExam_date(String exam_date) {
        this.exam_date = exam_date;
    }

    public String getResult_score() {
        return result_score;
    }

    public void setResult_score(String result_score) {
        this.result_score = result_score;
    }

    public String getTotal_marks() {
        return total_marks;
    }

    public void setTotal_marks(String total_marks) {
        this.total_marks = total_marks;
    }

    public String getTotal_question() {
        return total_question;
    }

    public void setTotal_question(String total_question) {
        this.total_question = total_question;
    }

    public long getUser_email() {
        return user_email;
    }

    public void setUser_email(long user_email) {
        this.user_email = user_email;
    }

    public long getExam_id() {
        return exam_id;
    }

    public void setExam_id(long exam_id) {
        this.exam_id = exam_id;
    }

    public String getExam_name() {
        return exam_name;
    }

    public void setExam_name(String exam_name) {
        this.exam_name = exam_name;
    }
}
