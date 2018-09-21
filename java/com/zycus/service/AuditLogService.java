package com.zycus.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zycus.entity.AuditLog;
import com.zycus.repository.LogRepository;

@Service
@Transactional
public class AuditLogService implements LogService {

	@Autowired
	LogRepository logRepository;
	
	public void update(AuditLog log) {
		log.setId(System.currentTimeMillis() % 100000000l);
		
		logRepository.save(log);
	}

}
