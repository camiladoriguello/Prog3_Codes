package br.edu.univas.vo;

public class ContaCorrente extends Conta{

	private float taxaManutencao;
	private int chequeEspecial;
	
	public ContaCorrente(int numero, Cliente cliente, float taxaManutencao, int chequeEspecial) {
		super(numero, cliente);
		this.taxaManutencao = taxaManutencao;
		this.chequeEspecial = chequeEspecial;
	}

	public float getTaxaManutencao() {
		return taxaManutencao;
	}

	public void setTaxaManutencao(float taxaManutencao) {
		this.taxaManutencao = taxaManutencao;
	}

	public int getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(int chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}

	@Override
	public boolean sacar(float valor) {
		if(getSaldo() + chequeEspecial >= valor) {
			setSaldo(getSaldo() - valor);
			return true;
		}
		return false;
	}

	@Override
	public boolean depositar(float valor) {
		setSaldo(getSaldo() + valor);
		return false;
	}

	@Override
	public boolean transferenciaEletronica(Conta contaDestino, float valor) {
		if(getSaldo() + chequeEspecial >= valor) {
			float valorAtualizado = getSaldo() - valor;
			setSaldo(valorAtualizado);
			contaDestino.depositar(valor);
			return true;
		}
		return false;
	}

	@Override
	public void atualizarSaldo() {
		setSaldo(getSaldo() - taxaManutencao);
		
	}
}
