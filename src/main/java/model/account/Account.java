package model.account;

import model.base.BaseModel;

import java.math.BigDecimal;
import java.util.UUID;

public class Account extends BaseModel {
    private BigDecimal balance;
    private Integer getewayId;

    public Account() {
        super();
    }


    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Integer getGetewayId() {
        return getewayId;
    }

    public void setGetewayId(Integer getewayId) {
        this.getewayId = getewayId;
    }
}
