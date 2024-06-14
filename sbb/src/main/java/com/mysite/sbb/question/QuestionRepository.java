package com.mysite.sbb.question;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository 
//JPA가 제공하는 인터페이스.
//CRUD 작업을 처리하는 메서드를 내장하고 있음.
public interface QuestionRepository extends JpaRepository<Question, Integer> {

	Question findBySubject(String subject);
	Question findBySubjectAndContent(String subject, String content);
	List<Question> findBySubjectLike(String subject);
	Page<Question> findAll(Pageable pageable);
	
}
