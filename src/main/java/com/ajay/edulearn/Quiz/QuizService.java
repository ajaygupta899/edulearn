package com.ajay.edulearn.Quiz;

import java.util.Optional;

public interface QuizService {
    Exam saveExam(Exam exam);

    Optional<Exam> findExamByUserid(Long id);
//    List<Exam> getAllExam();

}
