package aula22_10;

public class aula22_10 {
}

/*Factory

Questão 1. Explique com suas palavras qual problema o Factory resolve. O que aconteceria se os ifs que decidem qual objeto criar ficassem espalhados pelo main e por outras partes do programa, e depois surgisse um tipo novo?

O Factory centraliza a criacao dos objetos de forma a enxugar o codigo e evitar retrabalho. Ao surgir um novo tipo, é necessario implementar somente em 1 lugar e nao em varios. Sem o Factory abrimos brechas para erros. Além de ser um código mais dificil de manutencao.

Questão 2. O método da fábrica normalmente devolve o objeto criado com qual tipo?

• b) O tipo da interface (ex.: Animal)


Questão 3 (prática). Implemente a interface e as classes abaixo:

public interface Animal {
    void emitirSom();
}


public class Cachorro implements Animal {
    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }
}


public class Gato implements Animal {
    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }
}


Crie a classe AnimalFactory com um método getAnimal(String tipo):
• se o tipo for "cachorro", devolve um Cachorro;
• se o tipo for "gato", devolve um Gato.
No main, use a fábrica para criar um cachorro e um gato e chame emitirSom() nos dois. O main não pode ter new Cachorro() nem new Gato().



Adapter

Questão 4. Seu sistema precisa usar uma classe de pagamento de outra empresa, mas ela não implementa a sua interface. Por que não dá para simplesmente escrever implements na classe dela? O que você faz no lugar?

Nao é possivel escrever implements pois trata-se de uma classe a qual nao tenho acesso. Sendo assim é necessario adaptar para que a minha classe/interface acesse uma classe de fora.

Questão 5. Em um Adapter, onde fica a tradução (por exemplo, a conversão de dólar para real)?

• c) No método implementado da interface, dentro do adapter


Questão 6 (prática). O seu sistema usa esta interface:
public interface Pagamento {
    void pagar();
}
Você recebeu esta classe de outra empresa. Ela não pode ser alterada:
public class PayPalAPI {
    public void sendPayment() {
        System.out.println("Pagamento enviado pelo PayPal.");
    }
}
Crie a classe PayPalAdapter, para que o sistema consiga usar o PayPal como um Pagamento. Não precisa fazer nenhuma conversão: o método pagar() só precisa chamar o método da classe de fora.
No main:
1. Escreva, como comentário, a linha que tentaria usar PayPalAPI direto como Pagamento (a que não compila).
2. Crie uma variável do tipo Pagamento usando o adapter e chame pagar().


Facade

Questão 7. Explique com suas palavras qual problema o Facade resolve. Se quiser, use o exemplo do síndico do condomínio ou crie outro.
Ele permite com que todos os médotos sejam chamados na ordem correta sem que estejam dentro da main. Sendo um atalho para que o metodo acione as respectivas classes.

Questão 8. Marque V (verdadeiro) ou F (falso):
• (F) A fachada precisa implementar uma interface.
• (V) A fachada guarda as classes envolvidas no processo em atributos.
• (F) Depois que a fachada existe, é proibido usar as outras classes diretamente.


Questão 9 (prática). Você já tem estas três classes:
public class Despertador {
    public void desligar() {
        System.out.println("Despertador desligado.");
    }
}
public class Cafeteira {
    public void fazerCafe() {
        System.out.println("Café pronto.");
    }
}
public class Chuveiro {
    public void ligar() {
        System.out.println("Chuveiro ligado.");
    }
}
Crie a classe ManhaFacade com um método acordar() que desligue o despertador, faça o café e ligue o chuveiro, nessa ordem.
No main, use só a fachada: crie um objeto ManhaFacade e chame acordar().*/