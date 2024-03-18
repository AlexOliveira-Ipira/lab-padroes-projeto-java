package strategypadrao.estrategias;

public class ContaPoupancaStrategy implements ContaStrategy {

    @Override
    public double calcularTaxa(double saldo) {
        return 0.01;
    }

}
