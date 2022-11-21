public class Coordenador extends Funcionario{
	private String loja;
	private Double metaloja;
		
		
	public String getloja(){
		return this.loja;
	}
	
	public void setRe(String loja){
		this.loja = loja;
		
	}
	
	public Double getMetaloja(){
		return this.metaloja;
	}
	
	public void setNome(Double metaloja){
		this.metaloja = metaloja;
	}
	
	@Override
	public void CalculaSalarioLiquido(Double qtdHoras){
		Double valorHora = 40.0;
		Double salarioBruto = valorHora * qtdHoras;
		super.setSalarioLiquido(salarioBruto - (salarioBruto * 0.07));
		//return salarioBruto - (salarioBruto * 0.07);
	}

}