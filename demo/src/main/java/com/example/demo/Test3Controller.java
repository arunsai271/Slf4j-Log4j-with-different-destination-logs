package com.example.demo;

import org.junit.platform.commons.util.ToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test3Controller {

	@Autowired
	public MainLogger mainLogger;

	class Student {
		String fname;
		String lname;

		public String getFname() {
			return fname;
		}

		public void setFname(String fname) {
			this.fname = fname;
		}

		public String getLname() {
			return lname;
		}

		public void setLname(String lname) {
			this.lname = lname;
		}

		@Override
		public String toString() {
			return "Student [fname=" + fname + ", lname=" + lname + "]";
		}

	}

	@RequestMapping(value = "/get3/{param}", method = RequestMethod.GET)
	public void printlog(@PathVariable("param") String param) {
		Student student = new Student();
		student.setFname("arun");
		student.setLname("sai");
		mainLogger.print(student);
	}
}
