package com.home.VideoRental;

public class Video {
	private String name;
	private int id; 
	private String genre;
	private double price;
	
	public void Video() {
		this.name = name;
		this.genre = genre;
		this.price = price;
	}
	
	public void setVideo() {
		this.name = "Gone girl";
		this.genre = "Action";
		this.price = 5.00;
	}
	
	public boolean getVideo(String name) {
		setVideo();
		if(name.equals(this.name)) {
			return true;
		}
		else
			return false;
	}
	

}
