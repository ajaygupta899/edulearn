package com.ajay.edulearn.Quiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@CrossOrigin(origins = "orginurl")
@RequestMapping("/api/exam")
public class ExamController {
    @Autowired
    private ExamService examService;

    public ExamController(ExamService examService) {
        this.examService = examService;
    }

    @PostMapping("/add")
    public ResponseEntity<Exam>saveExam(@RequestBody Exam exam){
        return new ResponseEntity<Exam>(examService.saveExam(exam), HttpStatus.CREATED);
    }
    @RequestMapping(value = "userid/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Optional<Exam> findExamByUserid(@PathVariable Long id){
    Optional<Exam> exam= examService.findExamByUserid(id);
    return exam;
    }
}
