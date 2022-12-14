package com.creditcard.service;

import java.util.List;

import com.creditcard.entities.Statement;

public interface StatementService {
	
		public Statement addStatement(Statement statement);
		public Statement removeStatement(long id);
		public Statement updateStatement(long id, Statement statement);
		public Statement getStatement(long id);
		public List<Statement> getAllStatements();
		
	}



