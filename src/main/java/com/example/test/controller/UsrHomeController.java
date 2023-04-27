package com.example.test.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
		return "Count의 값이 " + this.count + "으로 초기화 되었습니다.";
	}

	@RequestMapping("/usr/home/doResetCount")
	@ResponseBody
	public String doResetCount() {
		count = 0;
		return "count의 값이 초기화되어 0 입니다.";

	}

	// return type test
	/*
	 * 1. list 2. class 3. map
	 */
	@RequestMapping("/usr/home/typeTest")
	@ResponseBody
	public List<String> typeTest() {

		List<String> list = new ArrayList<>();

		list.add("yangsunwoo");
		list.add("leemingi");
		return list;
	}

	@RequestMapping("/usr/home/getMap")
	@ResponseBody
			
	public Map<String, Object> getMap () {
		Map<String, Object> map = new HashMap<>();
		
		map.put("id", 1);
		map.put("name", "yang");
		
		return map;
	}
	}
