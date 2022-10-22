package poo.abstracao;

public class Telegram extends EnvioDeMensagemInstantanea{

    @Override
    public void enviarMensagem() {
    System.out.println("ENVIANDO MENSAGEM PELO TELEGRAM");        
    }

    @Override
    public void receberMensagem() {
    System.out.println("RECEBENDO MENSAGEM PLEO TELEGRAM");        
    }
    
}
