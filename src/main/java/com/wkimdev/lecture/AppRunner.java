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
	
	// interface가 있는경우 interface 타입으로 주입받는게 좋다.
	// primary로 설정한 proxySIMPLE~ 빈들 가져다 쓰게 된다. 
	@Autowired
	PlayService playService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		playService.createPlay();
		playService.publishLive();
	}

}
