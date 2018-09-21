package com.zycus.repository;

import org.springframework.data.repository.CrudRepository;

import com.zycus.entity.AuditLog;

public interface LogRepository extends CrudRepository <AuditLog, Long> {
	
}
