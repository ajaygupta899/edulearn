package com.ajay.edulearn.Quiz;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "result")
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long examid;

    @Column(nullable = false)
    private String result_score;

    @Column(nullable = false)
    private  String total_marks;

    @Column(nullable = false)
    private String total_question;

    @Column(nullable = false)
    private String exam_given;//time of exam given

    @Column(nullable = false)
    private Long studentid;

}
