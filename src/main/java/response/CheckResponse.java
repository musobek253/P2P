package response;

import model.transaction.Transaction;
import model.transaction.TransactionState;

public class CheckResponse implements BaseCheckResponse{
    @Override
    public boolean success(Transaction transaction) {
        transaction.getStatedId(TransactionState.CHECKED.getValue());
        System.out.println("Transaction is checked");
        return true;
    }

    @Override
    public boolean error(Transaction transaction) {
        transaction.getStatedId(TransactionState.CHECK_ERROR.getValue());
        System.out.println("transaction is not checked");
        return false;
    }
}
