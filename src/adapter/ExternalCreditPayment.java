package adapter;

import java.math.BigDecimal;

public class ExternalCreditPayment {
	public void authorize(BigDecimal valor) {
		System.out.println("Autorizar cobrança de R$: " + valor);
	}
	
	public void capture(BigDecimal valor) {
		System.out.println("Realizar cobrança de R$: " + valor);
	}
	
	public void credit(BigDecimal valor) {
		System.out.println("Creditar valor de: " + valor);
	}
}
