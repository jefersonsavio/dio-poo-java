package poo.heranca;

public class Carro extends Veiculo {
    
    public void ligar() {
		
		confereCombustivel();
		confereMarcha();
		System.out.println("Carro ligado!"); 
		
	}
	
	private void confereCombustivel() {
		System.out.println("conferindo combustivel");
	}
	
	private void confereMarcha() {
		System.out.println("Conferindo ponto morto");
		
	}
}
