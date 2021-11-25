package strategy;

public class Programa {
   public static void main(String[] args) {
	   int distancia = 100; //Distância fornecida pelo usuario
	   int opcaoFrete = 2; //Opção de frete escolhida pelo usuario
	   
	   TipoFrete tipoFrete = TipoFrete.values()[opcaoFrete -1];
	   
	   Frete frete =  tipoFrete.obterFrete();
	   double preco = frete.calcularPreco(distancia);
	   System.out.printf("O valor total é de R$%.2f", preco);
  }	
}
