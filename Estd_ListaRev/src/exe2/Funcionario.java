package exe2;

import java.util.ArrayList;

public class Funcionario {
	
	//----------Attributes----------
	private String nome;
	private String turno;
	private int id;
	private ArrayList<Quadra> quadras = new ArrayList<>();
	
	//----------Methods----------
	public Quadra alugaQuadra(Quadra quadra) {
		return quadra;
	}
	
	//----------Getters and Setters----------
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTurno() {
		return turno;
	}
	
	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public ArrayList<Quadra> getQuadras() {
		return quadras;
	}
	
	public void setQuadras(ArrayList<Quadra> quadras) {
		this.quadras = quadras;
	}
	
}
