package strategypadrao.estrategias;

public class ContaCorrenteStrategy implements ContaStrategy {

    @Override
    public double calcularTaxa(double saldo) {
        return 5.0;
    }

}
