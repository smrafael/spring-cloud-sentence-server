package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.client.AdjetiveClient;
import com.example.rest.client.ArticleClient;
import com.example.rest.client.NounClient;
import com.example.rest.client.SubjectClient;
import com.example.rest.client.VerbClient;

@RestController
public class SentenceController {

	@Autowired
	private NounClient nounClient;
	
	@Autowired
	private AdjetiveClient adjetiveClient;
	
	@Autowired
	private ArticleClient articleClient;
	
	@Autowired
	private SubjectClient subjectClient;
	
	@Autowired
	private VerbClient verbClient;

	@RequestMapping("/sentence")
	public String getSentence() {
		return subjectClient.getWord() + " " + verbClient.getWord() + " "
				+ articleClient.getWord() + " " + adjetiveClient.getWord() + " "
				+ nounClient.getWord() + ".";
	}

}
