// Classe concreta Observer que imprime o valor do peso
class ImpressoraPeso implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof Double) {
            double novoPeso = (Double) arg;
            System.out.println("Novo peso na balança: " + novoPeso + " kg");
        } else {
            System.out.println("Erro: Valor não é do tipo esperado.");
        }
    }
}
