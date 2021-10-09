package response;

import model.transaction.Transaction;

public interface BaseCheckResponse {
    default void checkResponse(Transaction transaction,Boolean transactionError){
        if (transactionError)
            error(transaction);
        else
            success(transaction);
    }
    boolean success(Transaction transaction);
    boolean error(Transaction transaction);
}
