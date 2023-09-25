package com.ajay.edulearn.service;

import com.ajay.edulearn.model.QuestionBank;

import java.util.Optional;

public interface QuestionBankService {

    QuestionBank saveQuestionBank(QuestionBank questionBank);

    Optional<QuestionBank> findQuestionBankByUserid(Long id);
}
