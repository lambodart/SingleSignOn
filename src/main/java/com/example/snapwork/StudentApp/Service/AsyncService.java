package com.example.snapwork.StudentApp.Service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AsyncService {

	 @Async
	 public void fetchSuccessResponsesAsync() {
				System.out.println(Thread.currentThread().getName());
	}
	 
}
