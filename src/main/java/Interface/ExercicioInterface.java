package Interface;
import java.util.ArrayList;

        public class ExercicioInterface {
            public static void main(String[] args) {

                Animal cachorro1 = new Cachorro();

                cachorro1.emitirSom();

                Animal gato1 = new Gato();

                gato1.emitirSom();

                ArrayList<Animal> animais = new ArrayList<>();

                animais.add(new Cachorro());
                animais.add(new Gato());

                for (Animal animal : animais) {
                    animal.emitirSom();
                }
            ArrayList<Notificacao> notificacoes = new ArrayList<>();

                notificacoes.add(new Email());
                notificacoes.add(new SMS());

                for (Notificacao notificacao : notificacoes) {
                    notificacao.enviar("Sua compra foi aprovada!");
                }

                ArrayList<Veiculo> frota = new ArrayList<>();

                frota.add(new Carro());
                frota.add(new Moto());

                for (Veiculo veiculo : frota) {
                    veiculo.acelerar();
                    veiculo.ligar();
                }
            }
        }
