package com.demo.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.demo.model.User;
@Transactional(propagation=Propagation.REQUIRES_NEW,readOnly=false,isolation=Isolation.DEFAULT)
@Repository
public interface UserDAO {
	public int insertUser(User user);
}
