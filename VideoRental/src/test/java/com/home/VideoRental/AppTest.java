package com.home.VideoRental;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
 @Test	
 public void testVideoCreation() {
	  String name = "Gone girl";
	  String ogName;
		 
	  ogName = new Video().createVideo(name); 
		 
	  assertEquals(name, ogName);
}
	
 @Test	
 public void testVideoSearch() {
	 String name = "Gone girl";
	 String ogName;
	 boolean result;
	 
	 ogName = new Video().createVideo(name); 
	 result = new Video().getVideo(name); 
	 
	 assertThat(result, is(true));
 }
}
