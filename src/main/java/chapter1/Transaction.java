package chapter1;

import java.util.Currency;

/**
 * @author zhangqi
 * @date 2020/8/30 6:01 下午
 */
public class Transaction {

    private Integer price;

    private Currency currency;

    public Transaction(Integer price, Currency currency) {
        this.price = price;
        this.currency = currency;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
