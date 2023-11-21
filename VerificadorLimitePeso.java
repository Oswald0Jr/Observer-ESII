// Classe concreta Observer que verifica se o peso está dentro do limite
class VerificadorLimitePeso implements Observer {

    private static final double LIMITE_PESO = 5.0;

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof Double) {
            double novoPeso = (Double) arg;
            if (novoPeso <= LIMITE_PESO) {
                System.out.println("Novo peso dentro do limite.");
            } else {
                System.out.println("Novo peso fora do limite. Limite é de até 5 kg.");
            }
        } else {
            System.out.println("Erro: Valor não é do tipo esperado.");
        }
    }
}
