package oo.heranca.desafio;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro corolla = new Corolla();
		Carro palio = new Palio();
		palio.nome = "palio";
		corolla.nome = "corolla";
		
		
		System.out.println(corolla.velAtual);
		System.out.println(palio.velAtual);
		corolla.acelerar();
		palio.acelerar();
		palio.acelerar();
		
		System.out.println("O corolla acelera " + corolla.velAtual+ "km/h");
		System.out.println("O palio acelera " + palio.velAtual+ "km/h");
		
		palio.frear();
		palio.frear();
		
		corolla.frear();
		corolla.frear();
		corolla.frear();
		corolla.frear();
		
		corolla.acelerar();
		corolla.acelerar();
		corolla.acelerar();
		corolla.acelerar();
		
		
		
		System.out.println(corolla);
	
	}

}
