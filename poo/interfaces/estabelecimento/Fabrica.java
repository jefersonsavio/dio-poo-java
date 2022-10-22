package poo.interfaces.estabelecimento;

import poo.interfaces.equipamentos.copiadora.Copiadora;
import poo.interfaces.equipamentos.copiadora.Xerox;
import poo.interfaces.equipamentos.digitalizadora.Digitalizadora;
import poo.interfaces.equipamentos.impressora.Impressora;
import poo.interfaces.equipamentos.multifuncional.Multifuncional;

public class Fabrica {
    
    public static void main(String[] args) {

        Multifuncional mf = new Multifuncional();
        Impressora impressora = mf;
        Digitalizadora digitalizadora = mf;
        Copiadora copiadora = mf;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
        

    }
}
