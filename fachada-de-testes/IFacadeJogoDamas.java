package br.edu.ifpb.padroes.dama.teste;

public class Fachada implements IFacadeJogoDamas {

	public void zerarJogo() {

	}

	public void criarTabuleiro(String idTabuleiro, int dimensao) throws DamasException {

	}

	public void regraMovimento(String idRegraMovimento, boolean comerVoltando) throws DamasException {

	}

	public void regraSopro(String idRegraSopro, boolean permitirSopro) throws DamasException {

	}

	public void iniciarPartida(String idPartida, String idTabuleiro, String jogadorUm, String jogadorDois,
			int jogadorPedraBranca, String idRegraMovimento, String idRegraSopro) throws DamasException {

	}

	public String getCorCasa(String idTabuleiro, int linha, String coluna) throws DamasException {
		return null;
	}

	public String getCorPeca(String idTabuleiro, int linha, String coluna) throws DamasException {
		return null;
	}

	public boolean isOcupada(String idPartida, int linha, String coluna) throws DamasException {
		return false;
	}

	public void posicionarPeca(String idPartida, int cor, String linha, int coluna) throws DamasException {

	}

	public void movimentoJogador(int numeroJogador, int linhaOrigem, String colunaOrigem, int linhaDestino,
			String colunaDestino) throws DamasException {

	}

	public int getDimensaoTabuleiro(String idTabuleiro) throws DamasException {
		return 0;
	}

	public void limparTabuleiro(String idPartida) {

	}

	public void getNomeJogador(int numeroJogador) throws DamasException {

	}

}