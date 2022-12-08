package com.ajay.edulearn.Quiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


@Service("ExamServiceImpl")
public class ExamServiceImpl implements ExamService{
    @Autowired
    private ExamRepo examRepo;

    public ExamServiceImpl(ExamRepo examRepo){
        this.examRepo=examRepo;
    }

    @Override
    public Exam saveExam(Exam exam) {
        return examRepo.save(exam);
    }

    @Transactional(readOnly = true)
    public Optional<Exam> findExamByUserid(Long id){
        if (id == null) {
            return null;
        }
        Optional<Exam> examOptional;
          examOptional=examRepo.findExamByUserid(id).isPresent()? Optional.of(examRepo.findExamByUserid(id).get()) :null;
        return examOptional;
          // Exam exams=examOptional.get();
       // return exams;

    }

}
