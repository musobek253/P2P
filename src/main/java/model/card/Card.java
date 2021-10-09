package model.card;

import model.base.BaseModel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Card  extends BaseModel {
    private String cardNumber;
    private String expiryDate;
    private CardType cardType;
    private BigDecimal balance;
    private String password;
    private List<UUID> userIds= new ArrayList<>(10);

    public Card(String name, UUID id) {
        super(name, id);
    }

    public Card(
            String name,
            UUID id,
            String cardNumber,
            String expiryDate,
            CardType cardType,
            BigDecimal balance,
            String password,
            UUID userId
    ) {
        super(name,id);
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cardType = cardType;
        this.balance = balance;
        this.password = password;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<UUID> getUserIds() {
        return userIds;
    }

    public void setUserIds(List<UUID> userIds) {
        this.userIds = userIds;
    }
}
