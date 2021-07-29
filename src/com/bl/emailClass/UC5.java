package com.bl.emailClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC5 {
	// validate uc5
	public void validate() {
		int flag = 0;
		Pattern pattern = Pattern.compile("^abc.[A-Za-z]+@[bridgelabz.co][a-z]{2}");
		Matcher matcher = pattern.matcher("abc.xyz@bridgelabz.co.in");
		while (matcher.find()) {
			flag = 1;
		}
		if (flag == 1) {
			System.out.println("valid email");
		} else {
			System.out.println("invalid email");
		}
	}
}
