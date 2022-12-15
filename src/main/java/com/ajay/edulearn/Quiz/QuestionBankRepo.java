package com.ajay.edulearn.Quiz;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface QuestionBankRepo extends JpaRepository<QuestionBank,Long> {

    Optional<QuestionBank> findQuestionBankByUserid(Long id) ;

}
