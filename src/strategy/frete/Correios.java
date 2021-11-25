package strategy.frete;

import strategy.Frete;

public class Correios implements Frete{

	@Override
	public double calcularPreco(int distancia) {		
		return distancia * 145 + 12;
	}
}
