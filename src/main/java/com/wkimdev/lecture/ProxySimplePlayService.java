package com.wkimdev.lecture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class ProxySimplePlayService implements PlayService {

	// real - subject
	@Autowired
	PlayService playService;

	@Override
	public void createPlay() {
		// 부가 기능
		long begin = System.currentTimeMillis();
		// 기능 위임
		playService.createPlay();
		// 부가 기능
		System.out.println(System.currentTimeMillis() - begin);
	}

	@Override
	public void publishLive() {
		// 부가 기능
		long begin = System.currentTimeMillis();
		// 기능 위임
		playService.publishLive();
		// 부가 기능
		System.out.println(System.currentTimeMillis() - begin);
	}

}
