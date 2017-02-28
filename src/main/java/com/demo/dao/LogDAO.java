package com.demo.dao;

import com.demo.model.Log;
import org.springframework.stereotype.Component;

/**
 * Created by huangsiqian on 2017/2/28 0028.
 */
@Component
public interface LogDAO {

    void insertLogA(Log log);

    Log getLogA(Integer id);

    void deleteLogAWithId(Integer id);


    void deleteLogBWithId(Integer id);

    void insertLogB(Log log);

    Log getLogB(Integer id);

}
