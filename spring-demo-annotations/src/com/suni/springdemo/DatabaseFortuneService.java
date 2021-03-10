package com.suni.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {
	//@PostConstruct
	public void DatabaseFortuneService() throws IOException {

		File file = new File("D:\\TUTORIALS\\JSP\\fortuneData.txt");

		BufferedReader br = new BufferedReader(new FileReader(file));

		String st;
		while ((st = br.readLine()) != null) {
			System.out.println(st);

		}
	}

	@Override
	public String getFortune() {
		return null;
	}

}
