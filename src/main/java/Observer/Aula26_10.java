package Observer;

public class Aula26_10 {
/* 1 - Qual problema o padrão Observer resolve? Dê um exemplo do dia a dia que funcione como ele.
Sem o Observer, os interessados precisariam ficar olhando o tempo todo se algo mudou, ou o sujeito precisaria conhecer e chamar cada interessado diretamente, e para acrescentar um novo seria preciso modificar o sujeito. O Observer resolve isso porque, quando o sujeito muda, ele avisa todos os observadores, e cada um faz a sua parte. Assim, é possível acrescentar ou remover observadores sem alterar o sujeito.

Um exemplo é o grupo de WhatsApp: o sujeito é o grupo e os observadores são os membros. Quando alguém manda uma mensagem, todos recebem, e quem sai do grupo para de receber as mensagens.

2 - No Observer, o que é o Subject  e o que é o Observer? Como o Subject avisa os observadores sem conhecer as classes concretas deles?

3 - Se você precisar adicionar um novo interessado, por exemplo um Entregador que também precisa saber quando o pedido muda de status, o que é preciso alterar na classe Pedido? Por quê?

4 - A interface já está pronta:

public interface ObservadorVoo {
void atualizar(String status);

}

a) Crie uma classe Passageiro que implementa ObservadorVoo e, no atualizar, imprime "Passageiro avisado: " + o status.

b) Crie uma classe Voo com uma lista de ObservadorVoo, um método adicionarObservador(ObservadorVoo o) e um método mudarStatus(String status), que chama o atualizar de todos da lista.

c) No main, crie um voo, adicione um passageiro e mude o status para "Embarque iniciado".

5 - Crie uma classe PainelAeroporto que também implementa ObservadorVoo e imprime "Painel: " + o status. No main, adicione ao voo um passageiro um painel, e mude o status para "Atrasado". Os dois devem ser avisados.


6 - Agora monte o mesmo padrão do zero, com outro tema:

a) Crie uma interface ObservadorEstoque com o método void atualizar(int quantidade).

b) Crie uma classe RegistroEstoque que implementa a interface e imprime "Nova quantidade: " + a quantidade.

c) Crie uma classe Estoque com uma lista de observadores, um método adicionarObservador e um método setQuantidade(int quantidade), que avisa todos da lista.

d) No main, adicione um RegistroEstoque e mude a quantidade duas vezes.*/
}
