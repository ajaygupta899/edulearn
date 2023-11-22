package com.ajay.edulearn.impl;

import com.ajay.edulearn.Repo.QuestionBankRepo;
import com.ajay.edulearn.model.QuestionBank;
import com.ajay.edulearn.service.QuestionBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class QuestionBankServiceImpl implements QuestionBankService {

    @Autowired
    private QuestionBankRepo questionBankRepo;


    @Override
    public QuestionBank saveQuestionBank(QuestionBank questionBank) {
        return questionBankRepo.save(questionBank);
    }

    @Override
    public List<QuestionBank> findAllQuestionBank(){return  questionBankRepo.findAll();}
    @Override
    public Optional<QuestionBank> findQuestionBankByUserid(Long id) {
        if(id==null){
            return  null;
        }
        Optional<QuestionBank> questionBankOptional;
        questionBankOptional=questionBankRepo.findQuestionBankByUserid(id).isPresent()?Optional.of(questionBankRepo.findQuestionBankByUserid(id).get()):null;
        return questionBankOptional;
    }
}
