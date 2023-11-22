package com.ajay.edulearn.Repo;

import com.ajay.edulearn.model.McqQues;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Repository
public interface mcqRepo extends JpaRepository<McqQues, Serializable> {

    Optional<McqQues> findMcqQuesByQuestionid(Long id);


    List<McqQues> findAllByQuestionid(Long id);
}
