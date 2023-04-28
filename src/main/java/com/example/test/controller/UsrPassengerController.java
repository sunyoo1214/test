package com.example.test.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.test.service.PassengerService;
import com.example.test.vo.Passenger;

@Controller
public class UsrPassengerController {

	@Autowired
	private PassengerService passengerService;
	
	
	private int passengerLastNo;
	private List<Passenger> passengers;
	
	public UsrPassengerController() {
		passengers = new ArrayList<>();
		passengerLastNo = 0;
	}
	
	@RequestMapping("/usr/passenger/doAdd")
	@ResponseBody
	public Passenger doAdd(String name, String id, String gender) {

		int no = passengerLastNo + 1;
		Passenger passenger = new Passenger(no, name, id, gender);

		passengers.add(passenger);
		
		passengerLastNo = no;
		return passenger;
	}
	
	@RequestMapping("/usr/passenger/getPassengers")
	@ResponseBody
	public List<Passenger> getPassengers(String name, String id, String gender) {

		return passengers;
	}


}
