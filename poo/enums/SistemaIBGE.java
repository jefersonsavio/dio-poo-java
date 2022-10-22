package poo.enums;

/*
 * Enum, é um tipo especial de classe, onde os objetos são previamente criados, imutáveis e disponíveis por toda aplicação.
Usamos Enum, quando o nosso modelo de negócio contém objetos de mesmo contexto, que já existem de forma pré-estabelecida com a certeza de não haver tanta alteração de valores.

 */

public class SistemaIBGE {

	public static void main(String[] args) {
		for(EstadoBrasileiro e: EstadoBrasileiro.values()) {
			System.out.println("Estado: " + e.getNome() + " ,Sigla: " + e.getSigla() + " ,IBGE-CODIGO" + e.getIbge());
		}
		
		EstadoBrasileiro eb = EstadoBrasileiro.PIAUI;
		System.out.println();
		System.out.println("Estado: " + eb.getNome());
		System.out.println("Sigla" + eb.getSigla());
		System.out.println("Maiusculo:" + eb.getNomeMaiusculo());
		System.out.println("IBGE-CODIGO: " + eb.getIbge());
	}

}
