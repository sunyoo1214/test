package com.example.test.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Reserved {

	public int rNo;
	public Hotel hotel;
	public Passenger passenger;
	public Schedule schedule;
	
}
