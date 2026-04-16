package com.busbooking.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="passenger")
public class Passenger {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="passenger_id")
	private Integer passengerId;
	
	@Column(name="passenger_name")
	private String passengerName;
	
	@Column(name="passenger_age")
	private Integer passengerAge;
	
	@Column(name="seat_no")
	private Integer seatNo;
	
	@ManyToOne
	@JoinColumn(name="b_id")
	private BusBooking busBooking;
	
	
	public Passenger(){
		
	}
	

	public Passenger(Integer passengerId, String passengerName, Integer passengerAge, Integer seatNo,
			BusBooking busBooking) {
		super();
		this.passengerId = passengerId;
		this.passengerName = passengerName;
		this.passengerAge = passengerAge;
		this.seatNo = seatNo;
		this.busBooking = busBooking;
	}


	public Integer getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(Integer passengerId) {
		this.passengerId = passengerId;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public Integer getPassengerAge() {
		return passengerAge;
	}

	public void setPassengerAge(Integer passengerAge) {
		this.passengerAge = passengerAge;
	}

	public Integer getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(Integer seatNo) {
		this.seatNo = seatNo;
	}

	public BusBooking getBusBooking() {
		return busBooking;
	}

	public void setBusBooking(BusBooking busBooking) {
		this.busBooking = busBooking;
	}

	
	
	@Override
	public String toString() {
		return "Passenger [passengerId=" + passengerId + ", passengerName=" + passengerName + ", passengerAge="
				+ passengerAge + ", seatNo=" + seatNo + "]";
	}
	
	
	
	
	



}
