package com.questionservice.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.questionservice.entities.Question;
import com.questionservice.repositories.QuestionRepository;

@Service
public class QuestionServiceImpl implements QuestionService {

	private QuestionRepository questionRepository;

	public QuestionServiceImpl(QuestionRepository questionRepository) {

		this.questionRepository = questionRepository;
	}

	@Override
	public Question create(Question question) {
		// TODO Auto-generated method stub
		return questionRepository.save(question);
	}

	@Override
	public List<Question> get() {

		return questionRepository.findAll();
	}

	@Override
	public Question get(Long id) {
		// TODO Auto-generated method stub
		return questionRepository.findById(id).orElseThrow(() -> new RuntimeException("Question Not found."));
	}

	
	
	@Override
	public List<Question> getQuestionsOfQuiz(Long quizId) {
		// TODO Auto-generated method stub
		return questionRepository.findByQuizId(quizId);
	}

}
