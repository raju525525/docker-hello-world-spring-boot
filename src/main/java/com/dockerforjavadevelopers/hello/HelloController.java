package com.dockerforjavadevelopers.hello;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() throws InterruptedException {
		System.out.println("\n=================> OOM test started..\n");
       		 return "Hello World\n";
    }
    
}
