public interface IFacadeJogoDamas {

	/**
	 * Apaga todos os dados do jogo.
	 */
	public void zerarJogo();

	/**
	 * Criar tabuleiro
	 *
	 * @param dimensao
	 *            Dimensao que o tabuleiro criado terá (Ex: para uma dimensao = 6 o tabuleiro terá 6 casas de largura x 6 casas de altura).
	 * 
	 * @throws DamasException
	 */
	public void criarTabuleiro(int dimensao) throws DamasException;

	/**
	* Realiza o movimento - jogada - de um respectivo jogador com os parâmetros passados
	*(Ex: numeroJogador = 1, linhaOrigem = B, colunaOrigem = 1, linhaDestino = C, colunaDestino = 2)
	*
	* @param numeroJogador
	*            Numero que indentifica o jogador que vai realizar o movimento (Ex: numeroJogador = 2)	
	* @param linhaOrigem
	*			 Linha de origem da peça que será movimentada (Ex: linhaOrigem = C)
	* @param colunaOrigem
	*  			 Coluna de origem da peça que será movimentada (Ex: colunaOrigem = 4)
	* @param linhaDestino
	*			 Linha de destino para onde a peça irá se movimentar (Ex: linhaDestino = D)
	* @param colunaDestino
	*			 Coluna de destino para onde a peça irá se movimentar (Ex: colunaDestino = 3)
	*             
	* @throws DamasException
	 */
	public void movimentoJogador(int numeroJogador, String linhaOrigem, int colunaOrigem, String linhaDestino, int colunaDestino) throws DamasException;

	/**
	* Verifica se a casa do tabuleiro está livre ou ocupada a partir das coordenadas
	* passadas (Ex: linha = B, coluna = 4).
	*
	* @param linha
	*            Letra que representa a linha do tabuleiro (Ex: B)	
	* @param coluna
	*            Número que representa a coluna do tabuleiro 
	* 
	* @throws DamasException
	 */
	public void isOcupada(String linha, int coluna)
			throws DamasException;

	/**
	 * Recupera e retorna um atributo da sala.
	 *
	 * @param idTabuleiro
	 *            Identificador do tabuleiro
	 * 
	 * @throws DamasException
	 */
	public String getDimensaoTabuleiro(String idTabuleiro)
			throws DamasException;

	/**
	 * O usuário pode adicionar eventos ao sistema. Cada evento possui um nome,
	 * datas de inicio e fim, um nome para contato e um numero de repetiçoes
	 * semanais
	 * 
	 * @param id
	 *            Identificador (unico) do evento.
	 * @param nome
	 *            Nome do evento.
	 * @param inicio
	 *            Data de inicio do evento.
	 * @param fim
	 *            Data de fim do evento.
	 * @param area
	 *            Area do conhecimento a qual o evento pertence.
	 * @param contato
	 *            Contato do responsavel pelo evento.
	 * @param repeticoes
	 *            Numero de repeticoes do evento.
	 * @throws RoomsAllocationException
	 */
	public void adicionarEvento(String id, String nome, String inicio,
			String fim, String area, String contato, int repeticoes)
			throws RoomsAllocationException;

	/**
	 * O usuário pode adicionar eventos ao sistema. Cada evento possui um nome,
	 * datas de inicio e fim e um nome para contato.
	 * 
	 * @param id
	 *            Identificador (unico) do evento.
	 * @param nome
	 *            Nome do evento.
	 * @param inicio
	 *            Data de inicio do evento.
	 * @param fim
	 *            Data de fim do evento.
	 * @param area
	 *            Area do conhecimento a qual o evento pertence.
	 * @param contato
	 *            Contato do responsavel pelo evento.
	 * 
	 * @throws RoomsAllocationException
	 */
	public void adicionarEvento(String id, String nome, String inicio,
			String fim, String area, String contato)
			throws RoomsAllocationException;

	/**
	 * 
	 * Recupera e retorna um atributo de um evento.
	 * 
	 * @param idEvento
	 *            Identificador do evento.
	 * @param atributo
	 *            Atributo procurado.
	 * @return O atributo.
	 * 
	 * @throws RoomsAllocationException
	 */
	public Object getAtributoEvento(String idEvento, String atributo)
			throws RoomsAllocationException;

	/**
	 * Deve-se alocar uma sala para um evento (repetitivo ou não). O sistema
	 * deve informar as salas disponíveis que satisfaçam as restrições do
	 * evento.
	 * 
	 * @param idEvento
	 *            Identificador do evento.
	 * @param idSala
	 *            Identificador da sala onde o evento devera ocorrer.
	 * @throws RoomsAllocationException
	 */
	public void alocarEvento(String idEvento, String idSala)
			throws RoomsAllocationException;

	/**
	 * O usuário pode localizar um evento escalonado através do nome, contato,
	 * data etc. 
	 * Ao utilizar o contato como atributo de busca, deve ser retornado todos 
	 * os eventos que contenham o nome do contato inserido. (Exemplo: Prof Pedro e Pedro
	 * Silva contém Pedro) [Formato:LAB-03:EV-09, SA-01:EV-01]
	 * 
	 * @param atributo
	 *            Nome do atributo do evento (nome, contato, horario etc).
	 * @param valor
	 *            Valor do atributo do evento.
	 * @return O identificador do evento, se algum evento com esse atributo for
	 *         encontrado. Valores múltiplos são esperados quando mais de um 
	 * 	   evento for localizado [Formato:LAB-03:EV-09, SA-01:EV-01]
	 * @throws RoomsAllocationException
	 */
	public String localizarEvento(String atributo, String valor)
			throws RoomsAllocationException;

	/**
	 * Desaloca um evento previamente alocado para uma sala.
	 * 
	 * @param idEvento
	 *            Identificador do evento a desalocar.
	 * 
	 * @throws RoomsAllocationException
	 */
	public void desalocarEvento(String idEvento)
			throws RoomsAllocationException;

	/**
	 * O usuário pode cancelar um evento. Neste caso, o cancelamento remove o
	 * evento da base de dados e desvincula as possíveis alocações previamente
	 * computadas.
	 * 
	 * @param idEvento
	 *            Identificador do evento a cancelar.
	 * @throws RoomsAllocationException
	 */
	public void cancelarEvento(String idEvento) throws RoomsAllocationException;

	/**
	 * O usuário pode remover salas do sistema. A remoçao de uma sala também
	 * remove as possíveis alocações que referem a mesma, mas não exclui os
	 * respectivos eventos da base de dados.
	 * 
	 * @param idSala
	 *            Identificador da sala.
	 * @throws RoomsAllocationException
	 */
	public void removerSala(String idSala) throws RoomsAllocationException;

}