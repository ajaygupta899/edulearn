package com.ajay.edulearn.Quiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service("McqServiceImpl")
public class McqServiceImpl implements McqServices{

    @Autowired
    private mcqRepo mcqRepo;


    @Override
    public McqQues save(McqQues mcqQues) {
        return mcqRepo.save(mcqQues);
    }

    @Override
    public Optional<McqQues>findMcqQuesByQuestionid(Long id){
    return mcqRepo.findMcqQuesByQuestionid(id);
}
}
