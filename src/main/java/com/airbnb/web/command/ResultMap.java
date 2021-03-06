package com.airbnb.web.command;

import lombok.Data;

public class ResultMap {
   /*common ResultMap*/

   /*common bongki ...*/
	private String rsvSeq,residenceName,name,checkout,checkin,birthdate;
   /*common heekyung */
	private String hostSerial, memberId, price, zipcode, detailImg, infoImg, resiContent, addr, adult, teen, child;
	private String wifi, bedNum, pet, essentialItem, parking, bathroomNum, tv, washingMac, airCondi, kitchen,
	boardSeq, reviewStar, contents, regdate;
	int revAvg; 
   /*common jiwon.... */
	private String title,cateName, cateLevel, cateSeq,date, sale;
   /*common yongju */
   /*common juyeon */
	public String getRsvSeq() {
		return rsvSeq;
	}
	public void setRsvSeq(String rsvSeq) {
		this.rsvSeq = rsvSeq;
	}
	public String getResidenceName() {
		return residenceName;
	}
	public void setResidenceName(String residenceName) {
		this.residenceName = residenceName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCheckout() {
		return checkout;
	}
	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}
	public String getCheckin() {
		return checkin;
	}
	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
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
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getDetailImg() {
		return detailImg;
	}
	public void setDetailImg(String detailImg) {
		this.detailImg = detailImg;
	}
	public String getInfoImg() {
		return infoImg;
	}
	public void setInfoImg(String infoImg) {
		this.infoImg = infoImg;
	}
	public String getResiContent() {
		return resiContent;
	}
	public void setResiContent(String resiContent) {
		this.resiContent = resiContent;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
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
	public String getWifi() {
		return wifi;
	}
	public void setWifi(String wifi) {
		this.wifi = wifi;
	}
	public String getBedNum() {
		return bedNum;
	}
	public void setBedNum(String bedNum) {
		this.bedNum = bedNum;
	}
	public String getPet() {
		return pet;
	}
	public void setPet(String pet) {
		this.pet = pet;
	}
	public String getEssentialItem() {
		return essentialItem;
	}
	public void setEssentialItem(String essentialItem) {
		this.essentialItem = essentialItem;
	}
	public String getParking() {
		return parking;
	}
	public void setParking(String parking) {
		this.parking = parking;
	}
	public String getBathroomNum() {
		return bathroomNum;
	}
	public void setBathroomNum(String bathroomNum) {
		this.bathroomNum = bathroomNum;
	}
	public String getTv() {
		return tv;
	}
	public void setTv(String tv) {
		this.tv = tv;
	}
	public String getWashingMac() {
		return washingMac;
	}
	public void setWashingMac(String washingMac) {
		this.washingMac = washingMac;
	}
	public String getAirCondi() {
		return airCondi;
	}
	public void setAirCondi(String airCondi) {
		this.airCondi = airCondi;
	}
	public String getKitchen() {
		return kitchen;
	}
	public void setKitchen(String kitchen) {
		this.kitchen = kitchen;
	}
	public String getBoardSeq() {
		return boardSeq;
	}
	public void setBoardSeq(String boardSeq) {
		this.boardSeq = boardSeq;
	}
	public String getReviewStar() {
		return reviewStar;
	}
	public void setReviewStar(String reviewStar) {
		this.reviewStar = reviewStar;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public int getRevAvg() {
		return revAvg;
	}
	public void setRevAvg(int revAvg) {
		this.revAvg = revAvg;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCateName() {
		return cateName;
	}
	public void setCateName(String cateName) {
		this.cateName = cateName;
	}
	public String getCateLevel() {
		return cateLevel;
	}
	public void setCateLevel(String cateLevel) {
		this.cateLevel = cateLevel;
	}
	public String getCateSeq() {
		return cateSeq;
	}
	public void setCateSeq(String cateSeq) {
		this.cateSeq = cateSeq;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getSale() {
		return sale;
	}
	public void setSale(String sale) {
		this.sale = sale;
	}
   
}