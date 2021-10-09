package model.transaction;

import model.base.BaseModel;
import model.gateway.Gateway;
import model.merchant.Merchant;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

public class Transaction extends BaseModel {
    private boolean isChecked = false;
    private boolean isSuccess = false;
    private boolean isProcessing = false;
    private String transactionAccount;
    private BigDecimal transactionAmount;
    private BigDecimal transactionAmountCurrency;
    private int statedId;
    private Gateway gateway;
    private Merchant merchant;
    private Date createdDate;
    private Date transactionDate;
    private TransactionState transactionState;

    public Transaction(String name,
                       boolean isChecked,
                       String transactionAccount,
                       BigDecimal transactionAmount,
                       BigDecimal transactionAmountCurrency,
                       int statedId,
                       Gateway gateway,
                       Merchant merchant,
                       Date createdDate,
                       Date transactionDate,
                       TransactionState transactionState) {
        super(name);
        this.isChecked = isChecked;
        this.transactionAccount = transactionAccount;
        this.transactionAmount = transactionAmount;
        this.transactionAmountCurrency = transactionAmountCurrency;
        this.statedId = statedId;
        this.gateway = gateway;
        this.merchant = merchant;
        this.createdDate = createdDate;
        this.transactionDate = transactionDate;
        this.transactionState = transactionState;
    }

    public Transaction(String name, UUID id) {
        super(name,id);
    }

    public String getTransactionAccount() {
        return transactionAccount;
    }

    public void setTransactionAccount(String transactionAccount) {
        this.transactionAccount = transactionAccount;
    }

    public BigDecimal getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(BigDecimal transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public BigDecimal getTransactionAmountCurrency() {
        return transactionAmountCurrency;
    }

    public void setTransactionAmountCurrency(BigDecimal transactionAmountCurrency) {
        this.transactionAmountCurrency = transactionAmountCurrency;
    }

    public int getStatedId(int value) {
        return statedId;
    }

    public void setStatedId(int statedId) {
        this.statedId = statedId;
    }

    public Gateway getGateway() {
        return gateway;
    }

    public void setGateway(Gateway gateway) {
        this.gateway = gateway;
    }

    public Merchant getMerchant() {
        return merchant;
    }

    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public TransactionState getTransactionState() {
        return transactionState;
    }

    public void setTransactionState(TransactionState transactionState) {
        this.transactionState = transactionState;
    }
    public boolean isChecked() {
      return statedId == TransactionState.CHECKED.getValue();
    }

    public boolean isProcessing() {
        return statedId == TransactionState.IN_PROCESS.getValue();
    }

    public boolean isSuccess() {
        return statedId == TransactionState.SUCCESS.getValue();
    }
    public void getAmountCurrency(Gateway gateway){
        this.transactionAmountCurrency = this.transactionAmount.subtract(transactionAmount.multiply(gateway.getCommissionDown().divide(BigDecimal.valueOf(100))));
    }


    public String getState() {
        String responseText = "";
        switch(statedId){
            case 1: responseText = "created"; break;
            case 2: responseText = "checked"; break;
            case 3: responseText = "check_Error"; break;
            case 4: responseText = "paying"; break;
            case 5: responseText = "in_process"; break;
            case 6: responseText = "pay_success"; break;
            default: return  "";

        }
        return responseText;
    }
}

