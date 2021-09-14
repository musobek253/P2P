package model.history;

import model.base.BaseModel;

import java.util.UUID;

public class History extends BaseModel {
 private UUID p2pId;
 private UUID paymentId;
 private UUID userId;

    public History(String name, UUID p2pId, UUID paymentId, UUID userId) {
        super(name);
        this.p2pId = p2pId;
        this.paymentId = paymentId;
        this.userId = userId;
    }

}
