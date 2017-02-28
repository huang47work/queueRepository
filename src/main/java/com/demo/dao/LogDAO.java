package com.demo.dao;

import com.demo.model.Log;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by huangsiqian on 2017/2/28 0028.
 */
//@Repository
@Transactional(propagation= Propagation.REQUIRES_NEW,readOnly=false,isolation= Isolation.DEFAULT)
public interface LogDAO {

    void insertLogA(Log log);

    Log getLogA(Integer id);

    void deleteLogAWithId(Integer id);


    void deleteLogBWithId(Integer id);

    void insertLogB(Log log);

    Log getLogB(Integer id);

}
