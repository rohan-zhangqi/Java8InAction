package chapter1.example5.transaction;

import java.util.*;

import static java.util.stream.Collectors.groupingBy;

/**
 * @author zhangqi
 * @date 2020/8/30 6:03 下午
 */
public class TransactionFilterByCurrencies {

    public static void main(String[] args) {
        List<Transaction> transactions = new ArrayList<>();

        Transaction a = new Transaction(2000, Currency.getInstance(Locale.CHINA));
        Transaction a1 = new Transaction(1000, Currency.getInstance(Locale.CHINA));
        Transaction b = new Transaction(2000, Currency.getInstance(Locale.UK));
        Transaction b1 = new Transaction(500, Currency.getInstance(Locale.UK));
        Transaction c = new Transaction(2000, Currency.getInstance(Locale.FRANCE));
        Transaction c1 = new Transaction(5000, Currency.getInstance(Locale.FRANCE));
        Transaction d = new Transaction(2000, Currency.getInstance(Locale.US));
        Transaction d1 = new Transaction(1000, Currency.getInstance(Locale.US));

        transactions.add(a);
        transactions.add(a1);
        transactions.add(b);
        transactions.add(b1);
        transactions.add(c);
        transactions.add(c1);
        transactions.add(d);
        transactions.add(d1);


        Map<Currency,List<Transaction>> transactionsByCurrencies = transactions.stream()
                .filter((Transaction t) -> t.getPrice() > 1000)
                .collect(groupingBy(Transaction::getCurrency));

        transactionsByCurrencies.forEach((key, value) -> {
            System.out.println(key + ":" + value);
        });
    }
}
