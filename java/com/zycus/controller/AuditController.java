package com.zycus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zycus.entity.AuditLog;
import com.zycus.service.LogService;

@RestController
public class AuditController {
	  
	  @Autowired
	  LogService service;
	  
	  @RequestMapping(value = "/update/log", method = RequestMethod.POST)
	  public void updateLog(@RequestBody AuditLog log) {
		  service.update(log);
	  }
}
