package com.airbnb.web.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component 
public class Reservation {
	private String
	rsvSeq,
	checkin,
	checkout,
	regdate,
	adult,
	teen,
	child,
	solddays,
	hostSerial,
	memberId,
	resPrice
;

	public String getRsvSeq() {
		return rsvSeq;
	}

	public void setRsvSeq(String rsvSeq) {
		this.rsvSeq = rsvSeq;
	}

	public String getCheckin() {
		return checkin;
	}

	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}

	public String getCheckout() {
		return checkout;
	}

	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getAdult() {
		return adult;
	}

	public void setAdult(String adult) {
		this.adult = adult;
	}

	public String getTeen() {
		return teen;
	}

	public void setTeen(String teen) {
		this.teen = teen;
	}

	public String getChild() {
		return child;
	}

	public void setChild(String child) {
		this.child = child;
	}

	public String getSolddays() {
		return solddays;
	}

	public void setSolddays(String solddays) {
		this.solddays = solddays;
	}

	public String getHostSerial() {
		return hostSerial;
	}

	public void setHostSerial(String hostSerial) {
		this.hostSerial = hostSerial;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getResPrice() {
		return resPrice;
	}

	public void setResPrice(String resPrice) {
		this.resPrice = resPrice;
	}
}
