package com.dockerforjavadevelopers.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() throws InterruptedException {
		System.out.println("\n=================> OOM test started..\n");

		for (int i = 0; i <= 10000000; i++) {
			int n = 10;
			String newObject=new String();
			for (int c = 1; c <= 10; c++) {
				System.out.println(n + "*" + c + " = " + (n * c));
			}
		}
		return "Hello World\n";
	}

}
