package dao;

public class DomandaOfferta {

	int quantità;
	boolean scarto;
	int aziendaId;
	int materialeId;
	

	public DomandaOfferta(int quantità, boolean scarto, int aziendaId, int materialeId) {
		super();
		this.quantità = quantità;
		this.scarto = scarto;
		this.aziendaId = aziendaId;
		this.materialeId = materialeId;
	}

	public int getAziendaId() {
		return aziendaId;
	}

	public void setAziendaId(int aziendaId) {
		this.aziendaId = aziendaId;
	}

	public int getMaterialeId() {
		return materialeId;
	}

	public void setMaterialeId(int materialeId) {
		this.materialeId = materialeId;
	}

	public int getQuantità() {
		return quantità;
	}

	public void setQuantità(int quantità) {
		this.quantità = quantità;
	}

	public boolean isScarto() {
		return scarto;
	}

	public void setScarto(boolean scarto) {
		this.scarto = scarto;
	}

	@Override
	public String toString() {
		return "DomandaOfferta [quantità=" + quantità + ", scarto=" + scarto + "]";
	}

	public DomandaOfferta(int quantità) {

		this.quantità = quantità;
	}

	public DomandaOfferta(boolean scarto) {

		this.scarto = scarto;
	}

	public DomandaOfferta(int quantità, boolean scarto) {

		this.quantità = quantità;
		this.scarto = scarto;
	}

	public DomandaOfferta() {

	}

}
