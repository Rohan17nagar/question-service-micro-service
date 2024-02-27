package com.questionservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.questionservice.entities.Question;
import com.questionservice.services.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {

	private QuestionService questionService;

	public QuestionController(QuestionService questionService) {

		this.questionService = questionService;
	}

	
	//create
	@PostMapping
	public Question create(@RequestBody Question question) {
		return questionService.create(question);
	}

	//get one
	@GetMapping("/{id}")
	public Question get(@PathVariable Long id) {
		return questionService.get(id);
	}

	//get all
	@GetMapping
	public List<Question> get() {
		return questionService.get();
	}
	
	//get all question of specific quiz.
	
	@GetMapping("/quiz/{quizId}")
	public List<Question> getQuestionsOfQuiz(@PathVariable Long quizId){
		return questionService.getQuestionsOfQuiz(quizId);
	}

}
