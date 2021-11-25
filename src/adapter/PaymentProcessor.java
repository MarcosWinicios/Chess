package adapter;

import java.math.BigDecimal;

public interface PaymentProcessor {
	
	void debitar(BigDecimal valor);	
	
	void creditar(BigDecimal valor);
}
