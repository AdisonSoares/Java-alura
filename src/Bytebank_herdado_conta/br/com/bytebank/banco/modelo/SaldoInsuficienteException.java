package Bytebank_herdado_conta.br.com.bytebank.banco.modelo;

public class SaldoInsuficienteException extends Exception{
	public SaldoInsuficienteException(String mensagem) {
		super(mensagem);
	}
}
