package generics;

public class CaixaObjetoTeste {
	
	public static void main(String[] args) {
		CaixaObjeto caixa = new CaixaObjeto();
		caixa.guardar(2.3);
		
		//Integer coisa = (Integer) caixa.abrir();
		//Cast insucedido, o valor 2,3 não pode ser passado para inteiro
		
		caixa.limparCaixa();
		caixa.guardar(7);
		System.out.println();
	}
}