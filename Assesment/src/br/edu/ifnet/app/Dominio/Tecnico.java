package br.edu.ifnet.app.Dominio;

public class Tecnico extends Ocorrencia {
	
	
	private String funcaoTecnico=null;
	private String codigoTecnico=null;
	
	
	public Tecnico(String nomeTecnico) {
		this.nomeTecnico=nomeTecnico;
		
	}
	
	
	public String getFuncaoTecnico() {
		return funcaoTecnico;
	}
	public void setFuncaoTecnico(String funcaoTecnico) {
		this.funcaoTecnico = funcaoTecnico;
	}
	public String getCodigoTecnico() {
		return codigoTecnico;
	}
	public void setCodigoTecnico(String codigoTecnico) {
		this.codigoTecnico = codigoTecnico;
	}
	
	@Override
	public String toString(){
		return nomeTecnico + ";" + funcaoTecnico + ";" + codigoTecnico;		
	}
	@Override
	public void regOcorrencia() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void opcoesEquipamentos() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		
	}
	


}
