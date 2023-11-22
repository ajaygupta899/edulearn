package com.ajay.edulearn.service;

import com.ajay.edulearn.model.McqQues;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface McqServices {
     McqQues save(McqQues mcqQues);
     Optional<McqQues> findMcqQuesByQuestionid(Long id);
//     Optional<McqQues>findAll

     List<McqQues> findAllMcqQuesByQuestionid(Long id);

     //     Object saveAllMcq(List<McqQues> studentList);
     public List<McqQues> saveAllMcq(List<McqQues> studentList);
}
