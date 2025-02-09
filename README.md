# Sistema de Xadrez em Java

Este projeto é uma implementação complexa de um jogo de xadrez em Java, utilizando diversos conceitos avançados da linguagem, como Programação Orientada a Objetos (POO), comportamento da memória, enumerações, composições, tratamento de exceções e outras tecnologias relacionadas. O sistema simula um tabuleiro de xadrez com todas as regras e movimentações das peças, garantindo a lógica e a integridade do jogo.

## Estrutura do Projeto

O projeto é organizado em várias classes, cada uma responsável por uma parte específica do jogo. Abaixo está a descrição das principais classes e seus papéis:

### Classes Principais

1. **Board**:
   - Representa o tabuleiro de xadrez, utilizando uma matriz para armazenar as peças.
   - Gerencia a lógica de movimentação e validação das jogadas.

2. **Piece**:
   - Classe abstrata que serve como base para todas as peças de xadrez.
   - Define métodos comuns, como verificação de movimentos válidos.

3. **ChessPiece**:
   - Classe abstrata que herda de `Piece` e representa uma peça de xadrez genérica.
   - Responsável por representar o movimento das peças
   - Verifica se há uma peça do oponente na posição designada

4. **Peças Específicas** (ex: `Pawn`, `Rook`, `Knight`, `Bishop`, `Queen`, `King`):
   - Classes que herdam de `ChessPiece` e implementam as regras específicas de movimentação de cada peça.

5. **Position**:
   - Representa uma posição no tabuleiro (linha e coluna).
   - Utilizada para identificar a localização das peças.

6. **Color**:
   - Enumerate que define as cores das peças (BRANCO e PRETO).

7. **ChessException**:
   - Classe de exceção personalizada para tratar jogadas inválidas ou fora das regras do jogo.

8. **ChessGame**:
   - Classe principal que gerencia o fluxo do jogo, alternando entre os jogadores e verificando condições de vitória.

9. **UI**:
   - Classe responsável por apresentar a interface vista pelo jogador com base na classe Board  

### Funcionalidades

- **Movimentação das Peças**:
  - Cada peça possui uma matriz de booleanos que define seus movimentos válidos.
  - O sistema valida se a jogada é permitida antes de executá-la.

- **Tratamento de Exceções**:
  - Jogadas inválidas são tratadas pela classe `ChessException`, garantindo que o jogo siga as regras.

- **Alternância de Turnos**:
  - O jogo alterna entre os jogadores BRANCO e PRETO após cada jogada válida.

- **Verificação de Fim de Jogo**:
  - O sistema verifica condições como xeque-mate e empate para encerrar o jogo.

## Como Executar o Projeto

1. **Pré-requisitos**:
   - Java Development Kit (JDK) instalado.
   - Ambiente de desenvolvimento ou terminal configurado para compilar e executar programas Java.

2. **Compilação e Execução**:
   - Navegue até o diretório do projeto.
   - Compile o código-fonte Java:
     ```bash
     javac *.java
     ```
   - Execute o programa:
     ```bash
     java Game
     ```

## Exemplo de Uso

1. **Iniciar o Jogo**:
   - O tabuleiro é exibido no terminal, com as peças em suas posições iniciais.

2. **Fazer uma Jogada**:
   - O jogador insere a posição de origem e a posição de destino da peça.
   - O sistema valida a jogada e atualiza o tabuleiro.

3. **Verificar Condições de Fim de Jogo**:
   - O sistema verifica se a jogada resultou em xeque-mate ou empate.
   - Caso positivo, o jogo é encerrado e o vencedor é declarado.

## Contribuição

Contribuições são bem-vindas! Se você deseja contribuir para este projeto, siga os passos abaixo:

1. Faça um fork do projeto.
2. Crie uma nova branch (`git checkout -b feature/nova-feature`).
3. Commit suas mudanças (`git commit -m 'Adicionando nova feature'`).
4. Push para a branch (`git push origin feature/nova-feature`).
5. Abra um Pull Request.

## Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## Contato

Se você tiver alguma dúvida ou sugestão, sinta-se à vontade para entrar em contato:

- **Nome**: [Adrian Rosselis Viana e Silva]
- **Email**: [adrianrosselis2017@gmail.com]
