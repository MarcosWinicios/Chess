package adapter;

import java.math.BigDecimal;

public class Client {
	public static void main(String[] args) {
		PaymentProcessor credit = new CreditPayment();
		credit.debitar(new BigDecimal("100"));
	}
}
