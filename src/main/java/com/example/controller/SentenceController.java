package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.SentenceService;

@RestController
public class SentenceController {

	@Autowired
	private SentenceService sentenceService;

	@RequestMapping("/sentence")
	public String getSentence() {
		long start = System.currentTimeMillis();
		String output = 
			"<h3>Some Sentences</h3><br/>" +	  
			sentenceService.buildSentence() + "<br/><br/>" +
			sentenceService.buildSentence() + "<br/><br/>" +
			sentenceService.buildSentence() + "<br/><br/>" +
			sentenceService.buildSentence() + "<br/><br/>" +
			sentenceService.buildSentence() + "<br/><br/>"
			;
		long end = System.currentTimeMillis();
		return output + "Elapsed time (ms): " + (end - start);
	}

}
