package poo.abstracao;

public class MSNMessenger extends EnvioDeMensagemInstantanea {

    @Override
    public void enviarMensagem() {
System.out.println("ENVIANDO MENSAGEM PELO MESSENGER");        
    }

    @Override
    public void receberMensagem() {
    System.out.println("RECBENDO MENSAGEM PELO MESSENGER");        
    }
    
}
