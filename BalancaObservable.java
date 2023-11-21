import java.util.Observable;
import java.util.Observer;

// Classe concreta Observable (sujeito)
class BalancaObservable extends Observable {

    private double peso;

    public void setPeso(double peso) {
        this.peso = peso;
        setChanged();
        notifyObservers(peso);
    }

    public double getPeso() {
        return peso;
    }
}
