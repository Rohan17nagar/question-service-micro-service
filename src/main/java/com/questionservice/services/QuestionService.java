package com.questionservice.services;

import java.util.List;

import com.questionservice.entities.Question;

public interface QuestionService {

	
	Question create(Question question);
	
	List<Question> get();
	
	Question get(Long id);
	
	List<Question> getQuestionsOfQuiz(Long quizId);
}
