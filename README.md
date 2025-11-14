Exercicio 1 - Bootcampo Java Starter

- 1 - Crie um programa que leia um número e mostre o dobro e o triplo dele.
- 2 - Faça um programa que lê dois números e exibe a soma dos números informados.
- 3 - Faça um programa que ler dois números e exibe o maior número.
- 4 - Faça um programa de calculadora, o usuário deve digitar o primeiro número, depois o sinal referente ao 
cálculo matemático (+ - * /) e o segundo número, após os três inputs, deve fazer o cálculo dos valores informados 
baseado no sinal informado no segundo input.
- 5 - Calcular a média de duas notas
- 6 - Converter idade em meses
- 7 - Programa que receba um número e faça o decremento do valor e exiba o resultado.
- 8 - Programa que leia dois número, a primeira entrada precisa ser incrementado com o valor informando na segunda entrada.
- 9 - Programa que lê dois número, a primeira entrada precisa ser multiplicado com o valor informando na segunda entrada.
- 10 - Programa que lê um número e diga se é positivo ou negativo.
- 11 - Programa que lê uma idade e diga se é maior de idade ou menor de idade.
- 12 - Programa que lê 4 notas, calcula a média do aluno e diga se ele está aprovado ou reprovado, neste caso a
média precisa ser 7 para ser aprovado.
- 13 - Programa que lê o dia da semana (terca/quarta/quinta) e diga se é o primeiro dia da semana, segundo dia, terceiro dia.
- 14 - Programa que lê um número e diga qual é o mês referente a este número.
- 15 - Faça um programa que seja o cardápio de um restaurante, o usuário escolhe o produto e ao final mostre o total do pedido.
- 16 - Programa que faça a leitura de um formulario de cadastro de pessoas, e a partir das respostas, diga qual é o sexo da pessoa, 
se é maior ou menor de idade.
- 17 - Faça um programa que faça o cadastro de um usuário (nome, usuario, login, senha) e depois ele possa fazer login com usuario cadastrado.
- 18 - Criar um programa em Java que simule um menu de autoatendimento para uma clínica médica, onde o paciente pode escolher uma das opções do menu digitando um número.

Exercicio 2 - Bootcampo Java Starter

1. Gerenciamento de Produtos (Encapsulamento + Objetos)

Descrição: Crie uma classe Produto com atributos nome, preco e quantidadeEstoque.

Implemente métodos para:
    - Exibir informações do produto
    - Adicionar e remover estoque
    - Calcular o valor total em estoque (preco * quantidadeEstoque)

---------------
2. Sistema de Vendas (Herança + Polimorfismo)

Descrição: Crie uma hierarquia de classes:

Implemente:
    - Classe Venda (classe base)
    - Classe VendaAvista e VendaParcelada (herdam de Venda)
    - Cada classe deve ter o método calcularTotal(), mas com comportamentos diferentes:
        À vista → aplica desconto
        Parcelada → aplica juros

---------------
3. Aplicativo de Mensagens (Polimorfismo)

Descrição: Crie uma interface Mensagem com o método enviar().

Implemente as classes:
    - Email
    - SMS
    - WhatsApp

Cada uma exibe o envio de uma mensagem de forma diferente.

Desafio extra:
    Crie uma classe Notificador com um método enviarMensagem(Mensagem msg) para demonstrar o polimorfismo.

---------------
4. Conta Bancária (Herança + Encapsulamento)

Descrição: Crie uma classe base Conta com atributos numero, titular e saldo.
Depois crie:
    - ContaCorrente → aplica taxa de operação
    - ContaPoupanca → rende juros mensais

Implemente métodos:
    - depositar()
    - sacar()
    - exibirSaldo()

---------------
5. Gerenciador de Alunos (Encapsulamento + Listas)

Descrição: Crie uma classe Aluno com atributos nome, matricula e nota.
Adicione métodos para:
    - exibirInformacoesDoAluno()
    - verificarAprovacao() (media >= 7)
    - adicionarNotas(double nota1, double nota2, double nota3, double nota4)

---------------
6. Sistema de Pedido de Restaurante (Classes + Objetos)

Descrição: Sistema para gerenciar pedidos
Crie classes:
    - Pedido (numero do pedido, data do pedido, )
    - Item (tem descricao, quantidade, precoUnitario)
    - Na classe Pedido deve ter um atributo do tipo Item com os dados dos itens do pedido
    - Implemente um método para calcular o total do pedido e exibir o resumo da compra.

---------------
🧪 Exercício: Mini sistema de notas (Alunos x Disciplinas)

Monte uma mini aplicação em Java que:
    - Exiba um menu de opções para o usuário
    - Permita cadastrar um aluno
    - Permita cadastrar uma disciplina
    - Permita associar notas dessa disciplina ao aluno

🧑‍🎓 Classe Aluno

Crie uma classe Aluno com os atributos:
    - nome
    - matricula
    - um atributo do tipo Disciplina (por exemplo: Disciplina disciplina;)

Implemente:
    - um método para cadastrar os dados do aluno (preencher nome e matrícula)
    - um método para listar os dados do aluno e, se existir disciplina associada, mostrar também as notas da disciplina.

📘 Classe Disciplina
    
Crie uma classe Disciplina com os atributos:
    - nome
    - codigo
    - nota1
    - nota2

Implemente:
    - um método para listar os dados da disciplina (nome, código, nota1 e nota2).

📋 Menu no main
No método main, exiba um menu no console com as opções:

1 - Cadastrar aluno
2 - Cadastrar disciplina
3 - Associar notas de disciplina para aluno
4 - Listar aluno com suas notas
0 - Sair

Leia a opção digitada pelo usuário

Use um switch para tratar a opção e chamar um método diferente para cada funcionalidade.
