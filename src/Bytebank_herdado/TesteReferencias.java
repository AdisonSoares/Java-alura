package Bytebank_herdado;

public class TesteReferencias {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		EditorVideo editorVideo = new EditorVideo();
		Designer designer = new Designer();
		ControleBonificacao controleBonificacao = new ControleBonificacao();
		
		gerente.setNome("Adriana Silva");
		gerente.setSalario(5000.0);
		controleBonificacao.registra(gerente);
		
		editorVideo.setNome("Alice Miranda");
		editorVideo.setSalario(2500.0);
		controleBonificacao.registra(editorVideo);
		
		designer.setNome("Bruna Santos");
		designer.setSalario(2000.0);
		controleBonificacao.registra(designer);
		
		System.out.println("Valor total da bonificação: R$"+controleBonificacao.getSoma());
	}
}
