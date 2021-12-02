package dao;

public class Firm {
    private int id;
    private String name;
    private double longitudine;
    private double latitudine;
    private String password;

    public double getLongitudine() {
		return longitudine;
	}

	public void setLongitudine(double longitudine) {
		this.longitudine = longitudine;
	}

	public double getLatitudine() {
		return latitudine;
	}

	public void setLatitudine(double latitudine) {
		this.latitudine = latitudine;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Firm() {
    }

    public Firm(String name) {
        this(0, name);
    }

    public Firm(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    

    public Firm(String name, double longitudine, double latitudine, String password) {
		this (0,name, longitudine, latitudine, password);
	}

	public Firm(int id, String name, double longitudine, double latitudine, String password) {
	
		this.id = id;
		this.name = name;
		this.longitudine = longitudine;
		this.latitudine = latitudine;
		this.password = password;
	}

	public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	@Override
	public String toString() {
		return "Firm [id=" + id + ", name=" + name + ", longitudine=" + longitudine + ", latitudine=" + latitudine
				+ ", password=" + password + "]";
	}

   
   
}