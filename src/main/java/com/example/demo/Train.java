package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Train {
	private String name;
	private int capacity;
	
	public Train() {
		super();
		System.out.println("This is Train Constructor");
	}

	@Autowired
	private Passengers passenger;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Passengers getPassenger() {
		return passenger;
	}

	public void setPassenger(Passengers passenger) {
		this.passenger = passenger;
	}
	
	public void trainInfo()
	{
		System.out.println("Who are travelling in the train?");
		passenger.passengerInfo();
	}
	
}