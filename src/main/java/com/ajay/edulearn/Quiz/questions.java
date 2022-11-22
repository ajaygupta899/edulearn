package com.ajay.edulearn.Quiz;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "questions")
public class questions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String question_answer;

    @Column(nullable = false)
    private String option_one;

    @Column(nullable = false)
    private String option_two;

    @Column(nullable = false)
    private String option_three;

    @Column(nullable = false)
    private String option_four;

    @Column(nullable = false)
    private Long question_id;

    @Column(nullable = false)
    private Long ename_id;

    @Column(nullable = false)
    private Long subject_id;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getQuestion_answer() {
        return question_answer;
    }

    public void setQuestion_answer(String question_answer) {
        this.question_answer = question_answer;
    }

    public String getOption_one() {
        return option_one;
    }

    public void setOption_one(String option_one) {
        this.option_one = option_one;
    }

    public String getOption_two() {
        return option_two;
    }

    public void setOption_two(String option_two) {
        this.option_two = option_two;
    }

    public String getOption_three() {
        return option_three;
    }

    public void setOption_three(String option_three) {
        this.option_three = option_three;
    }

    public String getOption_four() {
        return option_four;
    }

    public void setOption_four(String option_four) {
        this.option_four = option_four;
    }

    public Long getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(Long question_id) {
        this.question_id = question_id;
    }

    public Long getEname_id() {
        return ename_id;
    }

    public void setEname_id(Long ename_id) {
        this.ename_id = ename_id;
    }

    public Long getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(Long subject_id) {
        this.subject_id = subject_id;
    }
}
