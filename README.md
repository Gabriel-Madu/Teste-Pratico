# Teste-Pratico

### Instruções de execução do programa
- No terminal, compile os arquivos utilizando o comando: javac Main.java SistemaDeNotas.java Aluno.java
- Execute o programa utilizando o comando: java Main
- Insira os dados requeridos pelo programa

  Exemplo: 

    João 7 8 6 9 10 80%

    Maria 7 9 4 5 7 70%
- Para encerrar o programa, aperte 'Enter' duas vezes

### Premissas assumidas
**Notas e frequência**
- As notas podem ser inteiras ou pontos flutuantes de 0 a 10
- A frequência é uma porcentagem, que pode ser escrita com o símbolo '%'
**Formato da entrada**
- Cada entrada deve conter exatamente o nome do aluno, cinco notas, e uma frequência
- A entrada é finalizada por uma linha em branco
**Quantidade de disciplinas**
- Assume-se que todos os alunos possuem notas para todas as cinco disciplinas.

### Decisões de projeto
O programa é dividido em três classes: Main, SistemaDeNotas e Aluno
- A classe Aluno contém as informações do aluno e calcula a média das notas
- A classe SistemaDeNotas contém a lista de alunos e calcula a média da turma, além de verificar alunos acima/abaixo da média e se estão frequentes/infrequentes
- A classe Main é responsável pela interação com o usuário, com a entrada de dados e a relação com as duas classes descritas acima
