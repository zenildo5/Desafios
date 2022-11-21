public class Programa{
	
	public static void main(String[] args){
		
		Pessoa prof = new Professor("123456789","João","Portugues", 10000);
		Pessoa aluno = new Aluno("123456789","Pedro","A","Não");
		
		prof.Acao();
		aluno.Acao();
	}
}