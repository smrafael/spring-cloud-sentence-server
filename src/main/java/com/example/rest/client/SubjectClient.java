package com.example.rest.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("LAB-5-WORD-SERVER-SUBJECT")
public interface SubjectClient {
	
	@RequestMapping(method = RequestMethod.GET,
					value = "/")
	String getWord();

}
