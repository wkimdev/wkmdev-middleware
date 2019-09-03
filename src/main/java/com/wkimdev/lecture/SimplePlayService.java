package com.wkimdev.lecture;

import org.springframework.stereotype.Service;

/*
 * real Subject
 * 서비스 빈으로 등록됨.  
 */
@Service
public class SimplePlayService implements PlayService {

	@Override
	public void createPlay() {
		// long begin = System.currentTimeMillis(); // 크로스 컷팅.. 이런 기능을 넣지 않는다. 
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Created an Plat Event!!");
		
		// System.out.println(System.currentTimeMillis() - begin);	// 크로스 컷팅.. 
	}

	@Override
	public void publishLive() {
		// long begin = System.currentTimeMillis();	// 크로스 컷팅.. 
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Published an Live Event!!");	
		
		// System.out.println(System.currentTimeMillis() - begin);	// 크로스 컷팅.. 
	}
	
	// 성능을 측정하고 싶지 않는 메서드 존재 가능.. 
}
