package com.lti.exam.model;

import java.util.ArrayList;
import java.util.List;

public class QuestionBankLoader {
	 
	public List<Question> fetchQuestionsOnJava(){
		QuestionBank qb=new QuestionBank();
		qb.addNewSubject("Java");
		
		Question q=new Question();
		q.setQuestion("What is a class?");
		List<Option> opts= new ArrayList<Option>();
		Option o1= new Option();
		o1.setOption("Class is a template for an Object");
		o1.setRightAnswer(true);
		
		Option o2= new Option();
		o2.setOption("Class is an instance of an Object");
		o2.setRightAnswer(false);
		
		Option o3= new Option();
		o3.setOption("Class is an another name  for an Object");
		o3.setRightAnswer(false);
		
		Option o4= new Option();
		o4.setOption("All the above");
		o4.setRightAnswer(false);
		
		opts.add(o1);
		opts.add(o2);
		opts.add(o3);
		opts.add(o4);
		
		q.setOptions(opts);
        qb.addNewQuestion("Java", q);
        
        q=new Question();
		q.setQuestion("What is a object?");
		 opts= new ArrayList<Option>();
		o1= new Option();
		o1.setOption("object is a template for an class");
		o1.setRightAnswer(false);
	    o2= new Option();
		o2.setOption("object is a real worl entity");
		o2.setRightAnswer(true);
		 o3= new Option();
		o3.setOption("object is an another name  for an variable");
		o3.setRightAnswer(false);
		 o4= new Option();
		o4.setOption("All the above");
		o4.setRightAnswer(false);
		opts.add(o1);
		opts.add(o2);
		opts.add(o3);
		opts.add(o4);
		q.setOptions(opts);
        qb.addNewQuestion("Java", q);
       
        
        q=new Question();
		q.setQuestion("What is a G1?");
		opts= new ArrayList<Option>();
		o1= new Option();
		o1.setOption("g1 is a garbage collector in the java");
		o1.setRightAnswer(true);
	    o2= new Option();
		o2.setOption("g1 is a real worl entity");
		o2.setRightAnswer(false);
		 o3= new Option();
		o3.setOption("g1 is an another name  for an class");
		o3.setRightAnswer(false);
		 o4= new Option();
		o4.setOption("All the above");
		o4.setRightAnswer(false);
		opts.add(o1);
		opts.add(o2);
		opts.add(o3);
		opts.add(o4);
		q.setOptions(opts);
        qb.addNewQuestion("Java", q);
        
        
        q=new Question();
		q.setQuestion("What is a JVM?");
		opts= new ArrayList<Option>();
		o1= new Option();
		o1.setOption("JVM is a interpreter of  java");
		o1.setRightAnswer(true);
	    o2= new Option();
		o2.setOption("JVM convert into byecode");
		o2.setRightAnswer(false);
		 o3= new Option();
		o3.setOption("JVM used to run the code without the error");
		o3.setRightAnswer(false);
		 o4= new Option();
		o4.setOption("All the above");
		o4.setRightAnswer(false);
		opts.add(o1);
		opts.add(o2);
		opts.add(o3);
		opts.add(o4);
		q.setOptions(opts);
        qb.addNewQuestion("Java", q);
        
        return qb.getQuestionsFor("Java");
	}
	
	}
