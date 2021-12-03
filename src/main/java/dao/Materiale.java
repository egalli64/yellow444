package dao;

public class Materiale {
	
	private String tipo;
	private int quantità;
	
	
	public String getTipo() {
		return tipo;
	}
	
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	public int getQuantità() {
		return quantità;
	}
	
	
	public void setQuantità(int quantità) {
		this.quantità = quantità;
	}
	
	
	public Materiale(String tipo, int quantità) {
		
		this.tipo = tipo;
		this.quantità = quantità;
	}
	
	
	
	public Materiale(int quantità) {
		
		this.quantità = quantità;
	}
	
	
	public Materiale(String tipo) {
		
		this.tipo = tipo;
	}


	@Override
	public String toString() {
		return "Materiale [tipo=" + tipo + ", quantità=" + quantità + "]";
	}


	
}
	
	
	
	
	
	
	
	
	

