package oo.composicao;

public class CarroTeste {
	
	public static void main(String[] args) {

        Carro c1 = new Carro();

        System.out.println("Está ligado? "+ c1.estaLigado());

        c1.ligar();

        System.out.println("Está ligado? "+ c1.estaLigado());

        System.out.println( c1.motor.giros());

        c1.acelerar();

        System.out.println( c1.motor.giros());

        c1.frear();

        System.out.println( c1.motor.giros());
    }
}
