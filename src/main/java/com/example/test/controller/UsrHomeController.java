package com.example.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UsrHomeController {

	private int count;

	public UsrHomeController() {
		count = -1;
	}

	@RequestMapping("/usr/home/getCount")
	@ResponseBody
	public int getCount() {
		count++;
		
		return count;
	}

	@RequestMapping("/usr/home/doSetCount")
	@ResponseBody
	public String doSetCount(int cnt) {
		
		this.count = cnt;
		return "Count의 값이 " + this.count +"으로 초기화 되었습니다.";
	}


	@RequestMapping("/usr/home/doResetCount")
	@ResponseBody
	public String doResetCount() {
		count = 0;
		return "count의 값이 초기화되어 0 입니다.";
	}
}
