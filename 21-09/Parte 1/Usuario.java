public class Usuario{
	
	private String nome;
	private String senha;
	
	public String getNome(){
		this.nome = "atos";
		return this.nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void setSenha(String senha){
		this.senha = senha;
	}
	
	public String getSenha(){
		this.senha = "123";
		return this.senha;
	}
	
}