package com.hitzseb.StockApp;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGenerator {

	public static void main(String[] args) {
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String rawPassword = "password";
		String encodedPassword = encoder.encode(rawPassword);
		
		System.out.print(encodedPassword);

	}

}

//password => $2a$10$xfmDaLMue7pstnv1FPTO5.fb5S4vq/8eKNkuL3IUlsuXi.QZ2K0W2