package com.wkimdev.lecture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/*
 * apprunner(client code) 
 * simpleplayservice(real subject)를 건들지 않고 기능을 추가.
 * simpleplayservice와 같은 interface를 상속한다. 
 * 메서드 실행 시점 기록 
 * 같은 타입의 빈이 여러개일 때 하나를 선택하는 방법. 
 */
@Primary
@Service
public class ProxySimplePlayService implements PlayService {

	// real - subject
	// PlayService playService; // real subject 
	// SimpleEventService를 받아도 된다. 
	@Autowired
	SimplePlayService simplePlayService;

	@Override
	public void createPlay() {
		// 부가 기능
		long begin = System.currentTimeMillis();	// 결국 중복발생, 프록시 클래스를 만드는 비용 발생. 
		// real subject에게 기능 위임
		simplePlayService.createPlay(); // simplePlayService 너가 해 
		// 부가 기능
		System.out.println(System.currentTimeMillis() - begin);
	}

	@Override
	public void publishLive() {
		// 부가 기능
		long begin = System.currentTimeMillis();
		// real subject에게 기능 위임
		simplePlayService.publishLive();	// simplePlayService 너가 해
		// 부가 기능
		System.out.println(System.currentTimeMillis() - begin);
	}

}
