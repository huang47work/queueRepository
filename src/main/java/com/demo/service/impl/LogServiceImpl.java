package com.demo.service.impl;

import com.demo.dao.LogDAO;
import com.demo.model.Log;
import com.demo.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by huangsiqian on 2017/2/28 0028.
 */

@Service("logServiceImpl")
public class LogServiceImpl implements LogService {
    @Autowired
    LogDAO logDAO ;


    public void insertLogA(Log log) {
        logDAO.insertLogA(log);
    }

    public Log getLogA(Integer id) {
        return logDAO.getLogA(id);
    }

    public void deleteLogAWithId(Integer id) {
        logDAO.deleteLogAWithId(id);
    }

    public void deleteLogBWithId(Integer id) {
        logDAO.deleteLogBWithId(id);
    }

    public void insertLogB(Log log) {
        logDAO.insertLogB(log);
    }

    public Log getLogB(Integer id) {
        return logDAO.getLogB(id);
    }
}
