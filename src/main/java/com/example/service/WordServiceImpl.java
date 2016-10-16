package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rest.client.AdjectiveClient;
import com.example.rest.client.ArticleClient;
import com.example.rest.client.NounClient;
import com.example.rest.client.SubjectClient;
import com.example.rest.client.VerbClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class WordServiceImpl implements WordService {

	@Autowired VerbClient verbClient;
	@Autowired SubjectClient subjectClient;
	@Autowired ArticleClient articleClient;
	@Autowired AdjectiveClient adjectiveClient;
	@Autowired NounClient nounClient;
	
	
	@Override
	@HystrixCommand(fallbackMethod="defaultWord")
	public String getSubject() {
		return subjectClient.getWord();
	}
	
	@Override
	@HystrixCommand(fallbackMethod="defaultWord")
	public String getVerb() {
		return verbClient.getWord();
	}
	
	@Override
	@HystrixCommand(fallbackMethod="defaultWord")
	public String getArticle() {
		return articleClient.getWord();
	}
	
	@Override
	@HystrixCommand(fallbackMethod="defaultWord")
	public String getAdjective() {
		return adjectiveClient.getWord();
	}
	
	@Override
	@HystrixCommand(fallbackMethod="defaultWord")
	public String getNoun() {
		return nounClient.getWord();
	}
	
	public String defaultWord() {
		return "";
	}

}
