# Lista-01-OO
Questão 2: Identifique as classes, atributos e métodos necessários implementar:<br>
a) Uma conta corrente que possui um número, um saldo, um status que informa se ela é especial ou não, um limite e um
conjunto de movimentações.<br>
b) Uma movimentação que possui uma descrição, um valor e uma informação se ela é uma movimentação de crédito ou
débito.<br>
c) Um banco que armazene um conjunto de contas e forneça métodos que permitam que sejam feitos criações de conta, saques (uma conta corrente só pode fazer saques desde que o valor não exceda o limite de saque‐limite +
saldo negativo), depósitos, emissão de saldo e extrato e transferência entre contas.<br><br>

Questão 3: De forma incremental, traduza o seguinte conjunto de classes em um programa Java. Importante: Não são
permitidas chamadas a System.in, System.out ou similares de dentro das classes criadas. Não é necessário fazer
implementação dos métodos, porém é necessário indicar o seu tipo de retorno adicionando “return 1” para inteiros, return
“texto” para String e assim por diante.<br>
a) Classe: Porta Atributos: aberta, cor, dimensaoX, dimensaoY, dimensaoZ Métodos: void abre(), void fecha(), void
pinta(String s), boolean estaAberta(). Para testar, crie uma porta, abra e feche a mesma, pinte‐a de diversas cores, altere
suas dimensões e use o método estaAberta para verificar se ela está aberta.<br>
b) Classe: Casa Atributos: cor, porta1, porta2, porta3 Método: void pinta(String s), int totalDePortas(), int
quantasPortasEstaoAbertas() int. Para testar, crie uma casa e pinte‐a. Crie três portas e coloque‐as na casa; abra e feche as
mesmas como desejar. Utilize o método quantasPortasEstaoAbertas para imprimir o número de portas abertas.<br>
c) Classe: Edificio Atributos: cor, totalDePortas, totalDeAndares, portas[] Métodos: void pinta(String s), int
quantasPortasEstaoAbertas(), void adicionaPorta(Porta p), int totalDePortas(), void adicionarAndar(), int totalDeAndares().
Para testar, crie um edifício, pinte‐o. Crie seis portas e coloque‐as no edifício através do método adicionaPorta, abra e feche‐
as como desejar. Utilize o método quantasPortasEstaoAbertas para imprimir o número de portas abertas e o método
totalDePortas para imprimir o total de portas em seu edifício. Cria alguns andares utilizado o método adicionarAndar e
retorne o número total de andares utilizando o método totalDeAndares.<br><br>

Questão 5: Crie uma classe chamada Invoice que possa ser utilizado por uma loja de suprimentos de informática para
representar uma fatura de um item vendido na loja. Uma fatura deve incluir as seguintes informações como atributos:<br>
• número do item faturado<br>
• a descrição do item<br>
• a quantidade comprada do item e<br>
• preço unitário do item.<br>
Sua classe deve ter um construtor que inicialize os quatro atributos. Se a quantidade não for positiva, ela deve ser
configurada como 0. Se o preço por item não for positivo ele deve ser configurado como 0.0. Forneça um método set e um
método get para cada variável de instância. Além disso, forneça um método chamado getInvoiceAmount que calcula o valor
da fatura (isso é, multiplica a quantidade pelo preço por item) e depois retorna o valor como um double. Escreva um
aplicativo de teste que demonstra as capacidades da classe Invoice.<br><br>

Questão 6: A fim de representar empregados em uma firma, crie uma classe chamada Empregado que inclui as três
informações a seguir como atributos:<br>
• um primeiro nome,<br>
• um sobrenome, e<br>
• um salário mensal.<br>
Sua classe deve ter um construtor que inicializa os três atributos. Forneça um método set e get para cada atributo. Se o
salário mensal não for positivo, configure-o como 0.0. Escreva um aplicativo de teste que demonstra as capacidades da
classe. Crie duas instâncias da classe e exiba o salário anual de cada instância. Então dê a cada empregado um aumento de
10% e exiba novamente o salário anual de cada empregado.<br><br>

Questão 7: Escreva em Java uma classe Contador, que encapsule um valor usado para contagem de itens ou eventos. A
classe deve oferecer métodos que devem:<br>
• Zerar;<br>
• Incrementar;<br>
• Retornar o valor do contador.<br><br>

Questão 8: Escreva em Java uma classe Ponto2D que represente um ponto no plano cartesiano. Além dos atributos por você
identificados, a classe deve oferecer os seguintes membros:<br>
• Construtores sobrecarregados que permitam a inicialização do ponto: i) Por default (sem parâmetros) na origem do espaço
2D; ii) Num local indicado por dois parâmetros do tipo double (indicando o valor de abcissa e ordenada do ponto que está
sendo criado);iii) Em um local indicado por outro ponto.<br>
• Métodos de acesso (getter/setter) dos atributos do ponto;<br>
• Métodos sobrecarregados de movimentação do ponto com os mesmos parâmetros indicados para os construtores;<br>
• Método de comparação semântica do ponto (equals);<br>
• Método de representação do objeto como String;<br>
• Método que permita calcular a distância do ponto que recebe a mensagem, para outro ponto;<br><br>

Questão 9: Escreva em Java uma classe que represente uma reta (y=ax+b). Forneça os seguintes membros de classe:<br>
• Construtores sobrecarregados que criem uma reta a partir de:<br>
o Dois valores, representando o coeficiente angular e o coeficiente linear da reta;<br>
o Dois pontos;<br>
• Métodos de acesso para o coeficiente angular e para o coeficiente linear da reta;<br>
• Um método que verifique se um ponto dado pertence a reta; <br>
• Um método que gere e retorne a representação String da reta;<br>
• Um método que dada uma outra reta, retorne o ponto de interseção  da reta dada ou null se as retas forem paralelas.<br><br>

Questão 10: Escreva em Java uma classe que represente um circulo no plano cartesiano. Forneça os seguintes membros de
classe:<br>
• Um construtor que receba o raio e um ponto (o centro do círculo);<br>
• Um construtor que receba o raio e posicione o círculo na origem do espaço cartesiano;<br>
• Métodos de acesso ao atributo raio do círculo;<br>
• Métodos inflar e desinflar, que, respectivamente, aumentam e diminuem o raio do círculo de um dado valor;<br>
• Métodos sobrecarregados, inflar e desinflar, que, respectivamente, aumentam e diminuem o raio do círculo de uma
unidade;<br>
• Métodos sobrecarregados mover, que:<br>
o por default (sem parâmetros) levam o círculo para a origem do espaço 2D;<br>
o movem o círculo para um local indicado por dois parâmetros do tipo double (indicando o valor de abcissa e
ordenada do ponto para onde o círculo se move);<br>
o movem o círculo para o local indicado por outro ponto.<br>
• Método que retorna a área do círculo<br><br>

Questão 11: Crie uma classe para representar datas. Represente uma data usando três atributos: o dia, o mês, e o ano. Sua
classe deve ter um construtor que inicializa os três atributos e verifica a validade dos valores fornecidos. Forneça um
construtor sem parâmetros que inicializa a data com a data atual fornecida pelo sistema operacional. Forneça um método set
um get para cada atributo. Forneça o método toString para retornar uma representação da data como string. Considere que
a  data deve ser formatada mostrando o dia, o mês e o ano separados por barra (/). Forneça uma operação para avançar
uma data para o dia seguinte. Escreva um aplicativo de teste que demonstra as capacidades da classe. Garanta que uma
instância desta classe sempre esteja em um estado consistente. 
