package br.edu.univas.vo;

public class ContaPoupanca extends Conta{
	
	private float taxaJuros;
	

	public ContaPoupanca(int numero, Cliente cliente, float taxaManutencao, int chequeEsp) {
		super(numero, cliente);
	}

	@Override
	public void atualizarSaldo() {
		setSaldo(getSaldo() + (taxaJuros / 100));
		
	}
	@Override
	public boolean sacar(float valorSaque) {
		if (getSaldo() >= valorSaque) {
			setSaldo(getSaldo() - valorSaque);
			return true;
		}
		return false;
	}
	@Override
	public boolean depositar(float valorDeposito) {
		setSaldo(getSaldo() + valorDeposito);
		return false;
	}
	@Override
	public boolean transferenciaEletronica(Conta contaDestino, float valorTransferencia) {
		if (getSaldo() >= valorTransferencia) {
			float saldoAtualizado = getSaldo() - valorTransferencia;
			setSaldo(saldoAtualizado);
			contaDestino.depositar(valorTransferencia);
			return true;
		}
		return false;
	}


	public float getTaxaJuros() {
		return taxaJuros;
	}


	public void setTaxaJuros(float taxaJuros) {
		this.taxaJuros = taxaJuros;
	}



}
