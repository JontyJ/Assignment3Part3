package com.home.VideoRental;

public class Video {
	String name;
	int stock;	
	
	public String createVideo(String name) {
		this.name = name;
		return this.name;
	}

	public boolean getVideo(String name) {
		this.name = name;
		if(this.name.equals(name)) {
			return true;
		}	
			else
				return false;
		}
	
}
