package com.ajay.edulearn.Quiz;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "exam")
public class exam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String exam_date;

    @Column(nullable = false)
    private String exam_desc;

    @Column(nullable = false)
    private String exam_level;

    @Column(nullable = false)
    private String exam_marks;

    @Column(nullable = false)
    private String exam_pass_marks;

    @Column(nullable = false)
    private Long subject_id;

    @Column(nullable = false)
    private Long user_id;

///////////gettt //////////

/////////////////////////
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExam_date() {
        return exam_date;
    }

    public void setExam_date(String exam_date) {
        this.exam_date = exam_date;
    }

    public String getExam_desc() {
        return exam_desc;
    }

    public void setExam_desc(String exam_desc) {
        this.exam_desc = exam_desc;
    }

    public String getExam_level() {
        return exam_level;
    }

    public void setExam_level(String exam_level) {
        this.exam_level = exam_level;
    }

    public String getExam_marks() {
        return exam_marks;
    }

    public void setExam_marks(String exam_marks) {
        this.exam_marks = exam_marks;
    }

    public String getExam_pass_marks() {
        return exam_pass_marks;
    }

    public void setExam_pass_marks(String exam_pass_marks) {
        this.exam_pass_marks = exam_pass_marks;
    }

    public Long getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(Long subject_id) {
        this.subject_id = subject_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }
}
