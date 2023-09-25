package com.ajay.edulearn.service;

import com.ajay.edulearn.model.Exam;

import java.util.Optional;

public interface QuizService {
    Exam saveExam(Exam exam);

    Optional<Exam> findExamByUserid(Long id);
//    List<Exam> getAllExam();

}
