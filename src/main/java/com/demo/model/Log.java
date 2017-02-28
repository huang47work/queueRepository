package com.demo.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by huangsiqian on 2017/2/28 0028.
 */
public class Log implements Serializable{
    private Integer id ;

    private String accountA;

    private String accountB;

    private BigDecimal moneyChange ;

    private Integer deleted ;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccountA() {
        return accountA;
    }

    public void setAccountA(String accountA) {
        this.accountA = accountA;
    }

    public String getAccountB() {
        return accountB;
    }

    public void setAccountB(String accountB) {
        this.accountB = accountB;
    }

    public BigDecimal getMoneyChange() {
        return moneyChange;
    }

    public void setMoneyChange(BigDecimal moneyChange) {
        this.moneyChange = moneyChange;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "Log{" +
                "id=" + id +
                ", accountA='" + accountA + '\'' +
                ", accountB='" + accountB + '\'' +
                ", moneyChange=" + moneyChange +
                ", deleted=" + deleted +
                '}';
    }
}
