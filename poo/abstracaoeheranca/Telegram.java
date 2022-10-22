package poo.abstracaoeheranca;

public class Telegram extends EnvioDeMensagemInstantanea{

    @Override
    public void enviarMensagem() {
    System.out.println("ENVIANDO MENSAGEM PELO TELEGRAM");        
    }

    @Override
    public void receberMensagem() {
    System.out.println("RECEBENDO MENSAGEM PLEO TELEGRAM");        
    }

    @Override
    public void validarConectadoInternet() {
        super.validarConectadoInternet();
    }

    @Override
    public void salvarHistoricoDeMensagem() {
        
    }
    
}
