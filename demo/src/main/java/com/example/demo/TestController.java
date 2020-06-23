package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	Logger LOG = LoggerFactory.getLogger("logger2");

	@RequestMapping(value = "/get1/{param}", method = RequestMethod.GET)
	public void printlog(@PathVariable("param") String param) {

		LOG.info("print statement -  info  class TestController");
		LOG.debug("print statement -  debug  class TestController");
		LOG.error("print statement -  ERROR   class TestController");
	}
}
