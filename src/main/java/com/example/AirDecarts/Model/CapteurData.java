package com.example.AirDecarts.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="CapteurData")

public class CapteurData {
	
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private int codecapteur;
	private String capteurfullname;
	private String dimension ;
	private String batterylifetime ;
	private String instalation ;
	private float temperature ;
	private float co2 ;
	private float pression ;
	private float humidity ;
	private float lat ;
	private float lng ;
	private String address ;
	private String capteurdistance ;
	private int yearobservation ;
	private int  monthobservation ;
	private int  dayobservation ;
	private int  hourobservation ;
	private int  minuteobservation ;
	
	
	
	public CapteurData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CapteurData(int id, int codecapteur, String capteurfullname, String dimension, String batterylifetime,
			String instalation, float temperature, float co2, float pression, float humidity, float lat, float lng,
			String address, String capteurdistance, int yearobservation, int monthobservation, int dayobservation,
			int hourobservation, int minuteobservation) {
		super();
		this.id = id;
		this.codecapteur = codecapteur;
		this.capteurfullname = capteurfullname;
		this.dimension = dimension;
		this.batterylifetime = batterylifetime;
		this.instalation = instalation;
		this.temperature = temperature;
		this.co2 = co2;
		this.pression = pression;
		this.humidity = humidity;
		this.lat = lat;
		this.lng = lng;
		this.address = address;
		this.capteurdistance = capteurdistance;
		this.yearobservation = yearobservation;
		this.monthobservation = monthobservation;
		this.dayobservation = dayobservation;
		this.hourobservation = hourobservation;
		this.minuteobservation = minuteobservation;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCodecapteur() {
		return codecapteur;
	}
	public void setCodecapteur(int codecapteur) {
		this.codecapteur = codecapteur;
	}
	public String getCapteurfullname() {
		return capteurfullname;
	}
	public void setCapteurfullname(String capteurfullname) {
		this.capteurfullname = capteurfullname;
	}
	public String getDimension() {
		return dimension;
	}
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}
	public String getBatterylifetime() {
		return batterylifetime;
	}
	public void setBatterylifetime(String batterylifetime) {
		this.batterylifetime = batterylifetime;
	}
	public String getInstalation() {
		return instalation;
	}
	public void setInstalation(String instalation) {
		this.instalation = instalation;
	}
	public float getTemperature() {
		return temperature;
	}
	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}
	public float getCo2() {
		return co2;
	}
	public void setCo2(float co2) {
		this.co2 = co2;
	}
	public float getPression() {
		return pression;
	}
	public void setPression(float pression) {
		this.pression = pression;
	}
	public float getHumidity() {
		return humidity;
	}
	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}
	public float getLat() {
		return lat;
	}
	public void setLat(float lat) {
		this.lat = lat;
	}
	public float getLng() {
		return lng;
	}
	public void setLng(float lng) {
		this.lng = lng;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCapteurdistance() {
		return capteurdistance;
	}
	public void setCapteurdistance(String capteurdistance) {
		this.capteurdistance = capteurdistance;
	}
	public int getYearobservation() {
		return yearobservation;
	}
	public void setYearobservation(int yearobservation) {
		this.yearobservation = yearobservation;
	}
	public int getMonthobservation() {
		return monthobservation;
	}
	public void setMonthobservation(int monthobservation) {
		this.monthobservation = monthobservation;
	}
	public int getDayobservation() {
		return dayobservation;
	}
	public void setDayobservation(int dayobservation) {
		this.dayobservation = dayobservation;
	}
	public int getHourobservation() {
		return hourobservation;
	}
	public void setHourobservation(int hourobservation) {
		this.hourobservation = hourobservation;
	}
	public int getMinuteobservation() {
		return minuteobservation;
	}
	public void setMinuteobservation(int minuteobservation) {
		this.minuteobservation = minuteobservation;
	}
	@Override
	public String toString() {
		return "CapteurData [id=" + id + ", codecapteur=" + codecapteur + ", capteurfullname=" + capteurfullname
				+ ", dimension=" + dimension + ", batterylifetime=" + batterylifetime + ", instalation=" + instalation
				+ ", temperature=" + temperature + ", co2=" + co2 + ", pression=" + pression + ", humidity=" + humidity
				+ ", lat=" + lat + ", lng=" + lng + ", address=" + address + ", capteurdistance=" + capteurdistance
				+ ", yearobservation=" + yearobservation + ", monthobservation=" + monthobservation
				+ ", dayobservation=" + dayobservation + ", hourobservation=" + hourobservation + ", minuteobservation="
				+ minuteobservation + "]";
	}
	
    
}
