package strategy;

import strategy.frete.Correios;
import strategy.frete.Sedex;

public enum TipoFrete {
	CORREIOS {
		@Override
		public Frete obterFrete() {
			return new Correios();
		}
	}, 
	SEDEX {
		@Override
		public Frete obterFrete() {
			return new Sedex();
		}
	};
	
	public abstract Frete obterFrete();
}
