package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test1Controller {

	Logger LOG = LoggerFactory.getLogger(Test1Controller.class);

	@RequestMapping(value = "/get2/{param}", method = RequestMethod.GET)
	public void printlog(@PathVariable("param") String param) {
		LOG.info("print statement -  info  class Test1Controller");
		LOG.debug("print statement -  debug  class Test1Controller");
		LOG.error("print statement -  error   class Test1Controller");
		LOG.warn("print statement -  warn   class Test1Controller");
		LOG.trace("print statement -  trace   class Test1Controller");
	}
}
