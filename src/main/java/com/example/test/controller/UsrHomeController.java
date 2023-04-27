package com.example.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.test.vo.Passenger;

@Controller
public class UsrHomeController {

	@RequestMapping("/usr/passenger/doAdd")
	@ResponseBody
	public Passenger doAdd(String name, String id, String gender) {

		int no = 1;
		Passenger passenger = new Passenger(no, name, id, gender);

		return passenger;
	}

}
