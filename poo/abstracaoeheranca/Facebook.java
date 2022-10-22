package poo.abstracaoeheranca;

public class Facebook extends EnvioDeMensagemInstantanea {

    @Override
    public void enviarMensagem() {
    System.out.println("ENVIANDO MENSAGEM PELO FACEBOOK");        
    }

    @Override
    public void receberMensagem() {
        System.out.println("RECEBENDO MENSAGEM PELO FACEBOOK");        
    }

    @Override
    protected void validarConectadoInternet() {
        super.validarConectadoInternet();
    }

    @Override
    public void salvarHistoricoDeMensagem() {
        
    }
    
}
