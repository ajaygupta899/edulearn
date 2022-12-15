package com.ajay.edulearn.Quiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


@Service("ExamServiceImpl")
public class QuizServiceImpl implements QuizService {
    @Autowired
    private QuizRepo quizRepo;

    public QuizServiceImpl(QuizRepo quizRepo){
        this.quizRepo = quizRepo;
    }

    @Override
    public Exam saveExam(Exam exam) {
        return quizRepo.save(exam);
    }

    @Transactional(readOnly = true)
    public Optional<Exam> findExamByUserid(Long id){
        if (id == null) {
            return null;
        }
        Optional<Exam> examOptional;
          examOptional= quizRepo.findExamByUserid(id).isPresent()? Optional.of(quizRepo.findExamByUserid(id).get()) :null;
        return examOptional;

    }

}
