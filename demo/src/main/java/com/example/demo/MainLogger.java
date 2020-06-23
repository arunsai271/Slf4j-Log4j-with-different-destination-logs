package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.example.demo.Test3Controller.Student;

@Component
public class MainLogger {

	Logger LOG = LoggerFactory.getLogger("logger3");

	public void print(Student student) {
		LOG.info(student.toString());
		LOG.info("***************");

	}
}
