package service;

import com.oracle.jrockit.jfr.UseConstantPool;
import model.authorization.User;
import model.card.Card;
import service.base.BaseService;

import java.util.ArrayList;
import java.util.UUID;

public class CardService extends BaseService {
    ArrayList<Card> cards =new ArrayList<Card>();

    @Override
    public boolean add(Object object, Object object1) {
     Card newCard = (Card) object;

    }

    @Override
    public boolean add(Object object) {
        return false;
    }

    @Override
    public boolean edit(Object object) {
        return false;
    }

    @Override
    public boolean delete(Object object) {
        return false;
    }

    @Override
    public void list() {

    }

    @Override
    public void list(Object object) {

    }
    public Card findCard(Card newCard){
        Card oldCard = null;
        for (Card card: cards)
            if(card != null)
                if(card.getCardNumber().equals(newCard.getCardNumber()))
                    oldCard = card;
        return oldCard;        
    }
    public Card findCard(UUID cardId){
        Card oldCard = null;
        for (Card card : cards)
            if(card != null)
                if(cardId == card.getId())
                    oldCard = card;
                
        return oldCard;        
    }

}
