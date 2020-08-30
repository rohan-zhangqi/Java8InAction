package chapter1;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

/**
 * @author zhangqi
 * @date 2020/8/30 6:03 下午
 */
public class TransactionFilterByCurrencies {

    public static void main(String[] args) {
        List<Transaction> transactions = new ArrayList<>();

        Transaction a = new Transaction(2000, Currency.getInstance());

        Map<Currency,List<Transaction>> transactionsByCurrencies = transactions.stream()
                .filter((Transaction t) -> t.getPrice() > 1000)
                .collect(groupingBy(Transaction::getCurrency));
    }
}
