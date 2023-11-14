package com.onesoft.demopro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoProController {
	@GetMapping(value = "/hii")
	public String getMsg() {
		return "Good Morning";
	}
	@GetMapping("msg/{a}/{b}")
	public int getadd(@PathVariable int a, @PathVariable int b) {
		return a+b;
	}
}
