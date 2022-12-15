package com.ajay.edulearn.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin(origins = "orginurl")
@RequestMapping("/api/exam")
public class QuizController {
    @Autowired
    private QuizService quizService;

    @Autowired
    private QuestionBankService  questionBankService;

    @Autowired
    private McqServices mcqServices;
    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @PostMapping("/add")
    public ResponseEntity<Exam>saveExam(@RequestBody Exam exam){
        return new ResponseEntity<Exam>(quizService.saveExam(exam), HttpStatus.CREATED);
    }
    @RequestMapping(value = "userid/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Optional<Exam> findExamByUserid(@PathVariable Long id){
    Optional<Exam> exam= quizService.findExamByUserid(id);
    return exam;
    }

    @PostMapping("/questionbank/add")
    public ResponseEntity<QuestionBank>saveQuestionBank(@RequestBody QuestionBank questionBank){
        return new ResponseEntity<QuestionBank>(questionBankService.saveQuestionBank(questionBank), HttpStatus.CREATED);
    }
    @RequestMapping(value = "/questionbank/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Optional<QuestionBank> findQuestionBankbyuserid(@PathVariable Long id){
        Optional<QuestionBank> questionBank= questionBankService.findQuestionBankByUserid(id);
        return questionBank;
    }

    @RequestMapping(value = "/mcq/questionid/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Optional<McqQues> getMcqbyQuestionid(@PathVariable Long id){
        Optional<McqQues> mcqQues=mcqServices.findMcqQuesByQuestionid(id);
        return mcqQues;

    }
    @PostMapping("/mcq/add")
    public ResponseEntity<McqQues>saveMcq(@RequestBody McqQues questionBank){
        return new ResponseEntity<McqQues>(mcqServices.save(questionBank), HttpStatus.CREATED);
    }
}
