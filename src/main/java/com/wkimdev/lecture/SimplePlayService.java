package com.wkimdev.lecture;

import org.springframework.stereotype.Service;

/*
 * real Subject 
 */
@Service
public class SimplePlayService implements PlayService {

	@Override
	public void createPlay() {
		long begin = System.currentTimeMillis();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Created an Plat Event!!");
		
		System.out.println(System.currentTimeMillis() - begin);
	}

	@Override
	public void publishLive() {
		long begin = System.currentTimeMillis();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Published an Live Event!!");
		
		System.out.println(System.currentTimeMillis() - begin);
	}
}
