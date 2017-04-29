package fachada;

public interface IFacadeJogoDamas {

	/**
	 * Apaga todos os dados do jogo.
	 */
	public void zerarJogo();

	/**
	 * Criar tabuleiro
	 *
	 * @param dimensao
	 *            Dimensao que o tabuleiro criado ter� (Ex: para uma dimensao =
	 *            6 o tabuleiro ter� 6 casas de largura x 6 casas de altura).
	 * 
	 * @throws DamasException
	 */
	public void criarTabuleiro(int dimensao) throws DamasException;

	/**
	 * Realiza o movimento - jogada - de um respectivo jogador com os par�metros
	 * passados (Ex: numeroJogador = 1, linhaOrigem = B, colunaOrigem = 1,
	 * linhaDestino = C, colunaDestino = 2)
	 *
	 * @param numeroJogador
	 *            Numero que indentifica o jogador que vai realizar o movimento
	 *            (Ex: numeroJogador = 2)
	 * @param linhaOrigem
	 *            Linha de origem da pe�a que ser� movimentada (Ex: linhaOrigem
	 *            = C)
	 * @param colunaOrigem
	 *            Coluna de origem da pe�a que ser� movimentada (Ex:
	 *            colunaOrigem = 4)
	 * @param linhaDestino
	 *            Linha de destino para onde a pe�a ir� se movimentar (Ex:
	 *            linhaDestino = D)
	 * @param colunaDestino
	 *            Coluna de destino para onde a pe�a ir� se movimentar (Ex:
	 *            colunaDestino = 3)
	 * 
	 * @throws DamasException
	 */
	public void movimentoJogador(int numeroJogador, String linhaOrigem, int colunaOrigem, String linhaDestino,
			int colunaDestino) throws DamasException;

	/**
	 * Verifica se a casa do tabuleiro est� livre ou ocupada a partir das
	 * coordenadas passadas (Ex: linha = B, coluna = 4).
	 *
	 * @param linha
	 *            Letra que representa a linha do tabuleiro (Ex: B)
	 * @param coluna
	 *            N�mero que representa a coluna do tabuleiro
	 * 
	 * @throws DamasException
	 */
	public void isOcupada(String linha, int coluna) throws DamasException;

	/**
	 * Recupera e retorna um atributo da sala.
	 *
	 * @param idTabuleiro
	 *            Identificador do tabuleiro
	 * 
	 * @throws DamasException
	 */
	public String getDimensaoTabuleiro(String idTabuleiro) throws DamasException;

}