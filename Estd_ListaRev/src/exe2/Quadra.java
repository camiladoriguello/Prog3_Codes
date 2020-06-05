package exe2;

public class Quadra {

	//----------Attributes----------
	private int cod;
	private String apelido;
	private Socio socio;
	
	//----------Methods----------
	public boolean estaAlugada() {
		return true;
	}

    //----------Getters and Setters----------
	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public Socio getSocio() {
		return socio;
	}

	public void setSocio(Socio socio) {
		this.socio = socio;
	}
	
	
	
}
