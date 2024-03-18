package strategypadrao;

import strategypadrao.contas.Conta;
import strategypadrao.estrategias.ContaPoupancaStrategy;
import strategypadrao.estrategias.ContaStrategy;

public class Main {
    public static void main(String[] args) {
        ContaStrategy contaCorrenteStrategy = new strategypadrao.estrategias.ContaCorrenteStrategy();
        Conta contaCorrente = new Conta(1000, contaCorrenteStrategy);
        System.out.println("Taxa da conta Corrente: " + contaCorrente.calcularTaxa());

        ContaStrategy contaPoupancaStrategy = new ContaPoupancaStrategy();
        Conta contaPoupanca = new Conta(2000, contaPoupancaStrategy);
        System.out.println("Taxa da Conta Poupança: " + contaPoupanca.calcularTaxa());

    }
}
