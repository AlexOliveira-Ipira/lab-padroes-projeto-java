package strategypadrao.contas;

import strategypadrao.estrategias.ContaStrategy;

public class Conta {
    private double saldo;

    private ContaStrategy strategy;

    public Conta(double saldo, ContaStrategy strategy) {
        this.saldo = saldo;
        this.strategy = strategy;
    }

    public double calcularTaxa() {
        return strategy.calcularTaxa(saldo);
    }
}
