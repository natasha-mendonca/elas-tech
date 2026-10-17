public class TesteSingleton {

/*1. O que o padrão Singleton garante?

b) Que exista apenas um objeto da classe no programa

2. Por que o construtor de um Singleton é private?

Para impedir que outras clases criem novos objetos utilizando o operador new.

3. Complete a lacuna:

java
private ______ Configuracao instancia;

c) static

4. O que acontece se alguém tentar escrever isto fora da classe?

java
Configuracao c = new Configuracao();

Acontece erro visto que o construtor nao pode ser criado fora da classe.

5. Qual é a forma correta de obter o objeto de um Singleton chamado Configuracao?
b) Configuracao.getInstancia()


6.  Crie uma classe Singleton chamada ContadorVisitas que:
-tenha um atributo total, começando em 0;
-tenha um método registrarVisita() que soma 1 ao total;
-tenha um método getTotal() que devolve o total.

Depois, no main, obtenha ele duas vezes em variáveis diferentes pagina1 e pagina2, registre visitas usando as duas, e imprima o total. O resultado deve mostrar que as duas variáveis usam o mesmo contador.

Exemplo de saída esperada:

Total de visitas: 3

Dica: Para instanciar(criar) não use o new. Classe v1 = Classe.getInstancia();


7. Crie uma classe Singleton chamada Carrinho que:
-tenha um atributo quantidadeItens, começando em 0;
-tenha um método adicionarItem() que soma 1 à quantidade;
-tenha um método getQuantidadeItens() que devolve a quantidade.

No main, obtenha o carrinho em duas variáveis diferentes, telaProdutos e telaPromocoes, adicione itens usando as duas, e imprima a quantidade final. O resultado deve mostrar que as duas telas usam o mesmo carrinho.

Exemplo de saída esperada:

Itens no carrinho: 4*/
}