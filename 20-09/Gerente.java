public class Gerente extends Funcionario{
		private String regional;
		private Double metaRegional;
		
		
	public String getRegional(){
		return this.regional;
	}
	
	public void setRe(String regional){
		this.regional = regional;
		
	}
	
	public Double getMetaRegional(){
		return this.metaRegional;
	}
	
	public void setNome(Double metaRegional){
		this.metaRegional = metaRegional;
		
	}
	
	@Override
	public void CalculaSalarioLiquido(Double qtdHoras){
		Double valorHora = 60.0;
		Double salarioBruto = valorHora * qtdHoras;
		super.setSalarioLiquido(salarioBruto - (salarioBruto * 0.15));
		//return salarioBruto - (salarioBruto * 0.15);
	}
	

}