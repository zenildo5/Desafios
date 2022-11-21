public class Aluno extends Pessoa{
	String turma;
	String advertencia;
	
	public Aluno(String cpf, String nome, String turma, String advertencia){
		super(cpf,nome);
		this.turma = turma;
		this.advertencia = advertencia;
	}
	
	public void Acao(){
		System.out.println("Estudar");
	}
	
}