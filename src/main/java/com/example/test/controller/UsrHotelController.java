package com.example.test.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.test.vo.Hotel;

@Controller
public class UsrHotelController {

	private List<Hotel> hotels;
	private int hotelLastNo;
	
	public UsrHotelController() {
		hotels = new ArrayList<>();
		hotelLastNo = 0;
	}
	
	@RequestMapping("/usr/hotel/doAdd")
	@ResponseBody
	public Hotel doAdd(String nation, String city) {

		int hNo = hotelLastNo + 1;
		Hotel hotel = new Hotel(hNo, nation, city);
		

		hotels.add(hotel);
		
		hotelLastNo = hNo;
		return hotel;
	}
	
	@RequestMapping("/usr/hotel/getHotels")
	@ResponseBody
	public List<Hotel> getHotels(String hNo, String nation, String city) {

		return hotels;
	}


}
