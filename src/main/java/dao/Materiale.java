package dao;

public class Materiale {
	
	private String tipo;
	
	
	
	public String getTipo() {
		return tipo;
	}
	
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	
	
	
	
	
	
	public Materiale(String tipo) {
		
		this.tipo = tipo;
	}


	@Override
	public String toString() {
		return "Materiale [tipo=" + tipo + "]";
	}


	
	


	
}
	
	
	
	
	
	
	
	
	

