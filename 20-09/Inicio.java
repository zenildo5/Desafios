
import java.util.Scanner;

public class Inicio{
	
	public static void main(String[] args){
		
	    Usuario us = new Usuario();
		String nomeDigitado;
		String senhaDigitado;
		String opcaoMenu;
		Double salarioCalculado;
		
		Scanner entradaDados = new Scanner(System.in);
		
		System.out.println("Digite o Usuario");
		nomeDigitado = entradaDados.next();
		
		System.out.println("Digite a Senha");
		senhaDigitado = entradaDados.next();
		
	    //us.setNome(nomeDigitado);
		//us.setSenha(senhaDigitado);
		
		if(nomeDigitado.equals(us.getNome()) && senhaDigitado.equals(us.getSenha())){
			System.out.println("Digite 1 para o Gerente");
			System.out.println("Digite 2 para o Coordenador");
			
			opcaoMenu = entradaDados.next();
			
			switch(opcaoMenu){
				case "1" :
					Gerente g = new Gerente();
					System.out.println("Digite o nome:");
					g.setNome(entradaDados.next());
					
					System.out.println("Digite o cpf:");
					g.setCpf(entradaDados.next());
					
					System.out.println("Digite a qtde de horas: ");
					g.CalculaSalarioLiquido(Double.parseDouble(entradaDados.next()));
					
					System.out.println("Nome gerente: " + g.getNome());
					System.out.println("Cpf gerente: " + g.getCpf());
					
					System.out.println("Salário Gerente:" + g.getSalarioLiquido());
				break;
				
				case "2" :
				    Coordenador c = new Coordenador();
					System.out.println("Digite o nome: ");
					c.setNome(entradaDados.next());
					
				    System.out.println("Digite o cpf:");
					c.setCpf(entradaDados.next());
					
					System.out.println("Digite a qtde de horas: ");
					c.CalculaSalarioLiquido(Double.parseDouble(entradaDados.next()));
					
					System.out.println("Nome Coordenador: " + c.getNome());
					System.out.println("Cpf Coordenador: " + c.getCpf());
					System.out.println("Salario do coordenador: " + c.getSalarioLiquido());
					
				break;
				
				default:
					System.out.println("Opcao invalida");
					
			}
			
			
		}else{
			System.out.println("Nao te conheco");
		}
		
	}
	
}