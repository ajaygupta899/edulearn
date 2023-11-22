package com.ajay.edulearn.impl;

import com.ajay.edulearn.service.McqServices;
import com.ajay.edulearn.model.McqQues;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service("McqServiceImpl")
public class McqServiceImpl implements McqServices {

    @Autowired
    private com.ajay.edulearn.Repo.mcqRepo mcqRepo;


    @Override
    public McqQues save(McqQues mcqQues) {
        return mcqRepo.save(mcqQues);
    }

    @Override
    public Optional<McqQues>findMcqQuesByQuestionid(Long id){
    return mcqRepo.findMcqQuesByQuestionid(id);
}
@Override
        public List<McqQues> findAllMcqQuesByQuestionid(Long id){
        return mcqRepo.findAllByQuestionid(id);
}
    @Transactional
    public List<McqQues> saveAllMcq(List<McqQues> studentList) {
        List<McqQues>res=(List<McqQues>) mcqRepo.saveAll(studentList);
        return res;
    }
}
