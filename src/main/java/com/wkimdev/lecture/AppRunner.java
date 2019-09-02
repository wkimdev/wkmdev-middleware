package com.wkimdev.lecture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/*
 * client code 
 */
@Component
public class AppRunner implements ApplicationRunner {
	
	@Autowired
	PlayService playService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		playService.createPlay();
		playService.publishLive();
	}

}
