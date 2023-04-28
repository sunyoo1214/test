package com.example.test.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.test.vo.Schedule;

@Controller
public class UsrScheduleController {

	private List<Schedule> schedules;
	private int scheduleLastNo;
	
	public UsrScheduleController() {
		schedules = new ArrayList<>();
		scheduleLastNo = 0;
	}
	
	@RequestMapping("/usr/schedule/doAdd")
	@ResponseBody
	public Schedule doAdd(String startDate, String endDate, int hNo) {

		int sNo = scheduleLastNo + 1;
		Schedule schedule = new Schedule(sNo, startDate, endDate, hNo);

		schedules.add(schedule);
		
		scheduleLastNo = sNo;
		return schedule;
	}
	
	@RequestMapping("/usr/schedule/getSchedules")
	@ResponseBody
	public List<Schedule> getSchedules(String startDate, String endDate, int hNo) {

		return schedules;
	}


}
