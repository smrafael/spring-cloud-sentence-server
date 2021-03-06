package com.example.rest.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("LAB-5-WORD-SERVER-NOUN")
public interface NounClient {
	
	@RequestMapping(method = RequestMethod.GET,
					value = "/")
	String getWord();

}
