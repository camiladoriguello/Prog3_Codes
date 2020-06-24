package br.edu.univas.vo;

public class ContaPoupanca extends Conta {
	
	private float taxaJuros;
	
	public ContaPoupanca(int numero, Cliente cliente, float taxaManutencao, int chequeEsp) {
		super(numero, cliente);
	}

	public float getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(float taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	@Override
	public boolean sacar(float valor) {
		if (getSaldo() >= valor) { // se o valor passado for < valor na conta
			setSaldo(getSaldo() - valor); // abaixa o valor em conta
			return true; //pode sacar
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
		if(getSaldo() >= valor) {
			float valorAtualizado = getSaldo() - valor;
			setSaldo(valorAtualizado);
			contaDestino.depositar(valor);
			return true;
		}
		return false;
	}

	@Override
	public void atualizarSaldo() { //inserir valor da taxa de juros
		setSaldo(getSaldo() + (taxaJuros / 100));
	}
}
