package com.home.VideoRental;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
 @Test	
 public void testVideoName() {
	 String name = "Gone girl"; 
	 
	 boolean video = new Video().getVideo(name); 
	 
	 assertThat(video, is(true));
 }
 
 @Test
 public void testVideoCreate() {
	 String name = "new";
	 
	 
 }
}
