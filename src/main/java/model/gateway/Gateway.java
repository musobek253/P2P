package model.gateway;

import java.math.BigDecimal;

public class Gateway {
    private int id;
    private String name;
    private Currency currency;
    private BigDecimal minAmount;
    private BigDecimal maxAmount;
    private BigDecimal commissionUp;
    private BigDecimal commissionDown;
    private int merchantId;

    private Boolean isUcell;
    private Boolean isBeeline;
    private Boolean isWebmoney;
    private Boolean isQiwi;

    public Gateway(int id, String name, Currency currency, BigDecimal minAmount, BigDecimal maxAmount, BigDecimal commissionUp, BigDecimal commissionDown, int merchantId) {
        this.id = id;
        this.name = name;
        this.currency = currency;
        this.minAmount = minAmount;
        this.maxAmount = maxAmount;
        this.commissionUp = commissionUp;
        this.commissionDown = commissionDown;
        this.merchantId = merchantId;
    }

    public Gateway(int id, String name, Currency currency, BigDecimal minAmount, BigDecimal maxAmount) {
        this.id = id;
        this.name = name;
        this.currency = currency;
        this.minAmount = minAmount;
        this.maxAmount = maxAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public BigDecimal getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(BigDecimal minAmount) {
        this.minAmount = minAmount;
    }

    public BigDecimal getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(BigDecimal maxAmount) {
        this.maxAmount = maxAmount;
    }

    public BigDecimal getCommissionUp() {
        return commissionUp;
    }

    public void setCommissionUp(BigDecimal commissionUp) {
        this.commissionUp = commissionUp;
    }

    public BigDecimal getCommissionDown() {
        return commissionDown;
    }

    public void setCommissionDown(BigDecimal commissionDown) {
        this.commissionDown = commissionDown;
    }

    public int getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(int merchantId) {
        this.merchantId = merchantId;
    }

    public Boolean getUcell() {
        return this.id == 1000;
    }

    public Boolean getBeeline() {
        return this.id == 100;
    }

    public Boolean getWebmoney() {
        return this.id == 95;
    }

    public Boolean getQiwi() {
        return this.id == 96;
    }
}
