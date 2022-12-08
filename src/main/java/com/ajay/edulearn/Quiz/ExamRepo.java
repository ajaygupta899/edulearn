package com.ajay.edulearn.Quiz;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ExamRepo extends JpaRepository<Exam,Long> {

   Optional<Exam> findExamByUserid(Long id);

}
