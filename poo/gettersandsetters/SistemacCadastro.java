package poo.gettersandsetters;

public class SistemacCadastro {

    public static void main(String[] args) {
		//criamos um objeto pessoa no sistema
		Pessoa marcos = new Pessoa("123", "marcos");
		
		// definimos o endereço
		marcos.setEndereco("rua das marias");
		
		//como definimos nome e cpf marcos
		
		System.out.println(marcos.getNome() + "--" +  marcos.getCpf());
	}

    
}
