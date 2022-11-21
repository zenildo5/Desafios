public class Professor extends Pessoa{
	
	String disciplina;
	int salario;
	
	public Professor(String cpf, String nome, String disciplina, int salario){
		super(cpf,nome);
		
		this.disciplina = disciplina;
		this.salario = salario;
	}
	
	public void Acao(){
		System.out.println("Ensinar");
	}
}