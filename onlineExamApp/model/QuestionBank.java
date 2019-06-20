package com.lti.exam.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuestionBank {
    
	private Map<String, List<Question>> questionBank = new HashMap<String,List<Question> >();
	
	public void addNewSubject(String subjectName) {
		questionBank.put(subjectName, new ArrayList<Question>());
		/* the new empty list is created for the new subject*/
	}
	
	public void addNewQuestion(String subjectName, Question question) {
		List<Question> questions =questionBank.get(subjectName);
		questions.add(question);
		/* the list is created for entering the list of questions*/
	}
	
	public List<Question> getQuestionsFor(String subjectName){
		return questionBank.get(subjectName);
		/*for getting the  entered questions on the sub name*/
	}
		
}
