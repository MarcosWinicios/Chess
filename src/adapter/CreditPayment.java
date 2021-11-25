package adapter;

import java.math.BigDecimal;

public class CreditPayment implements PaymentProcessor {
	ExternalCreditPayment paymentAPI = new ExternalCreditPayment();
	
	@Override
	public void debitar(BigDecimal valor) {
		paymentAPI.authorize(valor);
		paymentAPI.capture(valor);
		
	}

	@Override
	public void creditar(BigDecimal valor) {
		paymentAPI.credit(valor);
	}
}
