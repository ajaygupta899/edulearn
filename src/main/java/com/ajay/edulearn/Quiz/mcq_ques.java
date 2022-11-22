package com.ajay.edulearn.Quiz;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "mcq_ques")
public class mcq_ques {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String mlanguage;

    @Column(nullable = false)
    private String ans;

    @Column(nullable = false)
    private String mquestion;

    @Column(nullable = false)
    private String option1;

    @Column(nullable = false)
    private String option2;

    @Column(nullable = false)
    private String option3;

    @Column(nullable = false)
    private String option4;


    @Column(nullable = false)
    private Long question_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMlanguage() {
        return mlanguage;
    }

    public void setMlanguage(String mlanguage) {
        this.mlanguage = mlanguage;
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }

    public String getMquestion() {
        return mquestion;
    }

    public void setMquestion(String mquestion) {
        this.mquestion = mquestion;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public String getOption4() {
        return option4;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }

    public Long getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(Long question_id) {
        this.question_id = question_id;
    }
}
