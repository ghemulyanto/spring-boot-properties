package com.tri.properties.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tri.properties.global.AppProperties;
import com.tri.properties.global.GlobalProperties;

@Controller
public class WelcomeController {

	private static final Logger logger = LoggerFactory.getLogger(WelcomeController.class);

	private AppProperties app;
	private GlobalProperties global;

	@Autowired
	public void setApp(AppProperties app) {
		this.app = app;
	}

	@Autowired
	public void setGlobal(GlobalProperties global) {
		this.global = global;
	}

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {

		String appProperties = app.toString();
		String globalProperties = global.toString();

		logger.debug("Welcome ,{},{}", app, global);

		model.put("message", appProperties + globalProperties);
		return "welcome";

	}

}
