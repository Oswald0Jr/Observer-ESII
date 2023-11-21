// Classe main
public class Main {

    public static void main(String[] args) {
        // Instanciando objetos
        BalancaObservable balanca = new BalancaObservable();
        ImpressoraPesoObserver impressoraObserver = new ImpressoraPesoObserver();
        VerificadorLimitePesoObserver verificadorObserver = new VerificadorLimitePesoObserver();

        // Adicionando Observers à BalancaObservable
        balanca.addObserver(impressoraObserver);
        balanca.addObserver(verificadorObserver);

        // Simulando uma mudança no peso e notificando Observers
        balanca.setPeso(4.5); // Dentro do limite
        balanca.setPeso(6.0); // Fora do limite
    }
}
