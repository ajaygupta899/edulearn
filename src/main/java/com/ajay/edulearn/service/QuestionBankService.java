package com.ajay.edulearn.service;

import com.ajay.edulearn.model.QuestionBank;

import java.util.List;
import java.util.Optional;

public interface QuestionBankService {

    QuestionBank saveQuestionBank(QuestionBank questionBank);

    List<QuestionBank> findAllQuestionBank();

    Optional<QuestionBank> findQuestionBankByUserid(Long id);
}
