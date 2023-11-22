package com.ajay.edulearn.controller;
import com.ajay.edulearn.service.QuizService;
import com.ajay.edulearn.model.Exam;
import com.ajay.edulearn.model.McqQues;
import com.ajay.edulearn.model.QuestionBank;
import com.ajay.edulearn.service.McqServices;
import com.ajay.edulearn.service.QuestionBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
//@CrossOrigin(origins = "${orginurl}")

@RestController
@RequestMapping("/api/exam")
public class QuizController {
    @Autowired
    private QuizService quizService;

    @Autowired
    private QuestionBankService questionBankService;

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

    @GetMapping("/questionbank/all")
    public List<QuestionBank>getAllQuestion(){
          List<QuestionBank> qb=questionBankService.findAllQuestionBank();
          return qb;
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
    public List<McqQues> getMcqbyQuestionid(@PathVariable Long id){
        List<McqQues> mcqQues=mcqServices.findAllMcqQuesByQuestionid(id);
        return mcqQues;

    }
    @PostMapping("/mcq/add")
    public ResponseEntity<McqQues>saveMcq(@RequestBody McqQues questionBank){
        return new ResponseEntity<McqQues>(mcqServices.save(questionBank), HttpStatus.CREATED);
    }


    @RequestMapping(value = "/mcq/questionid/saveall", method = RequestMethod.POST)
    @ResponseBody
    public List<McqQues> saveAllMcq(@RequestBody List<McqQues> studentList) {
        List<McqQues> studentResponse = (List<McqQues>) mcqServices.saveAllMcq(studentList);
        return studentResponse;
    }


}
