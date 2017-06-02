/**
 * 
 */
package com.abdullah.examples.thymeleaf.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

/**
 * 
 *
 * @author Abdullah Gorakhpur
 * @version 1.0
 * @since May 8, 2017
 */
@Component
public class AppUtility {

	public String getName() {
		return "Abdullah";
	}
	
	public boolean isTrue() {
		return false;
	}
	
	public static void main(String[] args) {
		int i = 3;
		System.out.println((int) i * 2.5/3.0);
	}

}
