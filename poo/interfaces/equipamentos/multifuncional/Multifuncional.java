package poo.interfaces.equipamentos.multifuncional;

import poo.interfaces.equipamentos.copiadora.Copiadora;
import poo.interfaces.equipamentos.digitalizadora.Digitalizadora;
import poo.interfaces.equipamentos.impressora.Impressora;

public class Multifuncional implements Copiadora,Digitalizadora, Impressora {

    @Override
    public void copiar() {
        System.out.println("copiando via equipamento multifuncional");

    }

    @Override
    public void digitalizar() {
        System.out.println("digitalizando via equipamento multifuncional");
        
    }

    @Override
    public void imprimir() {
        System.out.println("imprimindo via equipamento multifuncional");        
        
    }
    
}
