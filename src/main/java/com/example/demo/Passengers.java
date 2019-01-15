package com.example.demo;

import org.springframework.stereotype.Component;

@Component

public class Passengers {
	public String pname;
	public int age;
	
	public Passengers() {
		super();
		System.out.println("This is Passenger Constructor");
	}
	
	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void passengerInfo()
	{
		System.out.println("Many passengers are travelling in Train. ");
	}
}
