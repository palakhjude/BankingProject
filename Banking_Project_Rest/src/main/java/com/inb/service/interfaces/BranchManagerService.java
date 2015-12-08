package com.inb.service.interfaces;

import com.inb.exceptions.NotBranchManagerException;
import com.inb.mongo.collections.BranchManager;

public interface BranchManagerService {
	String save(BranchManager branchManager);
	BranchManager login(String username, String password) throws NotBranchManagerException;
	
}
