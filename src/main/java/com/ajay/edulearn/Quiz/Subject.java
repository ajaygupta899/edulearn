package com.ajay.edulearn.Quiz;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "subject")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String subject_name;

    @Column(nullable = false)
    private Long byuser;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getSubject_name() {
        return subject_name;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }

    public Long getByuser() {
        return byuser;
    }

    public void setByuser(Long byuser) {
        this.byuser = byuser;
    }
}
