
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Inicio{
	
	public static void main(String[] args){
		
	    Usuario us = new Usuario();
		String nomeDigitado;
		String senhaDigitado;
		String opcaoMenu;
		Double salarioCalculado;
		Boolean continuar = true;
		Integer indice = 0;
		Scanner entradaDados = new Scanner(System.in);
		
		System.out.println("Digite o Usuario");
		nomeDigitado = entradaDados.next();
		
		System.out.println("Digite a Senha");
		senhaDigitado = entradaDados.next();
		
	    //us.setNome(nomeDigitado);
		//us.setSenha(senhaDigitado);
		
		if(nomeDigitado.equals(us.getNome()) && senhaDigitado.equals(us.getSenha())){
			
			ArrayList<Gerente> listaGerente = new ArrayList<>();
			ArrayList<Coordenador> listaCoordenador = new ArrayList<>();
			
			while(continuar){
				System.out.println();
				System.out.println("Digite 1 para o Gerente");
				System.out.println("Digite 2 para o Coordenador");
				System.out.println("Digite 3 para SAIR");
				
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
						
						listaGerente.add(g);
						
						System.out.println();
						System.out.println("Lista gerente:");
						
						for(Gerente item : listaGerente){
							System.out.println("Nome: " + item.getNome());
							System.out.println("Cpf: " + item.getCpf());					
							System.out.println("Salario: " + item.getSalarioLiquido());
							System.out.println();
						}
						
					break;
					
					case "2" :
						Coordenador c = new Coordenador();
						System.out.println("Digite o nome: ");
						c.setNome(entradaDados.next());
						
						System.out.println("Digite o cpf:");
						c.setCpf(entradaDados.next());
						
						System.out.println("Digite a qtde de horas: ");
						c.CalculaSalarioLiquido(Double.parseDouble(entradaDados.next()));
						
						listaCoordenador.add(c);
						System.out.println();
						System.out.println("Lista coordenador:");
						for(Coordenador item : listaCoordenador){
							System.out.println("Nome: " + item.getNome());
							System.out.println("Cpf: " + item.getCpf());					
							System.out.println("Salario: " + item.getSalarioLiquido());
							System.out.println();
						}
						
					break;
					
					case "3" :
						continuar = false;
						
					break;
					default:
						System.out.println("Opcao invalida");						
				}
			}
			
			
		}else{
			System.out.println("Nao te conheco");
		}
		
	}
	
}