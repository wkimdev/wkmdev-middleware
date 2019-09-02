package com.wkimdev.lecture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WkimdevMiddlewareApplication {
	
	@Autowired
	static PlayService playService;
	
	public static void main(String[] args) {
		playService.createPlay();
		playService.publishLive();
	}
	
}
