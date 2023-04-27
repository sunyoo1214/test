package com.example.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UsrHomeController {

	int cnt = 0;

	@RequestMapping("/usr/home/main")
	@ResponseBody
	public String showMain() {
		return "안녕하세요.";
	}

	@RequestMapping("/usr/home/main2")
	@ResponseBody
	public String showMain2() {
		return "반갑습니다.";
	}

	@RequestMapping("/usr/home/main3")
	@ResponseBody
	public String showMain3() {
		return "또만나요.";
	}

	@RequestMapping("/usr/home/main4")
	@ResponseBody
	public int showMain4() {
		cnt++;
		return cnt;
	}

	@RequestMapping("/usr/home/main5")
	@ResponseBody
	public String showMain5() {
		cnt = 0;
		return "count값이 초기화되어 0 입니다";
	}
}
