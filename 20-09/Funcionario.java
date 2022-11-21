public class Funcionario{
	
	private String nome;
	private String cpf;
	private Double salarioLiquido;
	
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
		
	}
	
	public String getCpf(){
		return this.cpf;
	}
	
	public void setCpf(String cpf){
		this.cpf = cpf;
		
	}
	
	public Double getSalarioLiquido(){
		return this.salarioLiquido;
	}
		
	public void setSalarioLiquido(Double salarioLiquido){
		this.salarioLiquido = salarioLiquido;
		
	}
	
	public void CalculaSalarioLiquido(Double qtdHoras){
		setSalarioLiquido(qtdHoras * 10.0);
	}
	
}