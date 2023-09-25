package com.ajay.edulearn.Repo;

import com.ajay.edulearn.model.Exam;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface QuizRepo extends JpaRepository<Exam,Long> {

   Optional<Exam> findExamByUserid(Long id);



}
