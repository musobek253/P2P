package model.response.base;

import model.gateway.Gateway;
import model.merchant.Merchant;

import java.math.BigDecimal;
import java.util.Date;

public class BaseResponse {
    private String transactionAccount;
    private BigDecimal transactionAmount;
    private BigDecimal transactionAmountCurrency;
    private int statedId;
    private Gateway gateway;
    private Merchant merchant;
    private Date createdDate;
    private Date transactionDate;
}
