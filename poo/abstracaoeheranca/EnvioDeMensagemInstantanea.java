package poo.abstracaoeheranca;

public abstract class EnvioDeMensagemInstantanea {
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	public abstract void salvarHistoricoDeMensagem();

	protected void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}	
	    
}


